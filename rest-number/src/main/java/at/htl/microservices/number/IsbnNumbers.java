package at.htl.microservices.number;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.json.bind.annotation.JsonbTransient;
import java.time.Instant;

@Schema(description = "Several ISBN numbers for books")
public class IsbnNumbers {

    @Schema(required = true)
    @JsonProperty("isbn_10")
    public String isbn10;
    @Schema(required = true)    // dann hats im swagger einen roten stern
    @JsonProperty("isbn_13")
    public String isbn13;
    @JsonbTransient     // dann stehts im swagger nicht drinnen
    public Instant generationData;

    @Override
    public String toString() {
        return "IsbnNumbers{" +
                "isbn10='" + isbn10 + '\'' +
                ", isbn13='" + isbn13 + '\'' +
                ", generationData=" + generationData +
                '}';
    }
}
