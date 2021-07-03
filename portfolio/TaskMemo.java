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
        if(tasks.isEmpty()){
            System.out.println("");
            System.out.println("現在抱えているTaskはありません");
            System.out.println("");
        }else{
            System.out.println("");
            this.tasks.stream()
            .filter(i -> i.getFinishFlg() == false)
            .map(i -> tasks.indexOf(i) + 1 + " タイトル：　" + i.getTitle() + "　詳細：　" + i.getMain())
            .forEach(i -> System.out.println(i));
            System.out.println("");
        }
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

    // 特定の要素を削除する 
    public void deleteTask(int taskNumber){
        System.out.println("削除処理を実行します");
        try{
            this.tasks.remove(taskNumber);
            System.out.println("削除に成功しました");
        }catch(IndexOutOfBoundsException e){
            System.out.println("削除に失敗しました");
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