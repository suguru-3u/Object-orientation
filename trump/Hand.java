package trump;

import java.util.ArrayList;

public class Hand{

    // 手札にあるカードの保持用の変数
    private ArrayList hand = new ArrayList();

    // カードを加える
    public void addCard(Crad card){
        hand.add(card);
    }

    // カードを見る
    public Crad lookCard(int position){

        Card lookingCard = null;

        // 引数で指定された位置のチェック
        if((0 <= position) && (position < hand.size())){
            lookingCard = (Card)hand.get(position);
        }

        return lookingCard;
    }

    // カードを引く
    public Card pickCard(int position){
        
        Card pickedCard = null;

        // 引数で指定された位置のチェック
        if((0 <= position) && (position < hand.size())){
            pickedCard = (Card)hand.get(position);
        }

        return pickedCard;
    }

    // シャッフル
    public void shuffle(){

        // 手札の数の取得
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
    public int getNUmberOfCard(){

        return hand.size();
    }

    // 手札にあるカードを文字列で表す
    public String toString(){

        StringBuffer string = new StringBuffer();

        int size = hand.size();

        if(size > 0){
            for(int index = 0 ; index < size ; index ++){
                Card card = (Card)hand.get(index);
                string.append(card);
                string.append("");
            }
        }

        return string.toString();
    }
}