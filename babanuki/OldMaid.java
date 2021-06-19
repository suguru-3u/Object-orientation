public class OldMaid{
    public static void main(String[] args){

        // 進行役の生成
        Master master = new Master();

        // テーブルの生成
        Table field = new Table();

        // プレオヤーの生成
        Player murata = new Player("村田",master,field);
        Player yamada = new Player("山田",master,field);
        Player saito = new Player("斉藤",master,field);

        // 進行役へのプレイヤー
        master.registerPlyerer(murata);
        master.registerPlyerer(yamada);
        master.registerPlyerer(saito);

        // トランプを生成する
        Hand trump = createTrump();

        // ゲームの準備をする
        master.prepareGame(trump);

        // ゲームを開始する
        master.startGame();

    }

    // 53枚のトランプを生成する
    private static Hand createTrump(){

        Hand trump = new Hand();

        for(int number = 1 ; number <= 13 ; number++){
            trump.addCrad(new Card(Card.SUIT_CLUB,number));
            trump.addCrad(new Card(Card.SUIT_DIAMONDO,number));
            trump.addCrad(new Card(Card.SUIT_HEART,number));
            trump.addCrad(new Card(Card.SUIT_SPADE,number));
        }

        // ジョーカーの作成
        trump.addCrad(new Card(0,Card.JOKER));

        return trump;
    }
}