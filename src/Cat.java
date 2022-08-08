public class Cat {
    private String name;
    private int age;
    private String color;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setAge(int a) {
        if (a > 0 && a < 18) {
            age = a;
        }
    }

    int getAge() {
        return age;
    }

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }

    String catchMouse() {
        if (age > 3 && age < 14) {
            return "can catch mouse";
        }
        return "can't catch mouse";
    }
}
