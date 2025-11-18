public class Main {
    public static void main(String[] args) {

        RiskContext context = new RiskContext();

        context.setStrategy(new ValueAtRisk());
        context.calculate();

        context.setStrategy(new ExpectedShortfall());
        context.calculate();

        context.setStrategy(new StressTesting());
        context.calculate();
    }
}
