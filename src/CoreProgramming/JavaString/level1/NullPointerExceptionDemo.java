package CoreProgramming.JavaString.level1;

class NullPointerExceptionDemo {

    static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    public static void main(String[] args) {
        // generateException(); // Uncomment to see exception
        handleException();
    }
}
