import java.util.ArrayList;
import java.util.List;

public class ReportGenerator {

    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer o) {
        observers.add(o);
    }

    public void unsubscribe(Observer o) {
        observers.remove(o);
    }

    public void generateReport(String msg) {
        System.out.println("Gerando relatório...");
        notifyAll(msg);
    }

    private void notifyAll(String msg) {
        for (Observer o : observers) {
            o.update(msg);
        }
    }
}
