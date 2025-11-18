public class Main {
    public static void main(String[] args) {

        Document doc1 = DocumentFactory.create("pdf");
        doc1.open();

        Document doc2 = DocumentFactory.create("word");
        doc2.open();
    }
}
