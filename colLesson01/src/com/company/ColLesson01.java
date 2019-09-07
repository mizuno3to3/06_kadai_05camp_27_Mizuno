package com.company;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class ColLesson01 {
    public static void main(String[] args) {

        Word
        String[] word=new String[10];


        System.out.println("わからなかった単語とその意味をスペースで区切って入力して下さい。");

        Scanner scanner1=new Scanner(System.in);
        String input1= scanner1.next();

        String str=input1;
        String[] data=str.split(" " );


        Word output01=new Word();
        System.out.println(output01.getMeaning());






    }

}
