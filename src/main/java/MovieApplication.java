import domain.Movie;
import domain.MovieRepository;
import domain.SelectRepository;
import service.MovieService;
import service.SelectService;
import view.InputView;
import view.OutputView;

import java.util.List;

public class MovieApplication {
    public static void main(String[] args) {
        List<Movie> movies = MovieRepository.getMovies();
        OutputView.printMovies(movies);

        selectByUser();

        // TODO 구현 진행
    }

    private static void selectByUser() {
        SelectService.selectMovies();
        MovieService.compareWithSelect();
    }
}
