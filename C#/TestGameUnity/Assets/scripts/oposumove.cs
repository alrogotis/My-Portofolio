using UnityEngine;

/// <summary>
/// Πρόγραμμα που διαχειρίζεται τις κινήσεις του εχθρού.
/// </summary>
public class oposumove : MonoBehaviour {

    // Μεταβλητές
    Rigidbody2D rb;

    public GameObject platformleft;
    public GameObject platformright;
    public GameObject opposum;

    public bool left;
    private bool facingright;

    //Συναρτήσεις
    void Start () 
    {
        rb = GetComponent<Rigidbody2D>();
        left = true;       
	}

    void Update()
    {
        if(opposum.transform.position.x>platformleft.transform.position.x)
        {
            
            rb.velocity = new Vector2(-1, rb.velocity.y);
        }
        else
        {
            left = false;
            rb.velocity = new Vector2(0, rb.velocity.y);
            
        }

        if (opposum.transform.position.x < platformright.transform.position.x && left==false)
        {

            rb.velocity = new Vector2(1, rb.velocity.y);
        }
        else
        {
            left = true;
            rb.velocity = new Vector2(-1, rb.velocity.y);
        }

        if (rb.velocity.x > 0 && !facingright || rb.velocity.x < 0 && facingright)
        {
            flip();
        }
            
    }

    public void flip()
    {
        {
            facingright = !facingright;
            transform.Rotate(Vector3.up * 180);
        }
    }
    
}
