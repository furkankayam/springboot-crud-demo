# Spring Boot `CRUD` Demo

![CRUD](./images/CRUD.png)

- Spring Boot CRUD demo is demonstrating how to implement simple CRUD operations with a `user` entity.

<br>

This project is based on the Spring Boot project and uses these packages:

[![Java](https://img.shields.io/badge/java-19.0-000?style=for-the-badge&logo=openjdk&logoColor=write&color=FF9A00)](https://www.java.com/en/)

[![Spring Boot](https://img.shields.io/badge/spring%20boot-3.0.7-000?style=for-the-badge&logo=springboot&logoColor=white&color=6DB33F)](https://spring.io/)

[![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-3.0.6-C70D2C?style=for-the-badge&logo=liquibase&logoColor=white&color=06AC38)](https://www.java.com/en/)

[![PostgreSQL](https://img.shields.io/badge/postgresql-15.0-000?style=for-the-badge&logo=PostgreSQL&logoColor=white&color=4169E1)](https://www.postgresql.org/)

[![Lombok](https://img.shields.io/badge/lombok-1.18.26-000?style=for-the-badge&logoColor=white&color=FF5722)](https://projectlombok.org/)

[![Insomnia](https://img.shields.io/badge/Insomnia-2023.1-C70D2C?style=for-the-badge&logo=insomnia&logoColor=white&color=4000BF)](https://www.java.com/en/)

<br>

### Installation

- The project is created with Maven, so you just need to import it to your IDE and build the project to resolve the dependencies

<br>

### Database configuration

- Create a PostgreSQL database with the name `users` and add the credentials to `/resources/application.yml`

The default ones are :

```yml

spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/users
    username: postgres
    password: ****

```

<br>

### Usage

Run the project through the IDE and head out to `http://localhost:8080/`
or
run this command in the command line:

```bsh
mvn spring-boot:run
```

<br>

# License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details

Created by [Mehmet Furkan KAYA](https://www.linkedin.com/in/mehmet-furkan-kaya/)
