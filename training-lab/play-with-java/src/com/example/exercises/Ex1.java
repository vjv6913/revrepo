package com.example.exercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        /*
            ABCDCBA
            ABC CBA
            AB   BA
            A     A
         */

        String s = new String();
        char x = 65;
        int j = 1;
        int c = 1;
        int n;
        int k =0;
        int m=0;
        int a;

        String t = new String();
        String u = new String();
        String v = new String();
        String w = new String();


        char y = 'A';

        Scanner scanner = new Scanner(System.in);

        int h = (int) x;
       do {
           if(c==1){

               System.out.println("Please provide a letter:");
               t = scanner.nextLine();
               y = t.charAt(0);
               n = (int) y;
               if(n>64 && n<91){
                   a = 0;

                   m = (y - h) * 2 + 1;

                   c=2;

               }else {

                   System.out.println("Your input must be a single capital letter A through Z");
                   c=1;

               }

           }



        } while (c==1);




        while (k < y - h + 1) {

            x = 65;
            w = "";

            for (int i = 0; i < m; i++) {
                if (i < y - h) {
                    j = 1;
                } else {
                    j = 2;
                }


                switch (j) {

                    case 1:
                        w = w + x;
                        x++;
                        break;

                    case 2:
                        w = w + x;
                        x--;
                        break;
                    case 3:
                        w = w + " ";
                        x--;
                        break;
                    case 4:
                        w = w + " ";
                        x++;
                        break;

                    default:
                        break;
                }

                k++;
            }
            System.out.println(w);


            char ch = ' ';

            for (int i = 0; i<y-h; i++){
                w = w.substring(0, y-h+i) + ch + w.substring(y-h + 1+i);
                w = w.substring(0, y-h-i) + ch + w.substring(y-h + 1-i);
                System.out.println(w);
            }


            }

        int z = t.length();
        if(z == 1){
            System.out.println();
            System.out.println("Ain't it pretty!");
        }else {
            System.out.println("You typed more than just a letter but we used the first letter in the string as" +
                    " it was a capital letter that could be used.");

        }

    }
}
