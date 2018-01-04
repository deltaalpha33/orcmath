package myStuff;

import guiTeacher.GUIApplication;

public class SimonGameStephanie extends GUIApplication {

	public static SimonGameStephanie game;
	public static SimonScreenStephanie screen;
	
	public SimonGameStephanie(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		screen = new SimonScreenStephanie(getWidth(), getHeight());
		setScreen(screen);

	}

	public static void main(String[] args) {
		game = new SimonGameStephanie(800,800);
		Thread runner = new Thread(game);
		runner.start();

	}

}
