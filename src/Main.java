import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Console console = new Console();
    }

}

class Console{
    Scanner scanner = new Scanner(System.in);
    FilmManager filmManager = new FilmManager();
    CategoryManager categoryManager = new CategoryManager();

    Console(){
        Menu();
    }

    private void Menu(){
        Mark("Menu");
        System.out.println("1. Films");
        System.out.println("2. Categories");
        System.out.println("3. Exit");
        System.out.print("Choose: ");
        int choose = scanner.nextInt();
        Mark();
        System.out.println("");


        if(choose == 1){
            Films();
        }
        else if(choose == 2){

        }
        else if(choose == 3){
            System.exit(0);
        }
        else{

        }

    }

    private void Films(){
        Mark("Films");
        for(int i = 1; i <= filmManager.films.size(); i++){
            System.out.printf("%s. %s\n", i, filmManager.films.get(i-1));
        }
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Update");
        System.out.print("Choose: "); int choose = scanner.nextInt();
        Mark();

        if(choose == 1){
            FilmAdd();
        }
        else if(choose == 2){
            FilmDelete();
        }
        else if(choose == 3){
            FilmUpdate();
        }

    }

    private void FilmAdd(){
        Mark("Film Add");
        System.out.print("Id: "); int id = scanner.nextInt();
        System.out.print("Category Id: "); int categoryId = scanner.nextInt();
        System.out.print("Name: "); String name = scanner.next();
        System.out.print("Year: "); int year = scanner.nextInt();
        System.out.print("Description: "); String description = scanner.next();
        Film film = new Film(id, categoryId, name, year, description);
        filmManager.Add(film);
        Mark();
        Menu();
    }

    private void FilmDelete(){
        Mark("Film Delete");
        System.out.print("Id: "); int id = scanner.nextInt();
        Film foundedFilm = filmManager.findWithId(id);
        filmManager.Delete(foundedFilm);
        Mark();
        Menu();
    }

    private void FilmUpdate(){
        Mark("Film Update");
        for(int i = 1; i <= filmManager.films.size(); i++){
            System.out.printf("%s. %s\n", i, filmManager.films.get(i));
        }
        System.out.print("Choose: "); int choose = scanner.nextInt();
        Film choosenFilm = filmManager.films.get(choose-1);
        System.out.print("Id: "); int id = scanner.nextInt();
        System.out.print("Category Id: "); int categoryId = scanner.nextInt();
        System.out.print("Name: "); String name = scanner.next();
        System.out.print("Year: "); int year = scanner.nextInt();
        System.out.print("Description: "); String description = scanner.next();
        Film newFilm = new Film(id, categoryId, name, year, description);
        filmManager.Update(choosenFilm, newFilm);
        Mark();
        Menu();
    }

    private void Mark(){
        System.out.println("----------------");
    }

    private void Mark(String text){
        String afterLines = "-------------";
        int lineToAdd = afterLines.length() - text.length();
        afterLines = afterLines.substring(0, lineToAdd);
        System.out.printf("---%s%s\n",text, afterLines);
    }
}