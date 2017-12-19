package guiPlayer;

import java.awt.Graphics2D;


import java.awt.Color;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class BookCatalogue extends Component{
	
	String title;
	String author;
	String genre;
	String synopsis;
	String price;
	
	public BookCatalogue(String title, String author, String genre, String synopsis, String price) {
		// TODO Auto-generated constructor stub
		super(40, 40, 262, 192);
		
//		super.addSequence("resources/pegasus spritesheet.png", 150, 0, 0, 65, 48 , 4);
//		Thread animation = new Thread(this);
//		animation.start();
//		update();
		
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.synopsis = synopsis;
		this.price = price;
		update();
	}
	
	public String toString() {
		return this.title + "," + this.author + "," +this.genre + "," +this.synopsis + "," +this.price;
	}
	@Override
	public void update(Graphics2D g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		//update(g);
	}

}
