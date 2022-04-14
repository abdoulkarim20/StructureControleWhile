package main;

import java.util.Scanner;

public class Tache1 {
    public static int somme(int a ,int b){
        if (a>b){
            System.out.println("La plus grande valeur que vous avez saisie est: "+a);
        }else if (a<b){
            System.out.println("La plus grande valeur que vous avez saisie est: "+b);
        }else {
            System.out.println("Vous avez entrez les memes nombres");
        }
        return a+b;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entrez un nombre entier");
        int a=scanner.nextInt();
        System.out.println("Entrez un deuxieme nombre");
        int b=scanner.nextInt();
        System.out.println("Dont la somme est: "+somme(a,b));
    }
}
