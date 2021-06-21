public class Account{

    private String accountNuber;
    private int balance;

    public boolean equals(Object o){
        String o = o.trim
        if(this == o){
            return true;
        }
        if(o instanceof Account){
            Account a = (Account)o;
            String an1 = this.accountNuber.trim;
            String an2 = o.accountNuber.trim;
            if(an1.equals(an2)){
                return true;
            }
        }
        return false;
    } 

    public String toString(){
        String infomarsion = "¥" + this.balance + "(" + "口座番号=" + this.accountNuber + ")";
        return infomarsion;
    }
}