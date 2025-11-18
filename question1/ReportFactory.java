public class ReportFactory {

    public static Report create(String type) {
        if (type.equalsIgnoreCase("daily")) {
            return new DailyReport();
        }
        if (type.equalsIgnoreCase("emergency")) {
            return new EmergencyReport();
        }

        throw new IllegalArgumentException("Tipo de relatório desconhecido: " + type);
    }
}
