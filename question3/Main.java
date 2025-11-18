public class Main {
    public static void main(String[] args) {

        ReportGenerator generator = new ReportGenerator();

        generator.subscribe(new EmailNotifier());
        generator.subscribe(new LogNotifier());

        generator.generateReport("Relatório financeiro atualizado");
    }
}
