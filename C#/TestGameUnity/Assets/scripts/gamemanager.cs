using UnityEngine;

/// <summary>
/// Πρόγραμμα που βάζει ένα τέλος, στο παιχνίδι.
/// </summary>
public class gamemanager : MonoBehaviour {
    //Μεταβλητές
    public bool gameend=false;
    public float restarttime;
    public GameObject deathmenu1;

    //Συναρτήση που κάνει, game over
    public void endgame()
    {
        if (gameend==false)
        {
            gameend = true;
            GetComponent<scoremanager>().scoreincreasing = false;
            deathmenu1.gameObject.SetActive(true);
            
        }    
    }
}
