db.getCollection("department").insertOne({
    "_id" : ObjectId(),
    "identifier" : 1.0,
    "name" : "Διεύθυνση Τεχνικών Υπηρεσιών",
    "subdepartment" : [
        {
            "_id" : ObjectId(),
            "name" : "Τμήμα Γραμματειας"
        },
        {
            "_id" : ObjectId(),
            "name" : "Τμήμα Μελετών"
        },
        {
            "_id" : ObjectId(),
            "name" : "Τμήμα Εκτέλεσης Έργων"
        }
    ],
    "categories" : [
        {
            "_id" : ObjectId(),
            "name" : "Γενικές πληροφορίες"
        },
        {
            "_id" : ObjectId(),
            "name" : "Βλάβες"
        },
        {
            "_id" : ObjectId(),
            "name" : "Ηλεκτρολογικές μελέτες"
        },
        {
            "_id" : ObjectId(),
            "name" : "Κτιριακές μελέτες"
        },
        {
            "_id" : ObjectId(),
            "name" : "Προκηρύξεις"
        },
        {
            "_id" : ObjectId(),
            "name" : "Εκτέλεση έργων"
        }
    ]
});
