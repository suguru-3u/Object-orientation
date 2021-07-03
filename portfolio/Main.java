import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Main{
  public static void main(String[] args){

    TaskMemo taskMemo = new TaskMemo();
    boolean app = true;

    try {
      // キーボード入力を受け付ける
      Scanner name = new Scanner(System.in);
      System.out.print("お名前を入力してください:");
      String yoursName = name.nextLine();

      System.out.println("こんにちは、" + yoursName + "さん");

    } catch (InputMismatchException e) {

      System.out.println(e.getMessage());

    }

    while(app){

      System.out.println("");
      System.out.println("抱えているTask一覧");
      System.out.println("Task数 ： " + taskMemo.getTasksNumbers() + "個です。");

      taskMemo.tasksShow();

      System.out.print("Taskを入力する場合は「1」、Taskを削除する場合は「２」を入力してください　：");

      Scanner yourselect = null;
      String yoursTask = null;
      try {
        // キーボード入力を受け付ける
        yourselect = new Scanner(System.in);
        yoursTask = yourselect.nextLine();

      } catch (InputMismatchException e) {

        System.out.println(e.getMessage());

      }

      switch(yoursTask){

        // Task登録処理
        case "１":
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

            taskMemo.setTasks(task);

          } catch (Exception e) {

            System.out.println(e.getMessage());

          }
          break;

        // Task削除処理
        case "２":
          System.out.print("削除したいTaskの番号を入力してください：　");
          int taskNumber;

          try {
            // キーボード入力を受け付ける
            Scanner title = new Scanner(System.in);
            taskNumber = title.nextInt();
            taskNumber -= 1 ;

            System.out.println(taskMemo.getTasks(taskNumber));
            System.out.print("こちらのTaskのお間違い無いでしょうか？ 間違いなければ「y」を入力してください：　");

            Scanner taskJuge = new Scanner(System.in);
            String taskJugeAnwser = taskJuge.nextLine();

            if(taskJugeAnwser.equals("y")){
              taskMemo.deleteTask(taskNumber);
            }
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
          break;

        default:
          app = false;
          break;
      }
    }
  }
}