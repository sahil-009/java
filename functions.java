public class functions {
    public static void main(String[] args) {
        String name = "SAHIL";

        // boolean result = name.equalsIgnoreCase("SAHIL");
        // int result = name.length();
        // char result = name.charAt(1);
        // boolean result = name.isEmpty();
        // String result = name.toLowerCase();
        // String result = name.toUpperCase();
        String result = name.trim();
        String s = result.replace("SAHIL", "s");
        System.out.println(s);

    }
}
