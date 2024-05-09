package call.hello;

public class App
{

    private final String message = "Hello World from Java Maven Project!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
        System.out.println("This is cloned project that taken from Github to gitv and now edited in Eclipse then pushed back to github");
    }

    private final String getMessage() {
        return message;
    }

}