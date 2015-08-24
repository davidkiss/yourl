# yourl
Sample url-shortener web application to demonstrate how to build web applications using Java + Spring Boot.
For more details, see my blog post on this project here: http://kaviddiss.com/2015/07/18/building-modern-web-applications-using-java-spring/.

To run it using maven (http://maven.apache.org):
```sh
$ mvn spring-boot:run
```

Then navigate to http://localhost:8080/ in your browser.

## Components

### [YourlApplication.java](https://github.com/davidkiss/yourl/blob/master/src/main/java/com/yourl/YourlApplication.java)
This is the main class of the application that initializes the Spring context including all the Spring components in this project and starts the web application inside an embedded Apache Tomcat (http://tomcat.apache.org) web container.

### [UrlController.java](https://github.com/davidkiss/yourl/blob/master/src/main/java/com/yourl/controller/UrlController.java)
Following the MVC paradigm, this class serves as the Controller that processes HTTP requests. Each method annotated with @RequestMapping maps to a specific HTTP endpoint:
- showForm(): displays the home screen where users can enter url to be shortened
- redirectToUrl(): redirects from shortened url to the original one
- shortenUrl(): as the name suggests it creates a shortened version of the provided url

### [ShortenUrlRequest.java](https://github.com/davidkiss/yourl/blob/master/src/main/java/com/yourl/controller/dto/ShortenUrlRequest.java)
The shorten url request is mapped into this POJO (Plain Old Java Object) by Spring while it runs the validations defined by the annotations on the fields.

### [shortener.html](https://github.com/davidkiss/yourl/blob/master/src/main/resources/templates/shortener.html)
This is a Thymeleaf-based (http://www.thymeleaf.org/) template that uses Twitter Bootstrap (http://getbootstrap.com/) to render the home screen's HTML code. It renders the data (Model) provided by the request mappings in the UrlController class.

### [InMemoryUrlStoreService.java](https://github.com/davidkiss/yourl/blob/master/src/main/java/com/yourl/service/InMemoryUrlStoreService.java)
The application currently only persists shortened urls into an in-memory persistence layer implemented in this minimalist class. Later on we can improve this by implementating the [IUrlStoreService](https://github.com/davidkiss/yourl/blob/master/src/main/java/com/yourl/service/IUrlStoreService.java) interface to persist data to a database.

That's it in a nutshell. If you have any question or suggestion, don't hesitate to contact me at info@kaviddiss.com.


