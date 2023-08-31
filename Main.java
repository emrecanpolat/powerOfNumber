package com.company;



public class Main {

    public static void main(String[] args) {
        power(3,3);


    }

    public static void power(int sayi, int us){
        long result = 1;

        for (; us != 0; --us) {
            result *= sayi;
        }

        System.out.println("Answer = " + result);
    }





}


