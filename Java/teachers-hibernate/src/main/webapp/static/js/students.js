$(document).ready(function() {
    $('#btn').on('click', function() {
        fetchStudentsFromJSON($('#searchInput').val().trim())
    })
})

function fetchStudentsFromJSON(lastname) {
    let xhr = new XMLHttpRequest()

    xhr.open('GET', `/teachers-hibernate/students?lastname=${lastname}`, true)

    xhr.timeout = 5000
    xhr.ontimeout = (e) => onAPIError()

    xhr.onreadystatechange = function() {
        if (xhr.readyState === 4) 
        {
            if (xhr.status === 200) {
               
                handleResults(JSON.parse(xhr.responseText))
            } else {
                onAPIError()
            }
        }
    }
    
    xhr.send()
}


function handleResults(response) {
    let studentsList = response;
   
    if (jQuery.isEmptyObject(response)) {
    	$(".students-list").html("No student was found");
    } else {   
	    let output = "<tr><th>Id</th><th>Όνομα</th><th>Επώνυμο</th></tr>";
	
	    for (let student of studentsList) {
	        output += "<tr><td>"
	        + student.id
	        + "</td><td>"
	        + student.firstname
	        + "</td><td>"
	        + student.lastname
	        + "</td></tr>";
	    }
	
	    $(".students-list").html(output);
    }
}


function onAPIError() {
    alert('API Error')
}