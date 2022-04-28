package BookAut;

public class Books {

	String Name;
    String author;
    double price;
    int qty;
    Books()
    {
    	
    }
    Books(String Name,String author,double price ,int qty){
        this.Name=Name;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }

    public String getName() {
        return Name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
	@Override
	public String toString() {
		return "Books [Name=" + Name + ", author=" + author + ", price=" + price + ", qty=" + qty + "]";
	}
	

	
}
