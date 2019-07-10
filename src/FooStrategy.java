public class FooStrategy implements IOutputStrategy{
    public String result="";
    public String output(int value) {
        if(value%3 == 0){
            return result+="Foo";
        }
        return "";
    }
}