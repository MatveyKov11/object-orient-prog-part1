public class Book {
    String name;
    Author author;
    int year;
    public Book(String name, Author author, int year){
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String toString(){
        return "Название: " + this.name + ",\n" + this.author + ",\nГод: " + year;
    }
}
