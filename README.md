# Spring Boot and OpenAPI

The `/manual` endpoint is defined in `MyEndpoint`:

```java
@Component
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

The `openapi.yaml` was generated from that endpoint using the [Small Rye Maven plugin](https://github.com/smallrye/smallrye-open-api), and then the `/generated` endpoint was generated from that by the [OpenAPI Generator](https://openapi-generator.tech) project.

You can view the OpenAPI v3 specification here:

```
http://localhost:8080/v3/api-docs
```

The Swagger UI is served from http://localhost:8080. Note that if you have configured the `host` to be something other than localhost, the calls through swagger-ui will be directed to that host and not localhost!