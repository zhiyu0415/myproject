package com.fish.finalExam;

import java.util.Scanner;

public class Vending {
    public static void main(String[] args) {
        int[] price={15,20,25};
        for (int i = 0; i < price.length; i++) {
            System.out.println(price[i]);
        }
        Scanner scanner=new Scanner(System.in);
        int Total = 0;
        boolean end = false;
        while (!end){
            System.out.println("please enter your coins (1/5/10):      Tatal:"+Total);
            String s = scanner.next();
            switch(s){
                case"1":
                case"5":
                case"10":
                    int n = Integer.parseInt(s);
                    Total += n ;
                    break;
                case"0":
                    end = true;
                    break;
                case"a":
                case"b":
                case"c":
                    int index = s.charAt(0)-97;
                    if(Total >= price[index]){
                        System.out.println("DON!");
                        Total -= price[index];
                    }else{
                        System.out.println("BEEP!");
                    }break;
                default:
                    System.out.println("Wrong answer!");
                    break;
            }
        }
        System.out.println("END!");
    }
}
