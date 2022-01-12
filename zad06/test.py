import riak
riakClient = riak.RiakClient(pb_port=8087)

bucket = riakClient.bucket('s24063_cw8')

# dodanie
student = {"NBD": True, "name": "Paweł Michnowicz"}
key = bucket.new('student', data=student)
key.store()
print('Dodano studenta')


# pobranie i wypisanie
retrievedStudent = bucket.get('student')
print('Dane nowo dodanego studenta: ' + str(retrievedStudent.data))


# modyfikacja
retrievedStudent.data['NBD'] = False
retrievedStudent.store()

retrievedStudent2 = bucket.get('student')
print('Zmodyfikowano pole NBD: ' + str(retrievedStudent2.data))


# usuwanie
retrievedStudent2.delete()
print('Usunieto studenta... proba pobrania jego danych...')
retrievedStudent3 = bucket.get('student')
print('Pobrany usuniety student: ' + str(retrievedStudent3.data))
