import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        /*
        // Primeira forma sem utilizar função


        if(a > b && a > c){
            System.out.println("Higher = " + a);
        } else if (b > c) {
            System.out.println("Higher = " + b);
        } else {
            System.out.println("Higher = " + c);
        }

         */

        // Utilizando função

        int higher = max(a, b, c);
        showResult(higher);


        sc.close();
    }

    public static int max(int x, int y, int z){
        int aux;
        
        if (x > y && x > z){
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void showResult(int result){
        System.out.println("Higher = " + result);
    }


}