public  class Animal {
    private String name;
    private String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void sleep(){
        System.out.println("Keeping eyes closed");
    }

    public static void printMe(){
        System.out.println("Printing all details");
    }

    public static void printMe_Bobby(){
        System.out.println("Printing detaila added by Bobby again");
    }
}
