public class DocumentFactory {

    public static Document create(String type) {
        switch (type.toLowerCase()) {
            case "pdf": return new PdfDocument();
            case "word": return new WordDocument();
            default: throw new IllegalArgumentException("Tipo desconhecido: " + type);
        }
    }
}
