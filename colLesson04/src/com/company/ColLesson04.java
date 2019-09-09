package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ColLesson04 {

    private static Object ArrayList;

    public static void main(String[] args) {

        //{words(word="apple",meaning="りんご"),....}
        ArrayList<Word> words  =new ArrayList<>(10);


        //入力の定義
        System.out.println("わからなかった単語とその意味をスペースで区切って入力して下さい。");
        Scanner scanner1=new Scanner(System.in);//Scannerのインスタンス化
        String input = scanner1.nextLine();//文字列の受取

        //繰り返し定義
        int index = 0;
        while(!input.equals("e")) {
            String[] data=input.split(" " ); //{"apple", "りんご"}
            try {
                Word word2 = new Word(data[0], data[1]);
                words.add(word2);
                index++;
                System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します");
                input=scanner1.nextLine();
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("登録制限を超えました。登録済のデータは以下になります");
                break;
            }
        }



        for(int i = 0;i < words.size(); i++) {
            System.out.println(words.get(i).toString());
        }
        System.out.println(index + "件、登録しました");
    }
}
