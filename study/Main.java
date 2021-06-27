import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{

        // StringBuilder sb = new StringBuilder();
        // for(int count = 1; count < 101 ; count++){
        //     sb.append((String)count);
        //     sb.append(",");
        // }

        // String[] sbs = sb.split(",");

        // Hero saitou = new Hero("斉藤");
        // Hero suzuki = new Hero("鈴木");

        // ArrayList<Hero> heros = new ArrayList<>(Arrays.asList(saitou,suzuki));

        // heros.stream().forEach(i -> System.out.println(i.getName()));

        // Map<Hero,Integer> heros2 = new HashMap<Hero,Integer>(){
        //     {
        //         put(saitou, 3);
        //         put(suzuki, 7);
        //     }
        // };

        // heros2.entrySet().stream().map(e -> e.getKey() + ": " + e.getValue()).forEach(System.out::println);
        
        
        // .forEach(i -> System.out.println(i.getKey() ":" i.getValue()));

        // String s = null;
        // try{
        //     System.out.println(s.length());
        // }catch(Exception e){
        //     System.out.println(e + "をcatchしました");
        //     // System.out.println(e.printStackTrace());
        //     System.out.println(e.getMessage());
        //     System.out.println("s.length()");
            
        // }

        // String str = "3plapkonknjkbhb";

        // try{
        //     int num = Integer.parseInt(str);
        //     System.out.println(num);
        // }catch(NumberFormatException e){
        //     System.out.println(e.getMessage());
        //     e.printStackTrace();
        // }n

        // System.out.println("Start");
        // throw new IOException();

        // String str = "3plapkonknjkbhb";

        // try{
        //     int num = Integer.parseInt(str);
        //     System.out.println(num);
        // }catch(NumberFormatException e){
        //     System.out.println(e.getMessage());
        //     e.printStackTrace();
        // }n

        // System.out.println("Start");
        // throw new IOException();


        // FileWriter fw = new FileWriter("testtest",true);
        // fw.write("a");
        // fw.flush();
        // fw.close();
        // FileReader ff = null; 
        // try{
        //     ff = new FileReader("Hero.java");
        //     System.out.println("データを読み込みます！");
        //     int i = ff.read();
        //     while(i != 1){
        //         char c = (char)i;
        //         System.out.println(c);
        //         i = ff.read();
        //     }

        //     System.out.println("終了");
        // }catch(IOException e){
        //     System.out.println("エラー");
        // }finally{
        //     if(ff != null){
        //         try{
        //             ff.close();
        //         }catch(IOException e2){}
        //     }
        // }

        // String ipt = args[0];
        // String opt = args[1];

        // FileInputStream fis = new FileInputStream(ipt);
        // FileOutputStream fos = new FileOutputStream(opt);

        // int i = fis.read();
        // while(i != -1){
        //     fos.write(i);
        //     i = fis.read();
        // }
        // fos.flush();
        // fis.close();
        // fos.close();

        String ipt = args[0];
        String opt = args[1];

        FileInputStream fis = new FileInputStream(ipt);
        FileOutputStream fos = new FileOutputStream(opt);

        int i = fis.read();
        while(i != -1){
            fos.write(i);
            i = fis.read();
        }
        fos.flush();
        fis.close();
        fos.close();

    }
}

    