/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algopractice;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class BinarySearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many number you want to Input: ");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Enter your " + n + " Value");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Which Item you want to Search: ");
        int Search_Item = input.nextInt();
        int mid=0, beg = 0, end = n - 1, C=0;
        while(beg<=end){
             mid=(beg+end)/2;
            if(Search_Item==array[mid]){
                C++;
                break;
            }
            else if(Search_Item>array[mid]){
                beg=mid+1;
            }
            else if (Search_Item<array[mid]){
                end=mid-1;
            }
        }
        if (C>0){
            System.out.println("Item found At position " +mid+ " indexed");
        }
        else 
            System.out.println("Item not Found ");
    }

}
