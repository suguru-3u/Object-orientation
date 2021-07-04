import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Main{
  public static void main(String[] args){

    // インスタンス変数生成
    TaskMemo taskMemo = new TaskMemo();
    boolean app = true;
    User user = new User();

    // ユーザー情報入力
    try {
      // キーボード入力を受け付ける
      System.out.print("お名前を入力してください:");
      Scanner name = new Scanner(System.in);
      String yoursName = name.nextLine();

      user.setName(yoursName);
      user.setTaskMemo(taskMemo);

      System.out.println("こんにちは、" + user.getName() + "さん");

    } catch (InputMismatchException e) {

      System.out.println(e.getMessage());

    }

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

      Scanner yourselect = null;
      int yoursTask = 0 ;

      try {
        // キーボード入力を受け付ける
        yourselect = new Scanner(System.in);
        yoursTask = yourselect.nextInt();

      } catch (InputMismatchException e) {
        System.out.println("入力エラーを検知しました");
        System.out.println(e.getMessage());
      }

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