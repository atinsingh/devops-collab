public final class Dog extends Animal {

    public Dog(String name, String type) {
        super(name, type);
    }


    public void eat() {
        System.out.println("Eating lot bones");
    }


    public void talk() {
        System.out.println("Barking");
    }


    public static void printMe(){
        System.out.println("Printing all details from dog");
    }

    public void walk() {
	System.out.println("Walking");
    }

}
