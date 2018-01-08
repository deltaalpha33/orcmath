package simonGame;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Button;
import guiTeacher.components.Action;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class GameScreen extends FullFunctionScreen {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Button redButton;
	
	
	
	int seqPos = 0;
	String[] currentRound;

	public GameScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}
	
	public void buttonClick(String color) {

		
		
	}
	
	
	public String getRandMove() {
		while(true) {
			int randNum = (int)(Math.random() * 6);
			
			switch (randNum){
			case 0:
				if(currentRound.length>0 && currentRound[currentRound.length-1] != "red") {
					return "red";
				}
				
			case 1:
				if(currentRound.length>0 && currentRound[currentRound.length-1] != "yellow") {
					return "yellow";
				}
				
			case 2:
				if(currentRound.length>0 && currentRound[currentRound.length-1] != "green") {
					return "green";
				}
				
			case 3:
				if(currentRound.length>0 && currentRound[currentRound.length-1] != "pink") {
					return "pink";
				}
				
			case 4:
				if(currentRound.length>0 && currentRound[currentRound.length-1] != "orange") {
					return "orange";
				}
			case 5:
				if(currentRound.length>0 && currentRound[currentRound.length-1] != "cyan") {
					return "cyan";
			}
		
		}
		}
	}
	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		
		redButton = new Button(300, 100 ,50,50, "",Color.RED, new Action() {
			
			@Override
			public void act() {
				Thread blinker = new Thread(new Runnable() {
					
					@Override
					public void run() {
						
						redButton.setBackground(Color.WHITE);
						redButton.update();
						
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						redButton.setBackground(Color.RED);
						redButton.update();
					}
				});
			blinker.start();
			buttonClick("red");
		
			}
		} );
		
		redButton.setCurve(50, 50);
		viewObjects.add(redButton);
		
		
		Button yellowButton = new Button(250, 150 ,50,50, "",Color.YELLOW, new Action() {
			
			@Override
			public void act() {
				buttonClick("yellow");
				
			}
		} );
		
		yellowButton.setCurve(50, 50);
		viewObjects.add(yellowButton);
		
		
		
		Button greenButton = new Button(250, 220 ,50,50, "",Color.GREEN, new Action() {
			
			@Override
			public void act() {
				buttonClick("green");
				
			}
		} );
		
		greenButton.setCurve(50, 50);
		viewObjects.add(greenButton);
		
		
		
		Button cyanButton = new Button(300, 265 ,50,50, "",Color.CYAN, new Action() {
			
			@Override
			public void act() {
				buttonClick("cyan");
				
			}
		} );
		
		cyanButton.setCurve(50, 50);
		viewObjects.add(cyanButton);
		
		
		
		Button pinkButton = new Button(350, 220 ,50,50, "",Color.PINK, new Action() {
			
			@Override
			public void act() {
				buttonClick("pink");
				
			}
		} );
		
		pinkButton.setCurve(50, 50);
		viewObjects.add(pinkButton);
		
		Button orangeButton = new Button(350, 150 ,50,50, "",Color.ORANGE, new Action() {
			
			@Override
			public void act() {
				buttonClick("orange");
				
			}
		} );
		
		orangeButton.setCurve(50, 50);
		viewObjects.add(orangeButton);
	}

}
