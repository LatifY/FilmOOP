import java.util.ArrayList;
import java.util.List;

public class CategoryManager{
    public List<Category> categories = new ArrayList<>();

    public void Add(Category category) {
        categories.add(category);
        System.out.printf("Category has been added successfully: %s \n", category.toString());
    }

    public void Delete(Category category) {
        categories.remove(category);
        System.out.printf("Category has been added successfully: %s \n", category.toString());
    }

    public void Update(Category category, Category newCategory) {
        int index = categories.indexOf(category);
        categories.set(index, newCategory);
        System.out.printf("Category has been updated successfully: %s -> %s \n", category.toString(), newCategory.toString());
    }

    public Category findWithId(int id) {
        Category foundedCategory = (Category) categories.stream().filter(a -> a.id == id);
        return foundedCategory;
    }
}
