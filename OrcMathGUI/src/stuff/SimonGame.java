package stuff;

import guiTeacher.GUIApplication;
import simonGame.SimonGameStephanie;
import stuff.SimonGameScreen;

public class SimonGame extends GUIApplication {

	public static SimonGameStephanie game;
	public static SimonGameScreen screen;
	
	public SimonGame(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		screen = new SimonGameScreen(getWidth(), getHeight());
		setScreen(screen);

	}

	public static void main(String[] args) {
		game = new SimonGameStephanie(800,800);
		Thread runner = new Thread(game);
		runner.start();

	}

}

