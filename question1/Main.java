public class Main {
    public static void main(String[] args) {

        Report r1 = ReportFactory.create("daily");
        r1.prepare();

        System.out.println();

        Report r2 = ReportFactory.create("emergency");
        r2.prepare();
    }
}
