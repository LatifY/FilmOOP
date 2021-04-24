import java.util.ArrayList;
import java.util.List;

public class FilmManager {
    public List<Film> films = new ArrayList<>();

    public void Add(Film film){
         films.add(film);
         System.out.printf("Film has been added successfully: %s \n", film.toString());
    }

    public void Delete(Film film){
        films.remove(film);
        System.out.printf("Film has been deleted successfully: %s \n", film.toString());
    }

    public void Update(Film film, Film newFilm){
        int index = films.indexOf(film);
        films.set(index, newFilm);
        System.out.printf("Film has been updated successfully: %s -> %s \n", film.toString(), newFilm.toString());
    }

    public Film findWithId(int id){
        Film foundedFilm = (Film) films.stream().filter(a -> a.id == id);
        return foundedFilm;
    }
}
