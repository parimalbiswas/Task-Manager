package com.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "REST API", version = "1.1"), security =
{ @SecurityRequirement(name = "basicAuth"), @SecurityRequirement(name = "bearerToken") }, servers =
{ @Server(url = "/", description = "Default Server URL") })
@SecuritySchemes(
{ @SecurityScheme(name = "basicAuth", type = SecuritySchemeType.HTTP, scheme = "basic"),
		@SecurityScheme(name = "bearerToken", type = SecuritySchemeType.HTTP, scheme = "bearer", bearerFormat = "JWT") })

public class TaskBackendApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(TaskBackendApplication.class, args);
	}

}
