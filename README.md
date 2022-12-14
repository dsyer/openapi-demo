# Spring Boot and OpenAPI

The `/manual` endpoint is defined in `MyEndpoint`:

```java
@RestController
@RequestMapping("/manual")
@Tag(name = "manual", description = "the manual API")
public class MyEndpoint {
	@GetMapping(produces = "application/json")
	@Operation
	public Model message() {
		Model hello = new Model();
		hello.setName("Hello");
		return hello;
	}
}
```

The `openapi.yaml` was generated from that endpoint using the [Small Rye Maven plugin](https://github.com/smallrye/smallrye-open-api) (without the Spring Docs dependency, so only the application endpoint is detected). Then it was edited to change the path to `/generated` and that endpoint was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.

You can view the OpenAPI v3 specification here:

```
http://localhost:8080/v3/api-docs
```

The Swagger UI is served from hhttp://localhost:8080/swagger-ui/index.html. Note that if you have configured the `host` to be something other than localhost, the calls through swagger-ui will be directed to that host and not localhost!

OpenAPI specs can also be generated using the [Spring Docs Plugin](https://springdoc.org/plugins.html) during integration testing (`mvn verify`). The `openapi.json` shows up in `target` directory, and includes all the Spring endpoints (`/manual` and `/generated`).

The app compiles to a native image and all the JSON endpoints work, including the OpenAPI specification. The Swagger UI does not work.