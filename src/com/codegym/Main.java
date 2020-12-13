package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mảng 1: ");
        int[] arr1 = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("vị trí thứ " + i + ": ");
            arr1[i] = sc.nextInt();
        }

//        System.out.println("Nhập mảng 2: ");
//        int[] arr2 = new int[5];
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print("Vị trí thứ " + i + ": ");
//            arr2[i] = sc.nextInt();
//        }

        int[] arr3 = new int[10];
        //thêm vào phía sau mảng
        for (int i = arr3.length; i > arr1.length; i--)
                    arr3[i]=arr1[i];


//        for (int j = arr3[arr2.length]; j < arr3.length; j++) {
//            for (int i = 0; i<arr2.length;i++){
//                arr3[j]=arr2[i];
//            }
//        }


        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
