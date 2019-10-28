public class Book{
    private static class Author{
        String name;
        String email;
        char gender;
        Author(String name, String email,char gender){
            this.name = name;
            this.email = email;
            this.gender = gender;
        }
    }
    String name;
    Author[] authors = new Author[200];
    double price;
    int qty = 0;

    Book(String name, Author[] authors, double price){
        this.name = name;
        // this.authors = Arrays.copyOf(authors,authors.length);
        System.arraycopy(authors, 0, this.authors, 0, authors.length);
        this.price = price;
    }
    Book(String name, Author[] authors, double price, int qty){
        this.name = name;
        // this.authors = Arrays.copyOf(authors,authors.length);
        System.arraycopy(authors, 0, this.authors, 0, authors.length);
        this.price = price;
        this.qty = qty;
    }
    public String getName(){
        return this.name;
    }
    public Author[] getAuthors(){
        return this.authors;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQty(){
        return this.qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public String toString(){
        System.out.printf("Book[name=%s,authors={", this.name);
        for(int i = 0;this.authors[i] != null;i++){
            System.out.printf("Author[name=%s, email=%s, gender=%s]", this.authors[i].name, this.authors[i].email, this.authors[i].gender);
            if(this.authors[i + 1] != null)
                System.out.print(",");
        }
        System.out.printf("},price=%f,qty=%d]\n", this.price, this.qty);
        return "";
    }
    public String getAuthorNames(){
        for(int i = 0;this.authors[i] != null;i++){
            System.out.printf("%s",this.authors[i].name);
            if(this.authors[i + 1] != null)
                System.out.print(",");
            else
                System.out.print("\n");
        }
        return "";
    }
    public static void main(String[] args){
        Author a1 = new Author("myname","1@1.com",'M');
        Author a2 = new Author("namm", "2@2.com", 'F');
        Author[] aa = {a1,a2};
        Book a = new Book("book1", aa, 20);
        System.out.printf("Qty:%d\n", a.getQty());
        Book b = new Book("book2", aa, 20,2);
        System.out.println(b.getName());
        System.out.println(b.getAuthors());
        System.out.printf("Price:%f\n", b.getPrice());
        b.setPrice(30);
        System.out.printf("Qty:%d\n", b.getQty());
        b.setQty(3);
        b.toString();
        b.getAuthorNames();
    }
}