package at.htl.microservices.number;

import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.ws.rs.core.Application;

@OpenAPIDefinition(
        info = @Info(
                title = "Number API",
                description = "Generates ISBN book numbers",
                version = "1.0",
                contact = @Contact(name = "Sarah", url = "https://bit.ly/htl-leonding")
        ),
        externalDocs = @ExternalDocumentation(url = "https://bit.ly/htl-leonding"),
        tags = {
                @Tag(name = "api", description = "Public API"),
                @Tag(name = "numbers", description = "Interested in numbers")
        }
)
public class NumberMicroservice extends Application {   // wr rs core!! (die klasse braucht man bei quarkus nicht, wir machen sie nur für die annotationen aber die könnten auch ins application properties
}
