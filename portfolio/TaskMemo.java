/*
* Userが登録したTaskを表示させるクラス
* Taskを表示させるmethodを記載
*/
import java.util.ArrayList;

public class TaskMemo implements Memo{

    // Taskを格納するフィールド
    private List<Task> tasks = ArrayList<>();

    // Taskを格納するメソッド
    public void setTasks(Task task){
        this.tasks.add(task);
    }

    // 特定のTaskを表示させるメソッド
    public Task getTasks(int taskNumber){
        try{
            Task task = this.tasks.get(taskNumber);
            return task.toString();
        }catch(IndexOutOfBoundsException e){
            return System.out.println("指定された番号はございませんでした");
        }
    }

    // クラスの内容表示メソッド
    public String toString(){
        return this.tasks.stream()
        .filter( -> tasks.getFinishFlg() = false)
        .map( -> "タイトル：　" + tasks.getTitle() + "詳細：　" + tasks.getMain())
        .forEach(System.out::println);
    }

}