/*
* アプリを利用するユーザークラス
* ユーザーを抽象化させたHumanクラスを継承している
* 抽象メソッド[delete]をオーバーライドしないといけない
*/

import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class User extends Human{

    // Taskクラスを収納
    private TaskMemo taskMemo;

    // コンストラクタ
    public User(){
    } 

    // TaskMemoをインスタンス変数に格納
    public void setTaskMemo(TaskMemo taskMemo){
        this.taskMemo = taskMemo; 
    }

    // ユーザーがタスクを登録するメソッド
    public void memoContentCreate(){
        System.out.println("登録したいTaskを入力してください");
        try {
        // キーボード入力を受け付ける
        Scanner title = new Scanner(System.in);
        System.out.print("TaskのTitleを入力してください：　");
        String taskTitle = title.nextLine();

        // キーボード入力を受け付ける
        Scanner main = new Scanner(System.in);
        System.out.print("TaskのMainを入力してください ：　");
        String taskMain = main.nextLine();

        Task task = new Task(taskTitle,taskMain);

        this.taskMemo.setTasks(task);

        } catch (Exception e) {

        System.out.println(e.getMessage());

        }
        
    }

    // ユーザーが登録したタスクを削除するメソッド
    // public List<Task> delete(List<Task> task){
        
    // }
}