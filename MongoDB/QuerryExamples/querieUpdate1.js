db.getCollection('department').updateOne(
    {name:"Διεύθυνση Διοικητικού"},
    {$set: {
        'identifier':2
    }
    });
