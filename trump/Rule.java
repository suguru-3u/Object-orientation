package trump;

public interface Rule{

    // テーブルに置けるカードを探す。
    // 手札とテーブルから、テーブルに出しうるカードの組合せを探す

    public Card[] findCandidate(Hand hand,Table table);
}