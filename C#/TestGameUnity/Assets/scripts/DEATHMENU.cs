using UnityEngine;
using UnityEngine.SceneManagement;

/// <summary>
/// Πρόγραμμα που διαχειρίζεται το μενού του Game Over
/// </summary>
public class DEATHMENU : MonoBehaviour {
    //Μεταβλητές
    public GameObject deathmenu;
    public GameObject pausemenu;

    // Συναρτήσεις
    public void restartgame()
    {
        
        SceneManager.LoadScene(SceneManager.GetActiveScene().name);
        deathmenu.gameObject.SetActive(false);
        pausemenu.gameObject.SetActive(false);
        Time.timeScale = 1f;

    }

    public void quittomain()
    {
        SceneManager.LoadScene(0);
    }
	
}
