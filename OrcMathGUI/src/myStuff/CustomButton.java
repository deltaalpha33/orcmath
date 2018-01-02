package myStuff;

import java.awt.Color;
import java.awt.Graphics2D;

import guiPlayer.CustomLabel;
import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class CustomButton extends Button implements CustomLabel {

	String String1;
	String String2;
	
	
	public CustomButton(int x, int y, int w, int h, String text, Action action) {
		super(x, y, w, h, text, action);
		// TODO Auto-generated constructor stub
	}
	
	public void CustomButton(int x, int y) {
		
	}
	
	@Override
	public void updateString1(String string) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateString2(String string) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setIconColor(Color color) {
		// TODO Auto-generated method stub
		
	}

	public void drawButton(Graphics2D g, boolean hover) {
		g.setColor(Color.BLACK);
		
	}
	
}
