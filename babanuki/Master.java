import java.util.ArrayList;

public class Master{

    private ArrayList players = new ArrayList();

    // ゲームの準備を行う
    public void prepareGame(Hand cards){

        System.out.println("「カードを配ります」");

        cards.shuffle();

        int numberOfCards = cards.getNumberOfCards();

        int numberOfPlayers = players.size();

        for(int index = 0; index < numberOfCards ; index++){

            Card card = cards.pickCard();


            Player player = (Player)players.get(index % numberOfPlayers);

            player.receiveCard(card);
        }
    }

    // ゲームを開始する
    public void startGame(){

        System.out.println("「Gameを開始します」");

        for(int count = 0 ; players.size() > 1 ; count++){
            
            int playerIndex = count % players.size();
            int nextPlayerIndex = (count + 1) % players.size();

            // 指名するプレイヤーの取得
            Player player = (Player)players.get(playerIndex);

            // 次のプレイヤーの取得
            Player nextplayer = (Player)players.get(nextPlayerIndex);

            // プレイヤーを指名する
            System.out.println(player + "さんの番です");
            player.play(nextplayer);
             
        }
        System.out.println("「Gameを終了します」");
    }

    // 上がりを宣言する
    public void declareWin(Player winner){

        System.out.println(winner + "さんが上がりました");

        // 上がったプレイヤーをリストから外す
        players.remove(players.indexOf(winner));

        // 残りプレイヤーがひとりになった場合は敗者を表示する
        if(players.size() == 1){
            Player loser = (Player)players.get(0);
            System.out.println(loser + "さんの負けです");

        }

    }

    // ゲームに参加する人を登録する
    public void registerPlyerer(Player player){
    
        players.add(player);
    
    }

}