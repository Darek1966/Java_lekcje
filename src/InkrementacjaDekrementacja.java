public class InkrementacjaDekrementacja {

    public static void main(String[] args) {

        // inkrementacja (zwiększenie wartości o 1)
        int a = 0;
        System.out.println("Wartość a: " + a);  // 0
        int b = a++;    // postinkrementacja (przypisujemy wartość a [0] i póżniej a zwiększamy o 1)
        System.out.println("Wartość b: " + b);  // 0
        System.out.println("Wartość a: " + a);  // 1

        int c = ++a;    // preinkrementacja (a zwiększamy o 1 i przypisujemy do c [1+1])
        System.out.println("Wartość c: " + c);  // 2
        System.out.println("Wartość a: " + a);  // 2

        // dekrementacja (zmniejszenie wartości o 1)
        int d = 0;
        System.out.println("Wartość d: " + d);  // 0
        int e = d--;    // postdekrementacja (przypisujemy wartość d [0] i póżniej d zmniejszamy o 1)
        System.out.println("Wartość e: " + e);  // 0
        System.out.println("Wartość d: " + d);  // -1

        int f = --d;    // predekrementacja (d zmniejszamy o 1 i przypisujemy do f [-1-1])
        System.out.println("Wartość f: " + f);  // -2
        System.out.println("Wartość d: " + d);  // -2
    }
}
