public class ExploringJavaBasics {

    public static void main(String[] args) {
        System.out.println(1 + 2L);
        System.out.println(5L - 1.0);
        System.out.println(20 / 3);


        int i = Integer.MAX_VALUE + 1;
        System.out.println(i);
        if (i < 0) System.out.println("Произошло переполнение примитивного целочисленного типа");

        boolean t = true;
        boolean f = false;
        System.out.println(f || t);
        System.out.println(t && f);
        System.out.println(!t);

        System.out.println(55.1 + 365);
        System.out.println(20 / 3.0);
        System.out.println(2 * 10.f);

    }
}
