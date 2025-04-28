package application;

import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double areaX, areaY, p;
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite o primeiro valor do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        p = (x.a + x.b + x.c)/2;
        areaX = Math.sqrt(p*(p-x.a)*(p-x.b)*(p-x.c));

        System.out.println("Digite o primeiro valor do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        p = (y.a + y.b + y.c)/2;
        areaY = Math.sqrt(p*(p-y.a)*(p-y.b)*(p-y.c));

        System.out.printf("O valor da area do triangulo X é: %.4f \n", areaX);
        System.out.printf("O valor da area do triangulo Y = %.4f \n", areaY);

        if (areaX > areaY){
            System.out.println("A maior àrea é a do triangulo X");
        } else {
            System.out.println("A maior àrea é a do triangulo Y");
        }

        sc.close();
    }
}