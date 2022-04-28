package BookAut;

public class Author {
	 String Name;
	    String E_mail;
	    char Gender;
	    Author(String Name ,String E_mail,char gen){
	        this.Name=Name;
	        this.E_mail=E_mail;
	        this.Gender=gen;
	    }

	    @Override
	    public String toString() {
	        return "Author[" +
	                "Name='" + Name + '\'' +
	                ", E_mail='" + E_mail + '\'' +
	                ", Gender=" + Gender +
	                ']';
	    }
}
