package com.example.exercises;

import org.w3c.dom.ls.LSOutput;

public class Ex2 {

    public static void main(String[] args) {

        String s1 = new String("* * * * * * ==================================");
        String s2 = new String(" * * * * *  ==================================");
        String s3 = new String("==============================================");
        int j;

        for(int i = 1; i<16; i++){
            if (i==1 || i==3 || i==5 || i==7 || i==9){
                j=1;
            }else if (i==2 || i==4 || i==6 || i==8){
                j=2;
            }else{
                j=3;
            }
            switch (j){
                case 1:
                    System.out.println(s1);
                    break;

                case 2:
                    System.out.println(s2);
                    break;
                case 3:
                    System.out.println(s3);
                    break;

                default:
                    break;
            }

        }

    }

}
