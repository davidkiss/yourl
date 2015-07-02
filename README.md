# yourl
Sample url-shortener web application to demonstrate how to build web applications using Java + Spring Boot.

To run it using maven (http://maven.apache.org):
```sh
$ mvn spring-boot:run
```

## Components

### src/main/java/com/yourl/YourlApplication
This is the main class of the application that initializes the Spring context including all the Spring components in this project and starts the web application inside an embedded Apache Tomcat (http://tomcat.apache.org) web container.

### src/main/java/com/yourl/controller/UrlController
Following the MVC paradigm, this class serves as the Controller that processes HTTP requests. Each method annotated with @RequestMapping maps to a specific HTTP endpoint:
- showForm(): displays the home screen where users can enter url to be shortened
- redirectToUrl(): redirects from shortened url to the original one
- shortenUrl(): as the name suggests it creates a shortened version of the provided url

### src/main/java/com/yourl/controller/dto/ShortenUrlRequest
The shorten url request is mapped into this POJO (Plain Old Java Object) by Spring while it runs the validations defined by the annotations on the fields.

### src/main/resources/templates/shortener.html
This is a Thymeleaf (http://www.thymeleaf.org/) based template that is used to render the home screen of the application using the data (Model) provided by the UrlController class
