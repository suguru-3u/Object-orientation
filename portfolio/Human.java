/*
* このクラスは利用者と管理者の機能の元を持っている人間クラス
*/

abstract class Human{
    private String name;

    public Human(){
    }

    // Taskを生成
    abstract public void memoContentCreate();

    // タスクを削除
    // abstract public <T> T delete(T t);


    // 名前をインスタンス変数に格納
    public void setName(String name){
        this.name = name;
    }

    // 名前をインスタンス変数から取得
    public String getName(){
        return this.name;
    }



}