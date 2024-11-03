/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap1;


import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bac2 {

    public static void main(String[] args) {
        // Tao doi tuong sc nhap tu ban phim
        Scanner sc = new Scanner(System.in);

        // Nhap he so a
        System.out.print("Nhap he so a: ");
        double a = sc.nextDouble();

        // Nhap he so b
        System.out.print("Nhap he so b: ");
        double b = sc.nextDouble();

        // Nhap he so c
        System.out.print("Nhap he so c: ");
        double c = sc.nextDouble();

        // Tinh delta
        double delta = b * b - 4 * a * c;

        // Kiem tra gia tri cua delta de tim nghiem
        if (delta > 0) {
            // Hai nghiem phan biet
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co hai nghiem phan biet: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            // Mot nghiem kep
            double x = -b / (2 * a);
            System.out.println("Phuong trinh co mot nghiem kep: x = " + x);
        } else {
            // Vo nghiem
            System.out.println("Phuong trinh vo nghiem");
        }
        // Dong doi tuong sc
        sc.close();

    }
}
