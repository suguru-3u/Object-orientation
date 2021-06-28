import java.io.*;

public class Main{
    public static void main(String[] args){

    // System.in -> キーボード入力を受け付けるための引数
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("名前を入力してください：");

    try {
      // キーボード入力を受け付ける
      String name = br.readLine();

      System.out.println("こんにちは、" + name + "さん");
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    
    }
}