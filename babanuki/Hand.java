import java.util.ArrayList;

public class Hand{

    // 手札
    private ArrayList hand = new ArrayList();

    // カードを加える
    public void addCrad(Crad card){
        hand.add(card);
    }

    // カードを引く
    public Card pickCard(){
        Crad pickedCrad = (Crad)hand.remove(0);

        return pickedCrad;
    }

    // シャッフルする
    public void shuffle(){
        
        // 手札の枚数を取得
        int number = hand.size();

        // カードを抜き出す位置
        int pos;

        // カードをランダムに抜き取って最後に加える動作を繰り返す
        for(int count = 0; count < number * 2 ; count++){

            // ランダムの位置からカードを一枚抜き取る
            pos = (int)(Math.random() * number);
            Card pickedCrad = (Card)hand.remove(pos);

            // 抜き取ったカードを最後に加える
            hand.add(pickedCrad);
        }
    }

    // 枚数を数える
    public int getNumberOfCards(){
        return hand.size();
    }

    // 同じカードを探す
    // ない場合はnullを返す
    public Card[] findSameNumberCard(){
        
        int numberOfCards = hand.size();
        Crad[] sameCards = null;
        
        // 手札にカードが一枚もない場合は何もしない
        if(numberOfCards > 0){

            // 最後に追加されたカード情報を取得する
            int lastIndex = numberOfCards -1;
            Card lastAddedCard = (Card)hand.get(lastIndex);

            // 最後に追加されたカードの数字を取得する
            int lastAddedCardNum = lastAddedCard.getNumber();

            for(int index = 0 ; index < lastIndex ; index++){
                Card card = (Card)hand.get(index);
                if(card.getNumber() == lastAddedCardNum.getNumber()){

                    // 最後に追加されたカードと同じカードが見つかった場合
                    // 見つかった組合せをsameCardsに格納し,ループを抜ける
                    sameCards = new Card[2];
                    sameCards[0] = (Card)hand.remove(lastIndex);
                    sameCards[1] = (Card)hand.remove(index);

                    break;
                }
            }
        } 

        return sameCards;
    }

    // 手札にあるカードを文字列で表す
    public String toString(){
        StringBuffer string = new StringBuffer();

        int size = hand.size();
        if(size > 0){
            for(int index = 0 ; index < size ; index++){
                Card card = (Card)hand.get(index);
                string.append(card);
                string.append(" ");
            }
        }

        return string.toString();
    }

}