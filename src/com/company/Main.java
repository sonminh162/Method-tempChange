package com.company;

import java.util.Scanner;

public class Main {
    public static float cToF(float c){
        float f;
        f = 9*c/5+32;
        return f;
    }
    public static float fToC(float f){
        float c;
        c = 5*(f-32)/9;
        return c;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;
        float i;
        System.out.println("Menu");
        System.out.println("1. C TO F !");
        System.out.println("2. F TO C !");
        System.out.println("0. EXIT!");
        System.out.println("Enter choice:");
        choice = scanner.nextInt();
        switch(choice){
            case 1: {
                System.out.print("Nhap vao do C:");
                i = scanner.nextInt();
                System.out.println("Gia tri F tuong ung:" +cToF(i));
                break;
            }
            case 2:{
                System.out.print("Nhap vao do F:");
                i = scanner.nextInt();
                System.out.println("Gia tri C tuong ung:"+fToC(i));
                break;
            }
            case 0:{
                System.exit(0);
            }
            default:
                System.out.print("no choice!");
        }
    }
}
