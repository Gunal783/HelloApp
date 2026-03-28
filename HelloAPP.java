public class HelloAPP {
    public static void main(String[] args) {

        String greeting;

        if (args.length == 0) {
            greeting = "Hello, World!";
        } else {
            StringBuilder names = new StringBuilder();

            for (String name : args) {
                names.append(name).append(", ");
            }

            // Remove trailing ", "
            String finalNames = names.substring(0, names.length() - 2);

            greeting = "Hello, " + finalNames + "!";
        }

        System.out.println(greeting);
    }
}