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

    // ユーザーがタスクを登録するメソッド
    public Task create(String title,String main){
        System.out.println("Task登録開始します");
        Task taskCreaet = new Task(title,main);
        System.out.println("Task登録完了しました");
        return taskCreaet;
    }

    // ユーザーが登録したタスクを削除するメソッド
    // public List<Task> delete(List<Task> task){
        
    // }
}