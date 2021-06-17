/*
*   このファイルはじゃんけんゲームのプレイヤークラスのファイルです。
*/


package part;


public class Yamada extends Player{

    /*
    *   プレイヤーコンストラクタ
    *   @param name
    */

    public Yamada(String name){
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
        return STONE;
    }
    
}