import java.util.*;

public class Main{
    public static void main(String args[]){

        // StringBuilder sb = new StringBuilder();
        // for(int count = 1; count < 101 ; count++){
        //     sb.append((String)count);
        //     sb.append(",");
        // }

        // String[] sbs = sb.split(",");

        Hero saitou = new Hero("斉藤");
        Hero suzuki = new Hero("鈴木");

        ArrayList<Hero> heros = new ArrayList<>(Arrays.asList(saitou,suzuki));

        heros.stream().forEach(i -> System.out.println(i.getName()));

    }

    // public String fileString(String folder,String file){
    //     StringBuilder aaa = new StringBuilder();
    //     if(folder.endsWith(String "¥")){
    //         aaa.append(folder);
    //         aaa.append(file);
    //     }else{
    //         aaa.append(folder);
    //         aaa.append("¥");
    //         aaa.append(file);
    //     }
    //     return aaa;
    // }

    // public Date aaa(){
    //     Date now = new Date();
    //     Calender c = Calender.getInstance();
    //     c.getTime(now);
    //     int  day = c.get(Calender.DAY_OF_MONTH);
    //     c.set(day,day + 100);
    //     Date g = c.getTime();
    //     SimpleDateFormat f = new SimpleDateFormat("西暦 yyyy年mm月dd日");
    // }


}