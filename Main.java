/*
    プログラムのメイン処理　
    このアプリはじゃんけんアプリを通してオブジェクト思考を学ぶアプリです
*/
package junken.main;
import junken.part.*;

public class Main{
    public void static main(String[] args){

        // 審判のインスタンスの作成
        Judge saito = new Judge();

        // プレイヤー1の生成
        Player murata = new Player("村田");

        // プレイヤー2の生成
        Player yamada = new Player("山田");

        // ジャンケンの開始
        saito.judgeJanken(murata,yamada);
    }
}