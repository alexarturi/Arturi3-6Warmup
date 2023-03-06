import java.util.ArrayList;
public class String2ArrayList
{
    private ArrayList<String> splitString;

    public String2ArrayList()
    {
        splitString = new ArrayList<String>();
    }
    public void splitAndAdd(String str)
    {
        while(str.length()>0){
            splitString.add(str.substring(0,1));
            str = str.substring(1);
        }
    }
    public String toString()
    {
        return splitString.toString();
    }
}