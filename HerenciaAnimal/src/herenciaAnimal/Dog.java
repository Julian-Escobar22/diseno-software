package herenciaAnimal;

public class Dog extends Mamma1 {
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println();
        System.out.println("Woof Woof");
    }

    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}
