import java.io.*;

class Geeks
{
    public String geek;
    public int i;
    public Integer I;

    public Geeks()
    {
        this.geek = "Sweta Dash";
    }

    public static void main(String[] args)
    {
        Geeks name = new Geeks();

        System.out.println("Geek name is: " + name.geek);
        System.out.println("Default value for int is: " + name.i);
        System.out.println("Default value for Integer is: " + name.I);
    }
}
