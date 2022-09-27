using UnityEngine;

/// <summary>
/// Πρόγραμμα που Διαχειρίζεται τα coins του παιχνιδιού
/// </summary>
public class coinmanager : MonoBehaviour {
    
    // Μεταβλητές
    public AudioSource cointake;
    public int scoretogive;
    private scoremanager thescoremanager;

    //Συναρτήσεις
	void Start () {
        
        thescoremanager = FindObjectOfType<scoremanager>();

	}
    
    private void OnTriggerEnter2D(Collider2D other)
    {
        
        if(other.gameObject.name=="player")
        {
            
            Instantiate(cointake);
            thescoremanager.addscore(scoretogive);
            Destroy(gameObject);   
        }
    }
}
