public class EmailNotifier implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("Notificando por Email: " + msg);
    }
}
