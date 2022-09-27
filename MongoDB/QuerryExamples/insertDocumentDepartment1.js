db.getCollection("department").insertOne({
    "_id" : ObjectId(),
    "identifier" : 4.0,
    "name" : "Διεύθυνση Οικονομικών Υπηρεσιών",
    "subdepartment" : [
        {
            "_id" : ObjectId(),
            "name" : "Τμήμα Διαχείρισης Περιουσίας"
        },
        {
            "_id" : ObjectId(),
            "name" : "Τμήμα Προμηθειών"
        }
    ],
    "categories" : [
        {
            "_id" : ObjectId(),
            "name" : "Βραβεία-Προκηρύξεις κληροδοτημάτων"
        },
        {
            "_id" : ObjectId(),
            "name" : "Υποτροφίες"
        },
        {
            "_id" : ObjectId(),
            "name" : "Προκηρύξεις"
        },
        {
            "_id" : ObjectId(),
            "name" : "Συμβάσεις"
        }
    ]
});
