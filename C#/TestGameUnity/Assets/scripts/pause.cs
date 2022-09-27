using UnityEngine;
using UnityEngine.SceneManagement;

/// <summary>
/// Πρόγραμμα που διαχειρίζεται το περιβάλλον pause.
/// </summary>
public class pause : MonoBehaviour {

    public GameObject pausemenu;
   
    public void dopause()
    {
        Time.timeScale = 0f;
        pausemenu.gameObject.SetActive(true);
        GetComponent<scoremanager>().scoreincreasing = false;
        
    }

    public void resume()
    {
        pausemenu.gameObject.SetActive(false);
        Time.timeScale = 1f;
    }

    public void restart()
    {
        Time.timeScale = 1f;
        SceneManager.LoadScene(SceneManager.GetActiveScene().name);
        GetComponent<DEATHMENU>().deathmenu.gameObject.SetActive(false);
        pausemenu.gameObject.SetActive(false);
    }

    public void Quit()
    {
        Time.timeScale = 1f;
        SceneManager.LoadScene(0);
    }

}
