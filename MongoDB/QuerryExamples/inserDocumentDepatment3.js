db.getCollection("department").insertOne({
    "_id" : ObjectId(),
    "identifier" : 1.0,
    "name" : "Διεύθυνση Διοικητικού",
    "subdepartment" : [
        {
            "_id" : ObjectId(),
            "name" : "Τμήμα Διοικητικού Προσωπικού"
        },
        {
            "_id" : ObjectId(),
            "name" : "Τμήμα Διδακτικού Προσωπικού"
        },
        {
            "_id" : ObjectId(),
            "name" : "Τμήμα ΕΤΕΠ"
        }
    ],
    "categories" : [
        {
            "_id" : ObjectId(),
            "name" : "Προκηρύξεις διοικητικού προσωπικού"
        },
        {
            "_id" : ObjectId(),
            "name" : "Σεμινάρια"
        },
        {
            "_id" : ObjectId(),
            "name" : "Προκηρύξεις ΔΕΠ"
        },
        {
            "_id" : ObjectId(),
            "name" : "Προκηρύξεις ΕΔΙΠ"
        },
        {
            "_id" : ObjectId(),
            "name" : "Προκηρύξεις ΕΤΕΠ"
        }
    ]
});
