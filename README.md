
# spring-rest
## A simple REST app using MySQL

The Postman test suite is in `test` and should import with little trouble. 

It expects a MySQL account with the credentials indicated in `application.properties`
```
spring.datasource.url=jdbc:mysql://hibernate:hibernate@localhost:3306/books
spring.jpa.hibernate.ddl-auto = update
```
So either create one or change the setting in `application.properties`
The second line tells it to create the table if it doesn't exist, and also to not destroy it at the end of the session.


Standard REST. Note that the final `/` is obligatory.
* `GET localhost:8080/books/` - list all books
* `GET localhost:8080/books/7` - get the book with id 7
* `POST localhost:8080/books/` - write the book that&rsquo;s in the message payload
* `PUT localhost:8080/books/` - modify the book with the id and data given in the payload
* `DELETE localhost:8080/books/7` - as you would imagine

GET and PUT give a 404 if the id is missing. 

DELETE does not, because in that case missing means deleted.  
       


