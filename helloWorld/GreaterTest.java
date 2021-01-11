public class GreaterTest {
    public static void main(String[] args) {
        Greater function = new Greater();
        String greeting = function.greet();
        String greetingWithName = function.greet("GOJIS");
        System.out.println(function.greet("Yogi", "Bear"));

        // if (greeting.equals("Hello World") || greetingWithName.equals("GOJIS")) {
        //     System.out.println("Test successful");
        // } else {
        //     System.out.println("Test failed");
        // }
    }
}