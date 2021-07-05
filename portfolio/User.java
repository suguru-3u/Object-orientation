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

        System.out.print("TaskのTitleを入力してください：　");
        String taskTitle = KeyBord.inputKeyBordString();

        System.out.print("TaskのMainを入力してください ：　");
        String taskMain = KeyBord.inputKeyBordString();

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

            System.out.print("TaskのTitleを入力してください：　");
            String taskTitleChange = KeyBord.inputKeyBordString();

            System.out.print("TaskのMainを入力してください ：　");
            String taskMainChange = KeyBord.inputKeyBordString();

            Task taskChange = new Task(taskTitleChange,taskMainChange);

            taskMemo.changeTask(taskSerchCheack,taskChange);
        }
    }
}