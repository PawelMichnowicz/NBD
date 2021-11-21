db.people.mapReduce(
    function () {
        emit(this.job, null);
    },
	
    function (key, value) {
        return key;
    },
    {
        out: "jobs"
    }
);
printjson(db.jobs.find().toArray());