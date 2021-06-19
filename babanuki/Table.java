

import java.util.ArrayList;

public class Table{
    private ArrayList disposedCards = new ArrayList();

    // カードを捨てる
    public void disposedCard(Card card[]){

        for(int index = 0; index < card.length; index ++){

            System.out.print(card[index] + " ");
        }
        
        System.out.println("を捨てました");

        disposedCards.add(card);
    }
}