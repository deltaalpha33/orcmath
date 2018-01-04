package myStuff;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.TextArea;
import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenStephanie extends ClickableScreen implements Runnable {

	private TextLabel label;
	private ButtonInterfaceStephanie[] buttons;
	private ProgressInterfaceStephanie progress;
	private ArrayList<MoveInterfaceStephanie> sequence;
	
	private int roundNumber;
	private boolean acceptingInput;
	private int sequenceIndex;
	private int lastSelectedButton;

	public SimonScreenStephanie(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		addButtons();
		for(ButtonInterfaceStephanie b: buttons)
		    viewObjects.add(b); 
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		sequence = new ArrayList<MoveInterfaceStephanie>();
		lastSelectedButton = -1;
		sequence.add(randomMove());
		sequence.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(label);
	}

	private MoveInterfaceStephanie randomMove() {
		int button = (int)(Math.random() * buttons.length);
		while(button == lastSelectedButton)
			button = (int)(Math.random() * buttons.length);
		return getMove(button);
	}

	private MoveInterfaceStephanie getMove(int button) {
		// TODO Auto-generated method stub
		return null;
	}

	private ProgressInterfaceStephanie getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	private void addButtons() {
		int numberOfButtons = 4;
		buttons = new ButtonInterfaceStephanie[numberOfButtons];
		Color[] colors = {Color.red, Color.yellow, Color.green, Color.blue};
		for(int i = 0; i < numberOfButtons; i++) {
			ButtonInterfaceStephanie b = getAButton();
			buttons[i] = b;
			b.setColor(colors[i]);
			b.setX(100 + ((i % 2) * 100));
			if(i < numberOfButtons / 2)
				b.setY(100);
			else
				b.setY(200);
			b.setAction(new Action() {
				
				@Override
				public void act() {
					if(acceptingInput) {
						Thread blink = new Thread(new Runnable() {
							
							@Override
							public void run() {
								
							}
						});
					}
				}
			});
		}
	}

	private ButtonInterfaceStephanie getAButton() {
		// TODO Auto-generated method stub
		return null;
	}

}
