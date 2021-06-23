public class Hero{

    private String name;

    public Hero(String name){ this.name = name ;}

    public String getName(){ return this.name ;}

    abstract public <T>T delete(<T>T task);
}