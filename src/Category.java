public class Category extends Entity {

    @Override
    public String toString(){
        String text = String.format("[Id: %s, Name: %s]", id, name);
        return text;
    }

    Category(int id, String name){
        this();
        this.id = id;
        this.name = name;
    }

    Category(){

    }
}
