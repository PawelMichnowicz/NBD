db.people.mapReduce(
  function () {
    emit(this.sex, { weight: this.weight, height: this.height });
  },

  function (key, values) {
    let weight = 0;
    let height = 0;
	let sum = 0;

    values.forEach(element => {
      weight += element.weight;
      height += element.height;
	  sum += 1;
    });

    return {
      averageWeight: weight / sum,
      averageHeight: height / sum
    };
  },
  { out: 'averages' }
);

printjson(db.averages.find().toArray());