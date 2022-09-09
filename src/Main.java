import java.util.Scanner;


        public class Main {
            public static void main(String[] args) {

                int a, b, c;

                Scanner input = new Scanner(System.in);

                while (true) {
                    System.out.print("1. sayıyı giriniz: ");
                    a = input.nextInt();

                    System.out.print("2. sayıyı giriniz: ");
                    b = input.nextInt();

                    System.out.print("3. sayıyı giriniz: ");
                    c = input.nextInt();


                    if ((a == b) || (b == c) || (a == c)) {
                        System.out.println("Eşit sayılar kullandınız, lütfen yeniden giriş yapınız. ");
                    } else  {
                        if ((a < b) && (a < c)) {
                            if (b < c) {
                                System.out.println(a + "<" + b + "<" + c);

                            } else
                                System.out.println(a + "<" + c + "<" + b);
                        } else if ((b < a) && (b < c)) {
                            if (a < c) {
                                System.out.println(b + "<" + a + "<" + c);

                            } else
                                System.out.println(b + "<" + c + "<" + a);

                        } else {
                            if (b < a) {
                                System.out.println(c + "<" + b + "<" + a);

                            } else
                                System.out.println(c + "<" + a + "<" + b);
                        }
                    }
                }
             /*   Scanner input = new Scanner(System.in);
                int x, y, z;
                System.out.println("1. sayıyı giriniz.");
                x = input.nextInt();
                ;
                System.out.println("2. sayıyı giriniz.");
                y = input.nextInt();
                System.out.println("3. sayıyı giriniz.");
                z = input.nextInt();

                if (x < y && x < z) {
                    if (y < z) {
                        System.out.println("x<y<z");
                    } else {
                        System.out.println("x<z<y");
                    }
                } else if (y < z && y < x) {
                    if (z < x) {
                        System.out.println("y<z<x");
                    } else {
                        System.out.println("y<x<z");
                    }

                } else if (z < y && z < x) {
                    if (y < x) {
                        System.out.println("z<y<x");
                    } else {
                        System.out.println("z<x<y");
                    }


                }
*/
            }
        }
