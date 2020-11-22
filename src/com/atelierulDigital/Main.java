package com.atelierulDigital;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Integer[] intArray = {3,2,-3,-2,3,0};
        int [] v = {-1,-1,-1,2, -2,3};
       // firstChallenge();

       // secondChallenge();
//
//        System.out.println(thirdChallenge(intArray,0));
        System.out.println(fourthChallenge(v,0));
    }
    public static int fourthChallenge(int v[], int sum)
    {
        int count =0;
        for (int i = 0; i < v.length - 2; i++) {

            for (int j = i + 1; j < v.length - 1; j++) {
                for (int k = j + 1; k < v.length; k++) {
                    if (v[i] + v[j] + v[k] == sum) {
                        v[i]=1;
                        v[j]=1;
                        v[k]=1;
                       // System.out.print("Triplet is " + v[i] + ", " + v[j] + ", " + v[k]);
                        count++;
                    }
                }
            }
        }

        // If we reach here, then no triplet was found
        return count;
    }

    public static int thirdChallenge(Integer[] input, int sum) {
        int count =0;
        Set<Integer> setArray = new HashSet<>(Arrays.asList(input));
        for(int i=0; i<setArray.size(); i++){
            if(setArray.contains(sum - input[i])){
                setArray.remove(input[i]);
                setArray.remove(sum - input[i]);
                count++;
            }
        }
        return count;
    }

    public static void secondChallenge(){
        System.out.println(compute(7));
        System.out.println(compute2(7));
    }
    public static String compute(int num){
        //Stage 1
        String result = getDivisible(num);
        if("".equals(result) && "".equals(countDigitsStage1(num))){
            System.out.println(num);
        }
        return result+ countDigitsStage1(num);
    }
    public static String compute2(int num){
        //Stage 1
        String emptyResult = "";
        String result = getDivisible(num);
        return result+countDigitsStage2(num);
    }
    private static String getDivisible(int num) {
        String result = "";
        if(num % 3 == 0){
           result += "Foo";
        }
        if( num % 5 == 0) {
            result += "Bar";
        }

        if( num % 7 == 0) {
            result += "Qix";
        }
        return result;
    }
    //Stage1
    public static String countDigitsStage1(int number){


        String result = "";
        ArrayList<Integer> digitsArray = extractDigits(number);
        for (int i =digitsArray.size()-1; i>=0;  i--){
            if(digitsArray.get(i) == 3){
                result+="Foo";
            }
            if(digitsArray.get(i) == 5){
                result+="Bar";
            }
            if(digitsArray.get(i) == 7){
                result+="Qix";
            }
        }
        return result;
    }

    //Stage2
    public static String countDigitsStage2(int number){
        String result = "";
        ArrayList<Integer> digitsArray = extractDigits(number);
        if("".equals(getDivisible( number ))){
            for (int i =digitsArray.size()-1; i>=0;  i--){
                if(digitsArray.get(i) == 0){
                    result+="*";
                }else{
                    result +=digitsArray.get(i);
                }
            }
            return result;
        }
        for (int i =digitsArray.size()-1; i>=0;  i--){
            if(digitsArray.get(i) == 3){
                result+="Foo";
            }
            if(digitsArray.get(i) == 5){
                result+="Bar";
            }
            if(digitsArray.get(i) == 7){
                result+="Qix";
            }
            if(digitsArray.get(i) == 0){
                result+="*";
            }
        }

        return result;
    }




    private static ArrayList<Integer> extractDigits(int number) {
        ArrayList<Integer> ditgitsArray = new ArrayList<>();
        while(number != 0){
            ditgitsArray.add(number % 10);
            number /=10;
        }
        return ditgitsArray;
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
