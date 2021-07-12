public class BookOnLibrary implements Livro {
    private String name;
    private String description;
    private String author;
    private boolean available;
    private int rating;

    public BookOnLibrary(String nome, String autor, boolean disponivel) {
        this.name = nome;
        this.author = autor;
        this.available = disponivel;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public int getRating() {
        return rating;
    }

    public boolean isAvailable() {
        return available;
    }

    public void info() {
        System.out.println("----Biblioteca----" + "\nName: " + name
                + "\nAuthor: " + author + "\nAvailability: " + available + "\n");
    }
}