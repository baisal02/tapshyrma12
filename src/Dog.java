
    public class Dog {
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
            if (a > 0 && a < 13) {
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

        String guard() {
            if (age >= 4 && age <= 10) {
                return "can guard";
            }
            return "can't guard";
        }
}
