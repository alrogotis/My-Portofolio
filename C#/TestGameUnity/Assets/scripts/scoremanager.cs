using UnityEngine;
using UnityEngine.UI;

/// <summary>
/// Πρόγραμμα διαχείρισης του Score του παιχνιδιού.
/// </summary>
public class scoremanager : MonoBehaviour {

    public Text scoretext;
    public Text highscoretext;
    public float scorecount;
    public float hiscorecount;
    public float pointspersecond;
    public bool scoreincreasing;

	void Start () {
        highscoretext.text = "High Score: " +Mathf.Round(PlayerPrefs.GetFloat("highscore", 0));
    }
    void Update () {
        if (scoreincreasing)
        {
            scorecount += pointspersecond * Time.deltaTime;
        }
        if (scorecount>hiscorecount)
        {
            hiscorecount = scorecount;
            //highscoretext.text = "High Score: " + Mathf.Round(hiscorecount);
            if (hiscorecount>PlayerPrefs.GetFloat("highscore",0))
            {
                PlayerPrefs.SetFloat("highscore", hiscorecount);
                highscoretext.text = "High Score: " + Mathf.Round(hiscorecount);
            }
        }
        scoretext.text = "Score: " + Mathf.Round(scorecount);

    }
    public void addscore(int pointstoadd)
    {
        scorecount += pointstoadd;
    }
    
    
}
