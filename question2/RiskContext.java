public class RiskContext {
    private RiskStrategy strategy;

    public void setStrategy(RiskStrategy strategy) {
        this.strategy = strategy;
    }

    public void calculate() {
        strategy.calculate();
    }
}
