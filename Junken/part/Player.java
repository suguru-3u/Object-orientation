/*
*   このファイルはじゃんけんゲームのプレイヤークラスのファイルです。
*/


package part;


public class Player{

    // じゃんけんの手を表す定数
    public static final int STONE = 0;
    public static final int SCISSORS = 1;
    public static final int PAPER = 2;

    // ----------------------------------
    // プレイヤークラスの属性
    // ----------------------------------
    
    // プレイヤーの名前
    private String name;

    // プレイヤーの勝った回数
    private int winCount;

    private Tactics tactics;

    // ----------------------------------
    // インスタンス生成時のコンストラクタ
    // ----------------------------------

    /*
    *   プレイヤーコンストラクタ
    *   @param name
    */

    public Player(String name){
        this.name = name;
    }


    // ----------------------------------
    // プレイヤークラスの操作
    // ----------------------------------

    public void setTactics(Tactics tactics){
        this.tactics = tactics;
    }

    /*
    *   ジャンケンの手を出す
    *   @return ジャンケンの手
    */
    public int showHand(){

        int hand = tactics.readTactics();

        return hand;
    }

    /*
    *   審判から勝敗を聞く
    *   @param result true:勝ち、flase:負け
    */
    public void notifyResult(boolean result){
        if(true == result){

            // 勝った場合は勝ち数を加算する
            winCount += 1;
        }
    }

    /*
    *   自分の名前を答える
    *   @return 自分の名前
    */
    public String getName(){
        return this.name;
    }

    /*
    *   自分が勝った回数を答える
    *   @return 勝った回数
    */
    public int getWinCount(){
        return this.winCount;
    }



    

}