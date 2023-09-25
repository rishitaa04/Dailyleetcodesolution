// package Leetcode.java.Arrays.java;

import java.util.Scanner;

public class concatenation {
    static void concat(int n , int nums[]){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of aray : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int y = 2*n;
        int array[] = new int[y];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0 ; i < y ; i++){
            array[i] = arr[i];
            array[i+n] = arr[i];
        }
        for(int i = 0 ; i < y ; i++){
            System.out.print(array[y]);
        }
        sc.close();
                

    }
}
