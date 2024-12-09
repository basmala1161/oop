public class Food {
    private String name;  // هذا هو المتغير الذي يحتوي على اسم الطعام
    private FoodCategory category;  // الفئة المرتبطة بالطعام
    private double price;  // السعر

    // مُنشئ لتحديد الطعام
    public Food(String name, FoodCategory category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Getter للحصول على اسم الطعام
    public String getName() {
        return name;
    }

    // Getter للحصول على فئة الطعام
    public FoodCategory getCategory() {
        return category;
    }

    // Getter للحصول على السعر
    public double getPrice() {
        return price;
    }

    // طباعة تفاصيل الطعام
    @Override
    public String toString() {
        return name + " (" + category.getName() + ") - " + price + " EGP";
    }
}
