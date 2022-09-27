using UnityEngine;
using System.Collections;
using UnityStandardAssets.CrossPlatformInput;

/// <summary>
/// Πρόγραμμα που διαχειρίζεται τα Controls και την κίνηση του παίχτη.
/// </summary>
public class move : MonoBehaviour {

    //Μεταβλητές
    public AudioSource jumpsound;
    public AudioSource rocksound;
    public AudioSource enemyhit;
    public AudioSource playerdeath;

    Rigidbody2D rb;
    private Animator myAnimator;
    public Transform barrel;
    public Rigidbody2D bullet;
    private scoremanager thescoremanager;

    float dirx;
    public float movespeed = 4f, jumbforce = 500f;
    public float jumptime;
    public float bulletspeed;

    private bool facingright;
    private bool doublejump;

    private int jumpcount;
    public int scoretogive;

    // Συναρτήσεις
    void Start () 
    {

        facingright = true;
        rb = GetComponent<Rigidbody2D>();
        myAnimator = GetComponent<Animator>();
        doublejump = true;
        jumpcount = 1;
        thescoremanager = FindObjectOfType<scoremanager>();

    }

	void Update () 
    {
        float dirx = CrossPlatformInputManager.GetAxis("Horizontal");
        rb.velocity = new Vector2(dirx * movespeed, rb.velocity.y);

        if (Input.GetKey(KeyCode.LeftArrow))
        {
            rb.velocity = new Vector2(-1, rb.velocity.y);
        }

        if (Input.GetKey(KeyCode.RightArrow))
        {
            rb.velocity = new Vector2(1, rb.velocity.y);
        }

        if (CrossPlatformInputManager.GetButtonDown("jump")||Input.GetKeyDown(KeyCode.Space))
        {
            Instantiate(jumpsound);
            dojumb();
        }

        if (rb.velocity.x > 0 && !facingright || rb.velocity.x < 0 && facingright)
        {
            flip();
        }
           
        if (rb.velocity.x == 0 && rb.velocity.y == 0)
        {
           idle();
        }

        if (CrossPlatformInputManager.GetButton("jump") || Input.GetKey(KeyCode.Space))
        {
           jump();
        }

        if (rb.velocity.x != 0 && rb.velocity.y == 0)
        {
           run();
        }

        if(rb.position.y<-61 && Time.timeScale>0f)
        {
            deathact();
        }

        if (jumpcount==1)
        {
            doublejump = true;
        }

        if(jumpcount==2)
        {
            doublejump = false;
        }

        if(CrossPlatformInputManager.GetButtonDown("ATTACK"))
        {
            Instantiate(rocksound);
            attack();
        }
    }

    // Βοηθητικές Συναρτήσεις
    public void flip()
    {
        {
            facingright = !facingright;
            transform.Rotate(Vector3.up * 180); 
        }
    }

    public void dojumb()
    {
        if (rb.velocity.y == 0)
        {
            rb.AddForce(new Vector2(0, jumbforce), ForceMode2D.Force);
            jumpcount = 1;
        }
        if (rb.velocity.y!=0 && doublejump==true)
        {
            rb.AddForce(new Vector2(0, jumbforce), ForceMode2D.Force);
            jumpcount = 2;
        }   
    }

    public void run()
    {
        myAnimator.SetTrigger("run");
    }

    private void idle()
    {
        myAnimator.SetTrigger("idle");
    }

    private void jump()
    {
        myAnimator.SetTrigger("jump");
    }

    public void attack()
    {
        var firedbullet = Instantiate(bullet, barrel.position, barrel.rotation);
        firedbullet.AddForce(barrel.up * bulletspeed);
    }

    public void OnCollisionEnter2D(Collision2D collision)
    {
        if (collision.gameObject.name == "opossum-6" && rb.velocity.y<0)
        {
            Instantiate(enemyhit);
            thescoremanager.addscore(scoretogive);
            Destroy(collision.gameObject);
        }
        if (collision.gameObject.name == "opossum-6" && rb.velocity.y>0 || collision.gameObject.name == "opossum-6" && rb.velocity.y == 0)
        {
            deathact();
        }
    }
    public void deathact()
    {
        StartCoroutine("death");
    }
    public IEnumerator death()
    {
        yield return new WaitForSeconds(0.1f);
        Instantiate(playerdeath);
        FindObjectOfType<gamemanager>().endgame();
        Time.timeScale = 0f;
    }
}
