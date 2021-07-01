/*
* Userが登録したTaskを表示させるクラス
* Taskを表示させるmethodを記載
*/
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class TaskMemo implements Memo{

    // Taskを格納するフィールド
    private List<Task> tasks = new ArrayList<Task>();

    // Taskを格納するメソッド
    public void setTasks(Task task){
        this.tasks.add(task);
    }

    // Taskを格納するメソッド
    public List<Task> getTasks(){
        return this.tasks;
    }

    public void tasksShow(){
        System.out.println("");
        this.tasks.stream()
        .filter(i -> i.getFinishFlg() == false)
        .map(i -> tasks.indexOf(i) + 1 + " タイトル：　" + i.getTitle() + "　詳細：　" + i.getMain())
        .forEach(i -> System.out.println(i));
        System.out.println("");
    }


    // 特定のTaskを表示させるメソッド
    public String getTasks(int taskNumber){
        try{
            Task task = this.tasks.get(taskNumber);
            return task.toString();
        }catch(IndexOutOfBoundsException e){
            String message = "指定された番号はございませんでした";
            return message;
        }
    }

    // クラスの内容表示メソッド
    public String toString(){

        String tasksString = this.tasks.stream()
        .filter(i -> i.getFinishFlg() == false)
        .map(i -> "　タイトル：　" + i.getTitle() + "　詳細：　" + i.getMain())
        .collect(Collectors.joining(", "));

        return tasksString;
    }

}