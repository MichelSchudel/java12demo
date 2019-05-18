package nl.craftsmen.java12demo;

public class SwitchDemo {

    static String raw = `
            d
    d
    d
    `;
    public static void main(String[] args) {á
        System.out.println(raw);
        int i = 1;

        switch(i) {
            case 1 -> System.out.println("i is 1");
            case 2 -> System.out.println("i is 2");
            default -> System.out.println("don't know");
        }
    }
}+
