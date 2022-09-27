using UnityEngine;

/// <summary>
/// Πρόγραμμα που καταστρέφει ένα αντικείμενο σε συγκεκριμένο χρόνο
/// </summary>
public class destroyintime : MonoBehaviour {
 
    [SerializeField]
    float destroytime = 2f;

	void Start () {
        Destroy(gameObject, destroytime);
	}	
}
