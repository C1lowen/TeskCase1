package practicProgAcademy;

public class Cat {


    String name;
    int weight;
    String color;

    public Cat() {
        System.out.println("I love mama");
    }

    public String meow() {
        return "meow meow";
    }
    public void jump() {
        System.out.println("hop");
    }
    public String toString() {
        return "Cat [name=" + name + ", weight=" + weight + ", color=" + color + "]";
    }

}
