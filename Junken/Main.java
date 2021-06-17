/*
    プログラムのメイン処理　
    このアプリはじゃんけんアプリを通してオブジェクト思考を学ぶアプリです
*/
import part.*;
// import Judge.*;

public class Main{
    public static void  main(String[] args){

        // 審判のインスタンスの作成
        Judge saito = new Judge();

        // プレイヤー1の生成
        Player murata = new Player("村田");

        Tactics muratatactics = new RandomTactics();

        murata.setTactics(muratatactics);

        // プレイヤー2の生成
        Player yamada = new Player("山田");

        Tactics tactics = new StoneOnly();

        yamada.setTactics(tactics);

        // ジャンケンの開始
        saito.startJabken(murata,yamada);
    }
}