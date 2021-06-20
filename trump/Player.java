package trump;

public abstract class Player{

    protected String name;

    protected Table table;

    protected Hand myHand = new Hand();

    protected Master master;

    protected Rule rule;

    // コンストラクト
    public Player(Strig name,Master master,Table table,Rule rule){
        this.name = name;
        this.master = master;
        this.table = table;
        this.rule = rule;
    }

    // 順番を指定する
    public abstract void play(Player nextPlayer);

    // カードを配る
    public void receiveCard(Card card){

        myHand.addCard(card);
    }

    // プレイヤーの名前を返す
    public String toString(){
        return name;
    }
}
