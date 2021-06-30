import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Main{
    public static void main(String[] args){

      TaskMemo taskMemo = new TaskMemo();

      try {
        // キーボード入力を受け付ける
        Scanner name = new Scanner(System.in);
        System.out.print("お名前を入力してください:");
        String yoursName = name.nextLine();

        System.out.println("こんにちは、" + yoursName + "さん");

      } catch (InputMismatchException e) {

        System.out.println(e.getMessage());

      }

      System.out.print("Taskを入力する場合は「1」を入力してください：");

      // String yoursTask = null;
      // try {
        // キーボード入力を受け付ける
        Scanner aatask = new Scanner(System.in);
        String yoursTask = aatask.nextLine();

      // } catch (InputMismatchException e) {

      //   System.out.println(e.getMessage());

      // }

      switch(yoursTask){

        case "１":
          System.out.println("登録したいTaskを入力してください");
            try {
            // キーボード入力を受け付ける
            Scanner title = new Scanner(System.in);
            System.out.println("TaskのTitleを入力してください");
            String taskTitle = title.nextLine();

             // キーボード入力を受け付ける
            Scanner main = new Scanner(System.in);
            System.out.println("TaskのMainを入力してください");
            String taskMain = main.nextLine();

            Task task = new Task(taskTitle,taskMain);

            taskMemo.setTasks(task);

            taskMemo.tasksShow();

          } catch (Exception e) {

            System.out.println(e.getMessage());

          }
          break;

        default:
          break;
      }
   
    
    }
}