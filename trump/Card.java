package trump;

public class Card{
    
    public static final int SUIT_SPADE = 1 ;
    public static final int SUIT_DIAMONDO = 2 ;
    public static final int SUIT_CLUB = 3 ;
    public static final int SUIT_HEART = 4 ;
    public static final int SUIT_NUM = 4 ;
    public static final int CARD_NUM = 13 ;

    protected int suit;

    protected int number;

    // コンストラクタ
    public Card(int suit,int number){
        this.suit = suit;
        this.number = number;
    }

    // 数を見る
    public int getNUmber(){
        return this.number;
    }

    // スートを見る
    public int getSuit(){
        return this.suit;
    }

    // カードを文字列で表現する
    public String toString(){

        StringBuffer string = new StringBuffer();

        // スートの表示
        switch(this.suit){
            case SUIT_SPADE:
                string.append("S");
                break;

            case SUIT_DIAMONDO:
                string.append("D");
                break;

            case SUIT_CLUB:
                string.append("C");
                break;

             case SUIT_HEART:
                string.append("H");
                break;

            default:
                break;
        }

        // 数の表示
        switch(this.number){
            case 1:
                string.append("A");
                break;

            case 10:
                string.append("T");
                break;
            
            case 11:
                string.append("J");
                break;

            case 12:
                string.append("Q");
                break;

            case 13:
                string.append("K");
                break;

            default:
                string.append(this.number);
                break;
        }

        return string.toString();
    }
}