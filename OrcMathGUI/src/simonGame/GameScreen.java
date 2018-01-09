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
	private Button yellowButton;
	private Button greenButton;
	private Button cyanButton;
	private Button pinkButton;
	private Button orangeButton;
	
	
	
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
		
		
		yellowButton = new Button(250, 150 ,50,50, "",Color.YELLOW, new Action() {
			
			@Override
			public void act() {
				Thread blinker = new Thread(new Runnable() {
					
					@Override
					public void run() {
						
						yellowButton.setBackground(Color.WHITE);
						yellowButton.update();
						
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						yellowButton.setBackground(Color.YELLOW);
						yellowButton.update();
					}
				});
			blinker.start();
			buttonClick("yellow");
			
			}
		} );
		
		yellowButton.setCurve(50, 50);
		viewObjects.add(yellowButton);
		
		
		
		greenButton = new Button(250, 220 ,50,50, "",Color.GREEN, new Action() {
			
			@Override
			public void act() {
				Thread blinker = new Thread(new Runnable() {
					
					@Override
					public void run() {
						
						greenButton.setBackground(Color.WHITE);
						greenButton.update();
						
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						greenButton.setBackground(Color.GREEN);
						greenButton.update();
					}
				});
			blinker.start();
			buttonClick("green");
			
			}
		} );
		
		greenButton.setCurve(50, 50);
		viewObjects.add(greenButton);
		
		
		
		cyanButton = new Button(300, 265 ,50,50, "",Color.CYAN, new Action() {
			
			@Override
			public void act() {
				Thread blinker = new Thread(new Runnable() {
					
					@Override
					public void run() {
						
						cyanButton.setBackground(Color.WHITE);
						cyanButton.update();
						
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						cyanButton.setBackground(Color.CYAN);
						cyanButton.update();
					}
				});
			blinker.start();
			buttonClick("cyan");
			
			}
		} );
		
		cyanButton.setCurve(50, 50);
		viewObjects.add(cyanButton);
		
		
		
		pinkButton = new Button(350, 220 ,50,50, "",Color.PINK, new Action() {
			
			@Override
			public void act() {
				Thread blinker = new Thread(new Runnable() {
					
					@Override
					public void run() {
						
						pinkButton.setBackground(Color.WHITE);
						pinkButton.update();
						
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						pinkButton.setBackground(Color.PINK);
						pinkButton.update();
					}
				});
			blinker.start();
			buttonClick("pink");
			
			}
		} );
		
		pinkButton.setCurve(50, 50);
		viewObjects.add(pinkButton);
		
		orangeButton = new Button(350, 150 ,50,50, "",Color.ORANGE, new Action() {
			
			@Override
			public void act() {
				Thread blinker = new Thread(new Runnable() {
					
					@Override
					public void run() {
						
						orangeButton.setBackground(Color.WHITE);
						orangeButton.update();
						
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						orangeButton.setBackground(Color.ORANGE);
						orangeButton.update();
					}
				});
			blinker.start();
			buttonClick("orange");
			
			}
		} );
		
		orangeButton.setCurve(50, 50);
		viewObjects.add(orangeButton);
	}

}
