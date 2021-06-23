/*
* このクラスは利用者と管理者の機能の元を持っている人間クラス
*/

abstract class Human{
    private String name;

    abstract public <T> T delete(T t);

    public String getName(){
        return this.name;
    }

}