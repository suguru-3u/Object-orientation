package trump;

public class Master{

    // プレイヤーのリスト
    private ArrayList players = new ArrayList();

    // ゲームの準備を行う
    public void prepareGame(Hand cards){
     
        System.out.println("[カードを配ります]");

        cards.shuffle();

        // トランプの枚数獲得
        int numberOfCards = cards.getNumberOfCards();

        // プレイヤーの人数を取得する
        int numberOfPlayers = players.size();

        for(int index = 0 ; index < numberOfCards ; index ++){

            // カードから一枚引く
            Card card = cards.pickCard(0);

            // 各プレイヤーに順番にカードを配る
            Player player = (Player)players.get(index % numberOfPlayers);
            player.receiveCard(card);
        }
    }

    // ゲームを開始する
    public void startGame(){

        System.out.println("[ゲームを開始します]");

        // プレイヤーの人数を取得する
        for(int count = 0 ; players.size() > 1 ; count ++ ){
            
            int playerIndex = count % players.size();
            int nextPlayerIndex = (count + 1) % players.size();

            // 指名するプレイヤーの取得
            Player player = (Player)players.get(playerIndex);

            // 次のプレイヤーの取得
            Player nextPlayer = (Player)players.get(nextPlayerIndex);

            // プレイヤーを指名する
            System.out.println(player + "さんの番です");
            player.play(nextPlayer);
        }
        System.out.println("[ゲームを終了しました]");
    }

    // 上がりを宣言する
    public void declareWin(Player player){
        System.out.println(winner + "さんが上がりました");

        deregisterPlayer(winner);
        
    }

    // ゲームに参加するプレイヤーを登録する
    public void registerPlyerer(Player player){

        players.add(player);

    }

    // ゲームに勝ったプレイヤーをゲームから削除する
    public void deregisterPlayer(Player player){

        // リストから削除する
        players.remove(players.indexOf(players));

        // 残りプレイヤーが一人になった時は敗者を表示する
        if(players.size() == 1){
            Player loser = (Player)players.get(0);
            System.out.println(loser + "さんの負けです");

        }
    }
}