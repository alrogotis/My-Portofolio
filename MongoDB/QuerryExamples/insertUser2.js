db.getCollection("users").insertOne({
    "_id" : ObjectId(),
    "username" : "akosta",
    "password" : "1234",
    "user_category" : {
        "identifier" : "5",
        "name" : "ΔΕΠ"
    },
    "surname" : "Aggelou",
    "name" : "Kostas",
    "subscription_list" : [
        ObjectId("62dc3bc8bca62e3bfc4ca0ad"),
        ObjectId("62dc3bc8bca62e3bfc4ca0ae")
    ]
});
