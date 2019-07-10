public class BarStrategy implements IOutputStrategy{
    public String result="";
    public String output(int value) {
        if(value%5 == 0){
            return result+="Bar";
        }
        return "";
    }
}
