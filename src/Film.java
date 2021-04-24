public class Film extends Entity {
    public int categoryId;
    public int year;
    public String description;

    @Override
    public String toString(){
        String text = String.format("[Id: %s, CategoryId: %s, Name: %s, Year: %s, Description: %s]", id, categoryId, name,year,description);
        return text;
    }

    Film(int id, int categoryId, String name, int year, String description){
        this();
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.year = year;
        this.description = description;
    }

    Film(){

    }
}
