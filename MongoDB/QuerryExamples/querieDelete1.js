db.getCollection('department').updateOne(
    {'identifier': 2},
    {$pull: {'subdepartment':{'name': "Τμήμα Εκτέλεσης Έργων"}}}
);

