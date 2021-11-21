db.people.mapReduce(
    function() {
			this.credit.forEach(element => emit(element.currency, { balance: parseFloat(element.balance), 
																	sum: 0, 
																	avg: 0 }));
		},
	
    function (key, values) {
        let reduced_val = {
            sum: 0,
            counter: 0
        };
		
        values.forEach(element => {
            reduced_val.sum += element.balance;
            reduced_val.counter += 1;
        });
		
        return {
                avg_balance: reduced_val.sum / reduced_val.counter,
                total_balance: reduced_val.sum
            };
    },
	
    {
        out: "polish_women",
        query: {
            nationality: "Poland",
            sex: "Female"
        },
        
    }
);

printjson(db.polish_women.find().toArray());