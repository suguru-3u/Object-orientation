/*
* アプリを利用するユーザークラス
* ユーザーを抽象化させたHumanクラスを継承している
* 抽象メソッド[delete]をオーバーライドしないといけない
*/

public class User extends Human{

    // コンストラクタ
    public User(String name){
        super(name);
    }

    // ユーザーが登録したタスクを削除するメソッド
    public List<Task> delete(List<Task> task){
        
    }
}