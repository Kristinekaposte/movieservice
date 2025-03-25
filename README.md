# Movie Service

## Access the H2 Console

Once you run the app, open:

[H2 Console](http://localhost:8080/h2-console)

- **JDBC URL:** `jdbc:h2:mem:moviesdb`
- **Username:** `sa`
- **Password:** (leave blank)

## Summary of Endpoints

| Method | Endpoint          | Description              |
|--------|-------------------|--------------------------|
| POST   | `/api/movies`     | Create a new movie       |
| GET    | `/api/movies`     | Get all movies           |
| GET    | `/api/movies/{id}`| Get movie by ID          |
| PUT    | `/api/movies/{id}`| Update movie by ID       |
| DELETE | `/api/movies/{id}`| Delete movie by ID       |

## Swagger UI

[Swagger UI](http://localhost:8080/swagger-ui.html)