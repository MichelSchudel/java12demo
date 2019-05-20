package nl.craftsmen.java12demo;

import org.junit.Test;

public class SwitchDemo {

    @Test
    public void testSwitches() {
        int i = 1;
        switch (i) {
            case 1 -> System.out.println("i is 1");
            case 2 -> System.out.println("i is 2");
            default -> System.out.println("don't know");
        }
    }

    @Test
    public void testSwitchBlocks() {
        int i = 1;
        switch (i) {
            case 1 -> {
                System.out.println("i is 1");
            }
            case 2 -> System.out.println("i is 2");
            default -> System.out.println("don't know");
        }
    }

    @Test
    public void testResultType() {
        int i = 1;
        String result = switch (i) {
            case 1 -> {
                System.out.println("i is 1");
                break "i is 1";
            }
            case 2 -> {
                System.out.println("i is 2");
                break "i is 2";
            }
            default -> {
                System.out.println("don't know");
                break "don't know";
            }
        };
        System.out.println(result);
    }

    @Test
    public void testResultTypeSingleLine() {
        int i = 1;
        String result = switch (i) {
            case 1 -> "i is 1";
            case 2 -> "i is 2";
            default -> "don't know";
        };
        System.out.println(result);
    }

}
