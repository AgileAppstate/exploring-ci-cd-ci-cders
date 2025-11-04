public class HelloWorld{

    public static String getHelloWorld() {
        return "Hello World!";
    }

    public static String getHelloWorldName(String name) {
        return "Hello World, and " + name + "!";
    }

    public static void main(String[] args) {
        System.out.printf("%s%n", getHelloWorld());
        System.out.printf("%s%n", getHelloWorldName("Alice"));
    }
}