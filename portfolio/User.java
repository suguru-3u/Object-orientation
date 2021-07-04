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

    // ユーザーが登録したTaskを削除するメソッド
    public void memoContentDelete(){

        System.out.print("削除したいTaskの番号を入力してください：　");
        int taskSerchCheack = this.taskMemo.getTask();

        if(taskSerchCheack >= 0){
            this.taskMemo.deleteTask(taskSerchCheack);
        }

        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }

    }

    // ユーザーが登録したTaskの内容を変更するメソッド
    public void memoContentEdit(){
        System.out.print("編集したいTaskの番号を入力してください：　");
       
        System.out.print("削除したいTaskの番号を入力してください：　");
        int taskSerchCheack = this.taskMemo.getTask();

        if(taskSerchCheack >= 0){
            Scanner titleChange = new Scanner(System.in);
            System.out.print("TaskのTitleを入力してください：　");
            String taskTitleChange = titleChange.nextLine();

            // キーボード入力を受け付ける
            Scanner mainChange = new Scanner(System.in);
            System.out.print("TaskのMainを入力してください ：　");
            String taskMainChange = mainChange.nextLine();

            Task taskChange = new Task(taskTitleChange,taskMainChange);

            taskMemo.changeTask(taskSerchCheack,taskChange);
        }

        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }
    }
}