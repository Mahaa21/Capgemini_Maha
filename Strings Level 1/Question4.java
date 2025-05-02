public class Question4 {
    // Method that throws NullPointerException
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // This will throw NullPointerException
    }

    // Method that handles the exception
    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Uncomment below line to see the program crash
        // generateException();

        // Proper handling
        handleException();
    }
}
