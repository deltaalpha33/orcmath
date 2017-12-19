package guiPlayer;

import java.util.ArrayList;
import java.util.Scanner;

public class CatalogueMaker {
	
	
	private ArrayList<BookCatalogue> list;
	
	
	public CatalogueMaker() {
		list = new ArrayList<BookCatalogue>();
		list.add(new BookCatalogue("The history of OOP", "JVM" , "Torture", "An introduction to recursive object trees", "Your soul" ));
		list.add(new BookCatalogue("Why auto is bad", "JVM" , "Childrens Books", "A story to scare small children", "200 brain cells" ));
	}
	
	
	public String getCsvContent() {
		String data = "title,author,genre,synopsis,price\n";
		
		
		for(BookCatalogue b: list) {
			data+= b.toString() + "\n";
		}
		
		return data;
	}
	
	
	public void addNewItem(String title, String author, String genre, String synopsis, String price) {
		list.add(new BookCatalogue(title,author,genre,synopsis,price));
	}
	public static void main(String[] args) {
		CatalogueMaker c = new CatalogueMaker();
		System.out.println(c.getCsvContent());
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print("Title:");
			String title = in.nextLine();
			System.out.print("Author::");
			String author = in.nextLine();
			System.out.print("Genre:");
			String genre = in.nextLine();
			System.out.print("synopsis:");
			String synopsis = in.nextLine();
			System.out.print("price:");
			String price = in.nextLine();
			
			c.addNewItem(title, author, genre, synopsis, price);
			
			System.out.println("added element");
			
			boolean done = false;
			while(!done) {
				System.out.println("add more y/n");
				if(in.nextLine().toLowerCase() == "y") {
					done = true;
				}
				else if(in.nextLine().toLowerCase() == "n"){
					return;
				}
			}

		}
		
	}

}
