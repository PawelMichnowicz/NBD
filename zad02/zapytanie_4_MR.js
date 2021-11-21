db.people.mapReduce(
    function () {
        let bmi = this.weight / Math.pow(this.height / 100, 2);
        emit(this.nationality, {
            bmi: bmi,
            min: 0,
            max: 0,
            counter: 1
        });
    },
	
    function (key, value) {
        let reduced_val = {
            sum: 0,
            min: 9999999,
            max: 0,
            counter: 0
        };
        value.forEach(element => {
            if (reduced_val.min > element.bmi) {
                reduced_val.min = element.bmi;
            } else if (reduced_val.max < element.bmi) {
                reduced_val.max = element.bmi;
            }
            reduced_val.sum += element.bmi;
            reduced_val.counter += 1;
        });
       
		return {
                avg_bmi: reduced_val.sum / reduced_val.counter,
                min_bmi: reduced_val.min,
                max_bmi: reduced_val.max,
            };
    },
   { out: 'bmi_values' }
);

printjson(db.bmi_values.find().toArray());