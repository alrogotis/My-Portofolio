using UnityEngine;
using System.Collections;

/// <summary>
/// Πρόγραμμα διαχείρισης του αντικειμένου Spike.
/// </summary>
public class spike : MonoBehaviour {

    public AudioSource playerdeath;

    private void OnCollisionEnter2D(Collision2D other)
    {
        if (other.gameObject.name == "player")
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
