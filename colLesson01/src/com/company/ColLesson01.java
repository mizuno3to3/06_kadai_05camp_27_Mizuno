package com.company;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class ColLesson01 {
    public static void main(String[] args) {

        //{words(word="apple",meaning="りんご"),....}
        Word[] words  =new Word[10];


        //入力の定義
        System.out.println("わからなかった単語とその意味をスペースで区切って入力して下さい。");
        Scanner scanner1=new Scanner(System.in);//Scannerのインスタンス化
        String input = scanner1.nextLine();//文字列の受取
        //繰り返し定義
        int index = 0;
        while(!input.equals("e")){
            String[] data=input.split(" " );
            Word word2 = new Word(data[0], data[1]);
            words[index] = word2;
            index++;
            System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します");
            input=scanner1.nextLine();
        }


        for(int i = 0;i < index; i++) {
            System.out.println("単語：" + words[i].word + "　日本語：" + words[i].meaning);
        }
        System.out.println(index + "件、登録しました");

//        Scanner scanner1=new Scanner(System.in);
//        String input1= scanner1.next(); // "apple りんご"
//        String[] data=input1.split(" " ); //{"apple", "りんご"}
//        // data[0] apple
//        // data[1] ringo
//        Word word = new Word(data[0], data[1]);
//        words[0] = word;
//
//
//        System.out.println(word.getMeaning());






    }

}
