public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Boris");
        cat.setAge(2);
        cat.setBreed("British cat");
        System.out.println("Cat name: " + cat.getName());
        System.out.println("Cat age: " + cat.getAge());
        System.out.println("Cat breed: " + cat.getBreed());

        Dog dog = new Dog();
        dog.setName("Pirate");
        dog.setAge(5);
        dog.setBreed("German shepherd");
        System.out.println("Dog name: " + dog.getName());
        System.out.println("Dog age: " + dog.getAge());
        System.out.println("Dog breed: " + dog.getBreed());

        Parrot parrot = new Parrot();
        parrot.setName("SnowWhite");
        parrot.setAge(1);
        parrot.setBreed("Cockatoo");
        System.out.println("Parrot name: " + parrot.getName());
        System.out.println("Parrot age: " + parrot.getAge());
        System.out.println("Parrot breed: " + parrot.getBreed());

        Fish fish = new Fish();
        fish.setName("Nemo");
        fish.setAge(3);
        fish.setBreed("Betta fish");
        System.out.println("Fish name: " + fish.getName());
        System.out.println("Fish age: " + fish.getAge());
        System.out.println("Fish breed: " + fish.getBreed());
    }
}