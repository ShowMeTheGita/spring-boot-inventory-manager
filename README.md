# Inventory Manager - Spring Boot

A simple website where you can add, edit, delete and search for products. RESTful server-side service built in Java utilizing Spring Boot, data persists locally via connection to a MySQL database. Front-end consisting of HTML, CSS and JS. Consumes the REST web service utilizing jQuery's AJAX implementation.

### Preview: 
<br/>   
  
  
![gif](https://media2.giphy.com/media/HXEj0lVoDlrkorBzSp/giphy.gif)

### Why?

Up until this project I had only built a RESTful web service utilizing Spring MVC. That meant no embedded Tomcat and headaches with the config files. Then I read about Spring Boot and decided to give it a go.  
The website is far from perfect and the visual of it is lacking, but the idea here was to simply play around with mostly the back-end after many hours of Spring-Boot tutorials and simpler hands-on projects. :relieved:

---

#### Tech

* Java
* Spring Boot (plus all embedded software such as Maven and Tomcat)
* MySQL
* HTML
* CSS
* JavaScript
* jQuery


#### Reqs

* An IDE that supports Spring-Boot, such as IntelliJ Ultimate
* MySQL server installed

You'll need to create a database named "invman" beforehand and give it the privileges so that it matches the username and password on the [application.properties](https://github.com/ShowMeTheGita/spring-boot-inventory-manager/blob/master/src/main/resources/application.properties) file. You can find out how to do that [here](https://spring.io/guides/gs/accessing-data-mysql/) under "Create the Database" section.  
Afterwards, with the terminal move into the "inventory-manager" package and type the following command:  

    ./mvnw spring-boot:run



After it's done simply access the website locally: http://localhost:8080/invman.
