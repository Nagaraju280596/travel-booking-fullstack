# Travel Booking Full-Stack Monolith

Spring Boot + MySQL + HTML/CSS/JavaScript.

## Run
1. Start MySQL.
2. Create database `travel_booking`.
3. Update `src/main/resources/application.properties` with your MySQL credentials.
4. Run `mvn clean package`.
5. Run `mvn spring-boot:run`.
6. Open http://localhost:8080

The form saves data through `POST /api/travel-details`.

Verify in MySQL:
```sql
USE travel_booking;
SELECT * FROM travel_details;
```

This package intentionally contains no Dockerfile, docker-compose.yml, or Jenkinsfile.
