using UnityEngine;

/// <summary>
/// Πρόγραμμα γεννήτριας πλατφορμών.
/// </summary>
public class platformgenerator : MonoBehaviour {

    // Μεταβλητές
    public GameObject platform;
    public Transform generationpoint;
    public Transform heightmaxpoint;
    public GameObject[] theplatforms;
    public Transform heightminpoint;

    private int distancebetween;
    private int distancebetweencoins;
    public int distancemin;
    public int distancemax;
    private int platformselector;

    private float platformwidth;
    private float heightmin;
    private float heightmax;
    private float[] platformmwidths;
    public float maxheightchange;
    private float heightghange;
    
    // Συναρτήσεις
	void Start () 
    {
        platformmwidths = new float[theplatforms.Length];

        for (int i = 0; i < theplatforms.Length; i++)
        {
            platformmwidths[i] = theplatforms[i].GetComponent<BoxCollider2D>().size.x;
        }

        heightmin = heightminpoint.position.y;
        heightmax = heightmaxpoint.position.y;

    }

	void Update () 
    {
        
        if (transform.position.x<generationpoint.position.x)
        {
            distancebetween = Random.Range(distancemin, distancemax);
            platformselector = Random.Range(0, theplatforms.Length);
            heightghange = transform.position.y+Random.Range(maxheightchange,-maxheightchange);

            if (heightghange>heightmax)
            {
                heightghange = heightmax;

            }else if (heightghange<heightmin)
            {
                heightghange = heightmin;
            }

            transform.position = new Vector3 (transform.position.x + platformmwidths[platformselector] + distancebetween, heightghange, transform.position.z);
            Instantiate(theplatforms[platformselector], transform.position, transform.rotation);
        }	
	}
}
