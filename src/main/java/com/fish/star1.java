package com.fish;

public class star1 {public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 6; j++) {
            if(j==0||j==5||i==0||i==4){
                    System.out.print("*");
                }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
}
