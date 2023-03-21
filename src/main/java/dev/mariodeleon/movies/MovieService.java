package dev.mariodeleon.movies;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovieService {
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }
}
