public class Main {
    public static void main(String[] args){
        Fish fish = new Fish();
        System.out.println("Fish:");
        fish.setPlavnik(3);
        fish.setMass(12);
        fish.setColor("green");
        System.out.println("kolichestvo plavnikoov: "+fish.getPlavnik());
        System.out.println("mass: "+fish.getMass());
        System.out.println("color of fish: "+fish.getColor());
        System.out.println("speed: "+fish.speed());

        System.out.println("------------------------");

        Parrot parrot = new Parrot();
        System.out.println("Parrot:  ");
        parrot.setWings(1);
        parrot.setIq(16);
        parrot.setName("red");
        System.out.println("name: "+parrot.getName());
        System.out.println("iq: "+parrot.getIq());
        System.out.println("wings: "+parrot.getWings());
        System.out.println(parrot.fly());
        System.out.println(parrot.talk());

        System.out.println("------------------------");
        Cat cat = new Cat();
        System.out.println("Cat: ");
        cat.setName("Tom");
        cat.setAge(7);
        cat.setColor("gray");
        System.out.println("age: "+cat.getAge());
        System.out.println("name: "+cat.getName());
        System.out.println("color: "+cat.getColor());
        System.out.println(cat.catchMouse());
        System.out.println("------------------------");

        Dog dog = new Dog();
        System.out.println("Dog: ");
        dog.setColor("black");
        dog.setName("Rex");
        dog.setAge(10);
        System.out.println("age: "+dog.getAge());
        System.out.println("color: "+dog.getColor());
        System.out.println("name: "+dog.getName());
        System.out.println(dog.guard());

    }

}