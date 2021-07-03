/*
* このクラスは利用者と管理者の機能の元を持っている人間クラス
*/

abstract class Human{
    private String name;

     public Human(String name){
        this.name = name;
    }

    // // Taskを生成
    // abstract public <T> T create();

    // タスクを削除
    // abstract public <T> T delete(T t);


    public String getName(){
        return this.name;
    }

}