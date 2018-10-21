package com.zadachi;

public class Main {

    public static void main(String[] args) {
        boolean x =true;
        for (int i=2; i<=100; i++){
            for (int j=2; j<i; j++){
                if (i%j==0){
                    x=false;
                    break;
                }
            }
            if (x) System.out.print(i+" ");
            x=true;
        }
    }
}
