using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class platformattach : MonoBehaviour {

    public GameObject platform;
    public GameObject player;

    void OnTriggerEnter()
    {
        player.transform.parent = platform.transform;
    }

}
