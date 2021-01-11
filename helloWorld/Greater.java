public class Greater {
    public String greet(String name) {
        return createGreating(name);
    }
    public String greet() {
        return createGreating("world");
    }

    public String greet(String firstName, String lastName) {
        return createGreating(firstName + " " + lastName);
    }

    private String createGreating(String tobeGreated) {
        return "Whats good " + tobeGreated + ", welcome to the crib";
    }
}