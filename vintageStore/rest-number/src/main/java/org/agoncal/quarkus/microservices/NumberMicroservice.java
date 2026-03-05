package org.agoncal.quarkus.microservices;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@ApplicationPath("/")
@OpenAPIDefinition(
        info = @Info(title = "Number Microservice",
                description = "A microservice that generates book numbers (ISBN 13 and ISBN 10)",
                version = "1.0",
                contact = @Contact(name = "@alessuhestaras@gmail.com")),
        externalDocs = @ExternalDocumentation(url = "https://github.com/alessaest", description = "Github repository"),
        tags = {
                @Tag(name = "api", description = "Public API for generating book numbers"),
                @Tag(name = "numbers", description = "Endpoints related to book numbers")
        }
)
public class NumberMicroservice extends Application {

}
