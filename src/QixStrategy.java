public class QixStrategy implements IOutputStrategy{
    public String result="";
    public String output(int value) {
        if(value%7 == 0){
            return result+="Qix";
        }
        return "";
    }
}