import static java.lang.Integer.parseInt;

public class Casting {
    public static void main(String[] args) {
        double a = 112.35;
        int b = (int) a;
        System.out.println("Double: " + a);
        System.out.println("int: " + b);

        String c = "49";
        int d = parseInt(c);
        System.out.println("The string value is: " + c);
        System.out.println("The integer value is: " + d);



    }
}
