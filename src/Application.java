public class Application {
    public static void main(String[] args) {
        int value =14;

        // List<IOutputStrategy> outputs = new ArrayList<IOutputStrategy>();
        // outputs.add(new FooStrategy());
        // outputs.add(new BarStrategy());
        // outputs.add(new QixStrategy());

        IOutputStrategy printResult = new QixStrategy();
        System.out.println(printResult.output(value));

    }
}
