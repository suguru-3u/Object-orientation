package part;

public class RandomTactics implements Tactics{
    public int readTactics(){
          // プレイヤーの手
        int hand = 0;

        // 0.0以上3.0未満の少数として乱数を得る
        double randomNum = Math.random() * 3;
        if(randomNum < 1){
            // randomNumが0.0以上1.0未満の場合グー
            hand = Player.STONE;
        }else if(randomNum < 2){
            // randomNumが1.0以上2.0未満の場合チョキ
            hand = Player.SCISSORS;
        }else if(randomNum < 3){
            // randomNumが2.0以上3.0未満の場合パー
            hand = Player.PAPER;
        }
        // 決定した手を戻り値として返す
        return hand;
    }

}