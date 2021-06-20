package trump;

public class Joker extends Card{

    // コンストラクタ
    public Joker(){
        super(0,0);
    }

    // 数を変更する
    public void setSuit(int number){
        this.number = number;
    }

     // スートを変更する
    public void setSuit(int suit){
        this.suit = suit;
    }

    // カードを文字列で表現する
    public String toString(){
        return "JK";
    }


}