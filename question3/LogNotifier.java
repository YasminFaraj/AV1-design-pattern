public class LogNotifier implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("Registrando log: " + msg);
    }
}
