package vn.edu.dlu.ctk45.recipes_app;

public class FoodItem {
    private String name;
    private int imageId;

    public FoodItem(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}


