# fakequeue (spring boot app)

## Requirements

For building and running the application you need:

- [Open-JDK 1.11.0](https://openjdk.java.net/install/)
- [Maven 3](https://maven.apache.org)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `src/main/java/com/psuedo/queue/QueueApplication.java` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

## Deploying the application to Heroku

The easiest way to deploy the sample application to Heroku is to use the Heroku CLI;

    - The first step is to login to heroku using the command [heroku login]
    - After successful login, heroku app should be created via [heroku create]
    - The next step is to deploy the code to heroku using [git push heroku master]

This application is already deployed to heroku.

Heroku URL: [https://murmuring-ocean-87585.herokuapp.com/](https://murmuring-ocean-87585.herokuapp.com/)

## API

###### [POST]  /transaction/send
    - Request Body
        - {
            "Account Number":"1203456789",
            "Type":"credit",
            "Amount":"1000",
            "Currency":"INR",
            "AccountFrom":"1403465759"
        }
    - Response
        Transaction Saved Successfully

## HEROKU URL

[https://murmuring-ocean-87585.herokuapp.com/](https://murmuring-ocean-87585.herokuapp.com/)