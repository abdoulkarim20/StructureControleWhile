package main;

import java.util.Scanner;

public class Tache5 {
    public static void main(String[] args) {
        int a;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Entrez un nombre plus grand que 0");
            a=scanner.nextInt();
        }while (a<=0);
        System.out.println("Vous avez entrez "+a);
    }
}
