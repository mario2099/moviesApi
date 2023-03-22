package dev.mariodeleon.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    //Database access methods
    @Autowired
    private MovieRepository movieRepository; //reference of the repository
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }
    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
