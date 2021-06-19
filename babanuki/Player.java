

public class Player{

    private Master master;

    private Table table;

    private Hand myHand = new Hand();

    private String name;

    public Player(String name,Master master,Table table){
        this.name = name;
        this.master = master;
        this.table = table;
    }

    // 順番を指定する
    public void play(Player nextplayer){

        // 次のプレイヤーに手札を出してもらう
        Hand nextHand = nextplayer.showHand();

        // 相手の手札から一枚引く
        Card pickedCard = nextHand.pickCard();

        System.out.println(this + ":" + nextplayer + "さんから" + pickedCard + "を引きました");

        // 引いたカードを自分の手札に加える。同じカードがあった場合は捨てる
        dealCard(pickedCard);

        if(myHand.getNumberOfCards() == 0){
            master.declareWin(this);
        }else{
            System.out.println(this + ":残りの手札は" + myHand + "です");
        }
    }

    // 手札を見せる
    public Hand showHand(){

        if(myHand.getNumberOfCards() == 1){
            master.declareWin(this);
        }

        myHand.shuffle();

        return myHand;
    }

    // カードを受け取る
    public void receiveCard(Card card){

        dealCard(card);
    }

    // カードを自分の手札に加えて、同じ数のカードがあった場合は捨てる
    public void dealCard(Card card){

        myHand.addCrad(card);

        Card[] sameCards = myHand.findSameNumberCard();

        if(sameCards != null){

            System.out.println(this + ":");
            table.disposedCard(sameCards);
        }
    }

    // プレイヤーの名前を返す
    public String toString(){
        return name;
    }
}