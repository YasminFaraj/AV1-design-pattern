public class Main {
    public static void main(String[] args) {

        Configuration config1 = Configuration.getInstance();
        config1.setValue("theme", "dark");

        Configuration config2 = Configuration.getInstance();
        System.out.println(config2.getValue("theme")); // dark
    }
}
