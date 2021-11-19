printjson(db.people.insert({
    "sex" : "Male",
    "first_name" : "Pawel",
    "last_name" : "Michnowicz",
    "job" : "Student",
    "email" : "michnowicz013@gmail.com",
    "location" : {
        "city" : "Warszawa",
        "address" : {
            "streetname" : "Czestochowska",
            "streetnumber" : "17"
        }
    },
    "description" : "To ja",
    "height" : 170.00,
    "weight" : 70.00,
    "birth_date" : new Date("1997-05-18T16:00:00Z"),
    "nationality" : "Polska",
    "credit" : [
        {
            "type" : "pko",
            "number" : "2352352",
            "currency" : "PLN",
            "balance" : "420.00"
        }
    ]
}))