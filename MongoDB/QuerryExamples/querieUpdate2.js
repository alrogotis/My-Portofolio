db.getCollection('department').update(
    {
        'identifier': 2,
        'subdepartment.name': "Τμήμα Έργων"},
        { $set: { 'subdepartment.$.name': 'Τμήμα Εκτέλεσης Έργων'}
        });
