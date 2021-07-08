import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;

import java.sql.*;


public class Main{
  public static void main(String[] args){

    // インスタンス変数生成
    TaskMemo taskMemo = new TaskMemo();
    boolean app = true;
    User user = new User();

    // ユーザー情報入力   
    System.out.print("お名前を入力してください:");
    String yoursName = KeyBord.inputKeyBordString();

    user.setName(yoursName);
    user.setTaskMemo(taskMemo);

    System.out.println("こんにちは、" + user.getName() + "さん");

    // Taskメイン機能
    while(app){

      System.out.println("");
      System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
      System.out.println("■　抱えているTask一覧　　　■");
      System.out.println("■　Task数 ： " + taskMemo.getTasksNumbers() + "個 　　 　　 ■");
      System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■");

      taskMemo.tasksShow();

      System.out.print("Taskを入力する場合は「1」、Taskを削除する場合は「２」、Taskを編集する場合は「３」、終了する場合は「５」を入力してください　：");
      System.out.print("");

      int yoursTask = KeyBord.inputKeyBordInt();

      switch(yoursTask){

        // Task登録処理
        case 1 :
          user.memoContentCreate();
          break;

        // Task削除処理
        case 2 :
          user.memoContentDelete();
          break;

        // Task内容変更処理
        case 3 :
          user.memoContentEdit();
          break;

        case 5 :
          app = false;
          break;

        default:
          System.out.print("正しく入力してください");
          break;
      }
    }
  }
}