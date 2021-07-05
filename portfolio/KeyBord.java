import java.util.Scanner;

public class KeyBord{


    public static String inputKeyBordTitle(){

        try {
            // キーボード入力を受け付ける
            Scanner title = new Scanner(System.in);
            System.out.print("TaskのTitleを入力してください：　");
            String taskTitle = title.nextLine();

            return taskTitle;

        }catch (Exception e) {

            System.out.println(e.getMessage());

            String errorMessage = "エラーが発生しました";

            return errorMessage;

        }
    }

    public static String inputKeyBordMain(){

        try{
            // キーボード入力を受け付ける
            Scanner main = new Scanner(System.in);
            System.out.print("TaskのMainを入力してください ：　");
            String taskMain = main.nextLine();

            return taskMain;

        }catch (Exception e) {

            System.out.println(e.getMessage());

            String errorMessage = "エラーが発生しました";

            return errorMessage;

        }

    }
}