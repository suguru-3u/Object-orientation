/*
*　ジャンケンの審判を表すクラス
*/

package part;

public class Judge{ 

    // ----------------------------------
    // プレイヤークラスの操作
    // ----------------------------------

    /*
    *   ジャンケンを開始する
    *   @param player1 判定対象プレイヤー1
    *   @param player2 判定対象プレイヤー2
    */

    public void startJabken(Player player1,Player player2){

        // ジャンケンの開始を宣言する
        System.out.println("[ジャンケン開始]");

        // ジャンケンを３回行う
        for(int cnt = 0; cnt < 3; cnt++){

            // 何戦目か表示する
            System.out.println("[" + (cnt + 1) + "回線目]");

            // プレイヤーの手を見てどちらが勝ちか判定する
            Player winner = judgeJanken(player1,player2);
               
            if(winner != null){
                // 勝者を表示する
                System.out.println(winner.getName() + "が勝ちました");

                // 勝ったプレイヤーに結果を伝える
                winner.notifyResult(true);
            }else{
                // 引き分けの場合
                System.out.println("引き分けです");
            }
        }
            
        // ジャンケンの終了を伝える
        System.out.println("[ジャンケン終了]");
        
        // 最終的な勝者を判定する
        Player finalWinner = judgeFinalWinner(player1,player2);

        // 結果の表示
        System.out.println(player1.getWinCount() + "対" + player2.getWinCount());

        if(finalWinner != null){
            // 勝者を表示する
            System.out.println(finalWinner.getName() + "の勝ちです");
        }else{
            // 引き分けの場合
            System.out.println("引き分けです");
        }

        /*
        *   プレイヤーの手を見てどちらが勝ちか判定する
        *   @param player1 判定対象プレイヤー1
        *   @param player2 判定対象プレイヤー2
        *   @retrun 勝ったプレイヤー。引き分けの場合はnullを返す
        */


    }
    public Player judgeJanken(Player player1,Player player2){

        Player winner = null;

        // プレイヤー1の手を出す
        int player1hand = player1.showHand();

        // プレイヤー2の手を出す
        int player2hand = player2.showHand();

        printHand(player1hand);
        System.out.print(" vs. ");
        printHand(player2hand);
        
        // プレイヤー1が勝つ場合
        if((player1hand == Player.STONE && player2hand == Player.SCISSORS) 
            || (player1hand == Player.SCISSORS && player2hand == Player.PAPER)
            || (player1hand == Player.PAPER && player2hand == Player.STONE)){
            winner = player1;
        }
        // プレイヤー2が勝つ場合
        else if((player1hand == Player.STONE && player2hand == Player.SCISSORS) 
            || (player1hand == Player.SCISSORS && player2hand == Player.PAPER)
            || (player1hand == Player.PAPER && player2hand == Player.STONE))
        {
            winner = player2;
        }

        // どちらでもない場合は引き分けを(nullを返す)
        return winner;
    }

    /*
    *   最終的な勝者を判定する
    *   @param player1 判定対象プレイヤー1
    *   @param player2 判定対象プレイヤー2
    *   @retrun 勝ったプレイヤー。引き分けの場合はnullを返す
    */

    public Player judgeFinalWinner(Player player1,Player player2){
        Player winner = null;

        // Player1から勝ち数を聞く
        int player1WinnerCnt = player1.getWinCount();
        
        // Player2から勝ち数を聞く
        int player2WinnerCnt = player2.getWinCount();

        if (player1WinnerCnt > player2WinnerCnt)
        {
            // プレイヤー1の勝ち
            winner = player1;
            
        }else if(player1WinnerCnt < player2WinnerCnt)
        {
                // プレイヤー2の勝ち
            winner = player2;
        }
        // どちらでもない場合は引き分けを(nullを返す)
        return winner;
    }

        /*
    *   ジャンケンの手を表示する
    *   @param hand ジャンケンの手
    */

    public void printHand(int hand){
        switch(hand){
            case Player.STONE:
                System.out.println("グー");
                break;

            case Player.SCISSORS:
                System.out.println("チョキ");
                break;

            case Player.PAPER:
                System.out.println("パー");
                break;

            default:
                break;
        }
    }
}