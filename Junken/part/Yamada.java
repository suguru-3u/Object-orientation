/*
*   このファイルはじゃんけんゲームのプレイヤークラスのファイルです。
*/


package part;


public class Yamada extends Player{

    // ----------------------------------
    // プレイヤークラスの操作
    // ----------------------------------

    /*
    *   ジャンケンの手を出す
    *   @return ジャンケンの手
    */
    public int showHand(){

        // プレイヤーの手
        int hand = 0;

        // 0.0以上3.0未満の少数として乱数を得る
        double randomNum = Math.random() * 3;
        if(randomNum < 1){
            // randomNumが0.0以上1.0未満の場合グー
            hand = STONE;
        }else if(randomNum < 2){
            // randomNumが1.0以上2.0未満の場合チョキ
            hand = SCISSORS;
        }else if(randomNum < 3){
            // randomNumが2.0以上3.0未満の場合パー
            hand = PAPER;
        }
        // 決定した手を戻り値として返す
        return hand;
    }
    
}