package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner chill = new Scanner(System.in);
        String c = chill.next();
        Code guy = new Code(c);
        while (true) {
            int e = chill.nextInt();
            if (e == 1)
            guy.hide(0, guy.getCode().length());
            else if (e == 0)
            guy.recover(0, guy.getCode().length());
            System.out.println(guy.getCode());
        }
    }
}
