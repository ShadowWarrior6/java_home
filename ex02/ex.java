package ex02;

import java.util.Scanner;

public class ex {
    

    public static void main (String args){
        


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("введите действие:");
            System.out.println("1:+");
            System.out.println("2:-");
            System.out.println("3:*");
            System.out.println("4:/");
            System.out.println("5:выход");
            int person = scanner.nextInt();
            if (person == 5) {
                break;

            } else if (person == 1) {
                System.out.println("Введите первое число: ");
                int a = scanner.nextInt();
                System.out.println("Введите второе число: ");
                int b = scanner.nextInt();
                int c = a + b;
                System.out.println(c + "финальный ответ");
                break;
            } else if (person==2) {
                System.out.println("Введите первое число: ");
                int a = scanner.nextInt();
                System.out.println("Введите второе число: ");
                int b = scanner.nextInt();
                int c = a-b;
                System.out.println(c + "финальный ответ: ");
                break;

            } else if (person==3) {
                System.out.println("Введите первое число: ");
                int a = scanner.nextInt();
                System.out.println("Введите второе  число: ");
                int b = scanner.nextInt();
                int c = a*b;
                System.out.println(c + "финальный ответ: ");
                break;
            } else if (person==4) {
                System.out.println("Введите первое число: ");
                int a = scanner.nextInt();
                System.out.println("Введите второе  число:");
                int b = scanner.nextInt();
                int  c= a/b;
                System.out.println(c  + "финальный ответ: ");
                break;
            }
        }
    }
}


