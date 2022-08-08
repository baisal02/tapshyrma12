public class Parrot {
    private String name;
    private int iq;
    private int wings;

    void setName(String name) {
        if (name.length() > 1) {
            this.name = name;
        }
    }

    String getName() {
        return name;
    }

    void setIq(int a) {
        if (a > 0 && a < 30) {
            iq = a;
        } else {
            System.out.println("its not possible");
        }
    }

    int getIq() {
        return iq;
    }

    void setWings(int c) {
        if (c >= 0 && c < 3) {
            wings = c;
        }
    }

    int getWings() {
        return wings;
    }

    String fly() {
        if (wings == 2) {
            return "can fly";
        }
        return "can't fly";
    }

    String talk() {
        if (iq > 15) {
            return "can talk";
        } return "can't talk";
    }


}
