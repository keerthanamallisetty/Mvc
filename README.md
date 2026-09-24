# Simple Java MVC Application

A beginner-friendly full-stack Java MVC application using Spring Boot.

## Minimum 7 files

This project contains more than the required 7 files.

### Java files
1. `MvcApplication.java` - starts the Spring Boot application.
2. `Model.java` - represents the data.
3. `Controller.java` - receives browser requests and returns the response.
4. `GreetingService.java` - contains the greeting business logic.

### Frontend/configuration files
5. `index.html` - View/user interface.
6. `style.css` - page styling.
7. `script.js` - calls the Java controller.
8. `pom.xml` - Maven project configuration.
9. `README.md` - project documentation.

## MVC Flow

Browser
↓
View (`index.html`)
↓
Controller (`Controller.java`)
↓
Service (`GreetingService.java`)
↓
Model (`Model.java`)
↓
Controller
↓
Browser

## How it works

1. The user enters a name in the webpage.
2. JavaScript sends a request to `/api/greet`.
3. The Controller receives the request.
4. The Service creates the greeting.
5. The Model stores the response.
6. The Controller sends the Model as JSON.
7. JavaScript displays the result.

## Run

Requirements:
- Java 17 or later
- Maven

From the project folder:

```bash
mvn spring-boot:run
```

Then open:

```text
http://localhost:8080
```
