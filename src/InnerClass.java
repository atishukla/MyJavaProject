public class InnerClass {

    public static void main(String[] args) {
        B obj = () -> System.out.println("Hello Lamda Interface..");
        obj.show();
    }
}

@FunctionalInterface
interface B {
    void show();
}


