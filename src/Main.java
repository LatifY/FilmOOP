public class Main {

    public static void main(String[] args) {
        FilmManager filmManager = new FilmManager();

        Film[] films = {
            new Film(1,1,"Selam",2000, "Güzel bir film"),
            new Film(2,1,"Teen Wolf", 2011,"Genç Kurt, MTV için Jeff Davis tarafından geliştirilen bir Amerikan televizyon dizisidir."),
            new Film(3,1,"War for the Planet of the Apes", 2017,"Maymunlar Cehennemi üçlemesinin son perdesine hazır olun."),
            new Film(4,1,"The Iron Giant", 1999, "Ufukta dev birşey var. Hogarth Hughes, yıldızlardan dünyaya düşmüş kocaman bir robotu kurtaran küçük bir çocuktur.")
        };

        for(Film film : films){
            filmManager.Add(film);
        }
        System.out.println(filmManager.films.toString());
        System.out.println("");

        CategoryManager categoryManager = new CategoryManager();

        Category[] categories = {
            new Category(1, "Aksiyon"),
            new Category(2, "Macera"),
            new Category(3,"Yerli"),
            new Category(4, "Bilimkurgu"),
            new Category(5,"Komedi"),
            new Category(6,"Romantik")
        };

        for(Category category : categories){
            categoryManager.Add(category);
        }

        System.out.println(categoryManager.categories.toString());
    }
}
