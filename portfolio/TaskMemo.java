/*
* Userが登録したTaskを表示させるクラス
* Taskを表示させるmethodを記載
*/

public class TaskMemo implements Memo{

    // Taskを格納するフィールド
    private List<Task> tasks = ArrayList<>();

    // Taskを格納するメソッド
    public void setTasks(List<Task> task){
        this.tasks.add(task);
    }

    // Taskを表示させるメソッド
    public List<Task> getTasks(){
        return this.tasks
    }

    public String toString(){
        return this.tasks.stream()
        .filter( -> tasks.getFinishFlg() = false)
        .map( -> "タイトル：　" + tasks.getTitle() + "詳細：　" + tasks.getMain())
        .forEach(System.out::println)
    }

}