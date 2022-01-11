package Syntax;

public class SB {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }
        long after = System.currentTimeMillis();
        System.out.println(sb.toString());
        System.out.println(after-before);
    }
}
