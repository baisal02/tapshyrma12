public class Fish {
    private int plavnik;
    private int mass;
    private String color;

    void setPlavnik(int a) {
        if (a >= 3 && a < 8) {
            plavnik = a;
        } else {
            System.out.println("myndai bolushu mumkun emes");
        }
    }

    int getPlavnik() {
        return plavnik;
    }

    void setMass(int b) {
        if (b > 0 && b < 500) {
            mass = b;
        } else {
            System.out.println("myndai bolushu mumkun emes");
        }
    }

    int getMass() {
        return mass;
    }

    void setColor(String c) {
        color = c;
    }

    String getColor() {
        return color;
    }

    int speed() {
        return plavnik * 5 * mass;
    }
}
