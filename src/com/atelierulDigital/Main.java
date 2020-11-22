package com.atelierulDigital;

public class Main {

    public static void main(String[] args) {
        firstChallenge();

    }

    public static void firstChallenge() {
        for(int i =1; i<=100;i++){

            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FIZZBUZZ");
            }else if(i % 5 == 0){
                System.out.println("BUZZ");
            } else if(i % 11 == 0 ){
                System.out.println("JAZZ");
            } else if(i % 7 == 0 ){
                System.out.println("Rizz");
            } else if(i % 3 == 0 ) {
                System.out.println("Fizz");
            }
            else{
                System.out.println(i);
            }
        }
    }


}
