public class FoodCategory {
    private String name;  // هذا هو المتغير الذي يحتوي على اسم الفئة

    // مُنشئ لتحديد الفئة باسم معين
    public FoodCategory(String name) {
        this.name = name;
    }

    // Getter للحصول على اسم الفئة
    public String getName() {
        return name;
    }

    // طباعة اسم الفئة
    @Override
    public String toString() {
        return name;
    }
}
