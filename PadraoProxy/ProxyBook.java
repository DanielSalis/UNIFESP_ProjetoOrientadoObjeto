class ProxyBook implements Livro {
    private String name; 
    private String author;
    private boolean available;

    ProxyBook(String nome, String autor, boolean disponivel) {
        this.name = nome;
        this.author = autor;
        this.available = disponivel;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return available;
    }

    public String getAuthor() {
        return author;
    }

    public void info() {
        System.out.println("\nNome: " + name + "\nDisponibilidade: " + available
                + "\nAutor: " + author + "\n");
    }

    public BookOnLibrary settingAnBook() {

        return new BookOnLibrary(name, author, available);
    }
}