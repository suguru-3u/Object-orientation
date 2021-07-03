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
        case 2 :
          System.out.print("削除したいTaskの番号を入力してください：　");
          int taskNumber;

          try {
            // キーボード入力を受け付ける
            Scanner title = new Scanner(System.in);
            taskNumber = title.nextInt();
            taskNumber -= 1 ;

            System.out.println(taskMemo.getTasks(taskNumber));
            System.out.print("こちらのTaskでお間違い無いでしょうか？ 間違いなければ「y」を入力してください：　");

            Scanner taskJuge = new Scanner(System.in);
            String taskJugeAnwser = taskJuge.nextLine();

            if(taskJugeAnwser.equals("y")){
              taskMemo.deleteTask(taskNumber);
            }
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
          break;

          case 3 :
          System.out.print("編集したいTaskの番号を入力してください：　");
          int taskCahngeNumber;

          try {
            // キーボード入力を受け付ける
            Scanner title = new Scanner(System.in);
            taskCahngeNumber = title.nextInt();
            taskCahngeNumber -= 1 ;

            System.out.println(taskMemo.getTasks(taskCahngeNumber));
            System.out.print("こちらのTaskでお間違い無いでしょうか？ 間違いなければ「y」を入力してください：　");

            Scanner taskJuge = new Scanner(System.in);
            String taskJugeAnwser = taskJuge.nextLine();

            if(taskJugeAnwser.equals("y")){

              Scanner titleChange = new Scanner(System.in);
              System.out.print("TaskのTitleを入力してください：　");
              String taskTitleChange = titleChange.nextLine();

              // キーボード入力を受け付ける
              Scanner mainChange = new Scanner(System.in);
              System.out.print("TaskのMainを入力してください ：　");
              String taskMainChange = mainChange.nextLine();

              Task taskChange = new Task(taskTitleChange,taskMainChange);

              taskMemo.changeTask(taskCahngeNumber,taskChange);

                
              }
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
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