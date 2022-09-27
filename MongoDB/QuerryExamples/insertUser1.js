db.getCollection("users").insertOne({
    "_id" : ObjectId(),
    "username" : "akosta",
    "password" : "1234",
    "user_category" : {
        "identifier" : "5",
        "name" : "ΔΕΠ"
    },
    "lastname" : "Aggelou",
    "firstname" : "Kostas",
    "subscription_list" : [
        ObjectId("62dc290bbca62e3bfc4ca065"),
        ObjectId("62dc2a7dbca62e3bfc4ca06b")
    ]
});
