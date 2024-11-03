/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baitap1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Baitap1 {

    public static void main(String[] args) {
        // tao doi tuong sc nhap tu ban phim
        Scanner sc = new Scanner(System.in);
        // Yeu cau nguoi dung nhap a
        System.out.println("Nhap a");
        double a = sc.nextDouble();
        // Yeu cau nguopi dung nhap b
        System.out.println("Nhap b");
        double b = sc.nextDouble();
        // Nieu a khac 0 thi se tinh nghiem
        if (a != 0) {
            // Tinh nghiem
            double x = -b / a;
            // Hien thi ra
            System.out.println("Phuong trinh co nghiem x = " + x);
        } else {
            // Nieu a = 0 va b = 0 thi phuong trinh vo so nghiem
            if (b == 0) {
                System.out.println("phuong trinh vo so nghiem");
            } else {
                // Nieu a=0 b khac 0 thi pt vo nghiem
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        // Dong doi tuong sc
        sc.close();
    }
}
