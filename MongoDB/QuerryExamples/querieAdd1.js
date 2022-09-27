db.getCollection('department').updateOne(
    {'identifier': 2},
    {$push: {
        'subdepartment':{
            '_id': new ObjectId(),
            'name':'Τμήμα Έργων'
            },
        }
    });
