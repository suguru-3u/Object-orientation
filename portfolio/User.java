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

    // ユーザーがTaskを登録するメソッド
    public void memoContentCreate(){
        System.out.println("登録したいTaskを入力してください");

        String taskTitle = KeyBord.inputKeyBordTitle();

        String taskMain = KeyBord.inputKeyBordMain();

        Task task = new Task(taskTitle,taskMain);

        this.taskMemo.setTasks(task);
        
    }

    // ユーザーが登録したTaskを削除するメソッド
    public void memoContentDelete(){

        System.out.print("削除したいTaskの番号を入力してください：　");
        int taskSerchCheack = this.taskMemo.getTask();

        if(taskSerchCheack >= 0){
            this.taskMemo.deleteTask(taskSerchCheack);
        }
    }

    // ユーザーが登録したTaskの内容を変更するメソッド
    public void memoContentEdit(){
        
        System.out.print("編集したいTaskの番号を入力してください：　");
        int taskSerchCheack = this.taskMemo.getTask();

        if(taskSerchCheack >= 0){

            String taskTitleChange = KeyBord.inputKeyBordTitle();

            String taskMainChange = KeyBord.inputKeyBordMain();

            Task taskChange = new Task(taskTitleChange,taskMainChange);

            taskMemo.changeTask(taskSerchCheack,taskChange);
        }
    }
}