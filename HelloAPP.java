public class HelloAPP {
    public static void main(String[] args) {

        String names = "";

        if (args.length == 0) {
            names = "World";
        } else {
            for (String name : args) {
                if (!names.isEmpty()) {
                    names += ", ";
                }
                names += name;
            }
        }

        System.out.println("Hello, " + names + "!");
    }
}