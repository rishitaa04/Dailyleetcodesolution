// package Leetcode.java.Arrays.java;

import java.util.Scanner;

public class printalternateelement {

    // static void alternateprint(int x , int abr[]){
    //     Scanner sc = new Scanner(System.in);
    //     int l = sc.nextInt();
    //     int abc[] = new int[x];
    //     for(int i = 0 ; i < x ; i++){
    //         abc[i] = sc.nextInt();
    //     }
    //     for(int i = 0 ; i < l ; i+=2){
    //         System.out.print(abc[i] + " ");
    //     }
    //     sc.close();
    // }
    static void takinginput(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0 ; i < n ; i+=2){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    public static void main(String[] args) {
        
       takinginput();
    }
}
