package com.company;

public class Word {
    //フィールド＝オブジェクト
    public String word;
    public String meaning;

    //
    public class Word(String word,String meaning){
        this.word=word;
        this.meaning=meaning;
    }

    //単語を出力

    public void getMeaning(){
        System.out.println("単語"+this.word+" 意味"+this.meaning);
    }


}
