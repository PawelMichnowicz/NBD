db.people.mapReduce(
  function () {
    this.credit.forEach(element => {
      emit(element.currency, element.balance);
    });
  },
  
  function (key, values) {
    return Array.sum(values);
  },
  
  { out: 'sums' }
);

printjson(db.sums.find().toArray());