printjson(db.people.aggregate([
  {$project:{
    rok:{$year:"$birth_date"},
    first_name:1, last_name:1, _id:0, location:{city:1}
  }},
  {$match:{rok:{"$gte":2000}}}]).toArray())