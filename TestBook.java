import java.util.Scanner;
public class TestBook {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code here
		System.out.println("Enter the Book name:");
		String b = sc.nextLine();
		System.out.println("Enter the Author name:");
		String a1 = sc.nextLine();
		System.out.println("Enter the Price :");
		int p = sc.nextInt();
		Book obj = new Book();
		obj.setBookName(b);
		obj.setBookPrice(p);
		obj.setAuthorName(a1);
		System.out.println("Book Details");
		System.out.println("Book Name :"+obj.getBookName());
		System.out.println("Book Price :"+obj.getBookPrice());
		System.out.println("Author Name :"+obj.getAuthorName());
	}

}
