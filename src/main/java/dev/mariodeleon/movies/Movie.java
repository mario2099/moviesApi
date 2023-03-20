package dev.mariodeleon.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection="movies")
@Data //this annotation takes care of all getters, setters and string methods
@AllArgsConstructor //is an addition for creating a constructor that takes all this private field as argument
@NoArgsConstructor //another constructor that takes no parameters
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    //This annotation is used only to demonstrate some features of springboard and MongoDB data, but the right way to go is without it
    @DocumentReference //this will cause the database to only store the IDs of the review and the reviews will be in a separate collection. It is a manual reference relationship
    private List<Review> reviewIds; //without the annotation, this will be an embedded relationship and all the reviews related to the movie will be added to this list
}
