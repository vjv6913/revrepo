package com.example.exercises;

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

        String t = new String();
        String u = new String();
        String v = new String();
        String w = new String();


        char y;

        Scanner scanner = new Scanner(System.in);

        int h = (int) x;
        System.out.println("Please provide a letter:");
        t = scanner.nextLine();
        y = t.charAt(0);
        int n = (int) y;
        int k = 0;
        int a = 0;

        int m = (y - h) * 2 + 1;



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

    }
}
