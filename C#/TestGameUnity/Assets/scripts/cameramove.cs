using UnityEngine;

/// <summary>
/// Πρόγραμμα που μετακινεί την κάμερα με συγκεκριμένη ταχύτητα
/// </summary>
public class cameramove : MonoBehaviour {

    //Μεταβλητές
    public Rigidbody2D rb;
    public float speed;
    public float speedmultiplier;
    public float speedincreasemilestone;
    private float speedmilestonecount;

    //Συναρτήσεις
    void Start () {
        
        rb = GetComponent<Rigidbody2D>();
        speedmilestonecount = speedincreasemilestone;
	}
	void Update () {
        if (transform.localPosition.x+127.8 > speedmilestonecount)
        {
            speedmilestonecount = speedincreasemilestone;
            speedincreasemilestone += speedincreasemilestone * speedmultiplier;
            speed = speed * speedmultiplier;
        }
        rb.velocity = new Vector2(speed, rb.velocity.y);   
    }
}
