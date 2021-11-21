printjson(db.people.aggregate([
  {$match : {nationality:"Poland", sex:"Female"}},
  {$unwind : "$credit"},
  {$group : {
    _id:"$credit.currency",
    avg:{$avg:"$credit.balance"},
    sum:{$sum:"$credit.balance"}
  }}
  ]).toArray())