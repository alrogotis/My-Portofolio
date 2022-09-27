db.getCollection("users").insertOne({
    "_id" : ObjectId(),
    "username" : "ckosta",
    "password" : "1234",
    "user_category" : {
        "identifier" : "5",
        "name" : "Προπτυχιακός Φοιτητής"
    },
    "surname" : "Coco",
    "name" : "Kostas",
    "subscription_list" : [
        ObjectId("62dc290bbca62e3bfc4ca065"),
        ObjectId("62dc2a7dbca62e3bfc4ca06b")
    ]
});
