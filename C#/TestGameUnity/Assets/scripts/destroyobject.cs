using UnityEngine;
/// <summary>
/// Πρόγραμμα που καταστρέφει, ένα αντικείμενο, όταν έχει περάσει από την οθόνη.
/// </summary>
public class destroyobject : MonoBehaviour {
    
    public GameObject destroypoint;

	void Start () 
    {
        destroypoint = GameObject.Find("destroy point");	
	}

	void Update () 
    {
        
        if (transform.position.x<destroypoint.transform.position.x)
        {
            Destroy(gameObject);
        }
        
	}
}
