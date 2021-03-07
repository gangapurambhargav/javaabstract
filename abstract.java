abstract class Animal {
    public abstract void sound();
}

class dog extends Animal {

    public void sound() {
        System.out.println("Dogs Bark");
    }
}

class monkeys extends Animal {

    public void sound() {
        System.out.println("Mokeys Whoop");
    }

}

class abstract1 {

    public static void main(String[] args) {
        Animal A = new dog();
        Animal B = new monkeys();
        A.sound();
        B.sound();

    }
}