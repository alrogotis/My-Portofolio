using UnityEngine;

/// <summary>
/// Πρόγραμμα παρακολούθησης της κάμερας του παίκτη.
/// </summary>

public class camerafollow : MonoBehaviour {
    public Transform target;
    public float speed = 0.125f;
    public Vector3 offset;

    private void LateUpdate()
    {
        transform.position = target.position + offset;
    }


}
