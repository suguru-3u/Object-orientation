/*
*   このファイルはじゃんけんゲームのプレイヤークラスのファイルです。
*/


package part;


public class Murata extends Player{

    /*
    *   プレイヤーコンストラクタ
    *   @param name
    */

    public Murata(String name){
        super(name);
    }

    // ----------------------------------
    // プレイヤークラスの操作
    // ----------------------------------

    /*
    *   ジャンケンの手を出す
    *   @return ジャンケンの手
    */
    public int showHand(){

        // 必ずグーを出す
        return PAPER;
    }
    
}