db.getCollection("users").updateMany(
    {
        'name': "Kostas"
    },{ $push: {
            "send_email" : false,
             "verified" : false,
             "roles" : [ ],
             "email" : "x1@gmail.com"
       }
    });
