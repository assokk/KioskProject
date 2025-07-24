package basic;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String categoryName;
    private List<MenuItem> items = new ArrayList<>();

    public Menu(String categoryName) {
        this.categoryName = categoryName;
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public String getCategoryName() {
        return categoryName;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void printItems() {
        System.out.println("[ " + categoryName + " ]");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i).getName() + " | " + items.get(i).getPrice() + " | " + items.get(i).getDescription());
        }
        System.out.println("0. 뒤로가기");
    }

}
