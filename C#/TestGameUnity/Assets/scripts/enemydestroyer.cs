using UnityEngine;

/// <summary>
/// Πρόγραμμα που καταστρέφει έναν εχθρό, όταν τον έχει χτυπήσει ο παιχτής.
/// </summary>
public class enemydestroyer : MonoBehaviour {

    //Μεταβλητές
    public int scoretogive;
    public AudioSource enemuhit;
    private scoremanager thescoremanager;
    
    //Συναρτήσεις
    void Start()
    {
        thescoremanager = FindObjectOfType<scoremanager>();
    }

    public void OnCollisionEnter2D(Collision2D collision)
    {
        if (collision.transform.tag == "enemy")
        {
            Instantiate(enemuhit);
            thescoremanager.addscore(scoretogive);
            Destroy(collision.gameObject);
        }

    }

}
