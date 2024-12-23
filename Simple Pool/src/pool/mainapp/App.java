package pool.mainapp;

import pool.constants.Constants;
import pool.screens.IScreen;
import pool.screens.mainScreen;
import processing.core.PApplet;
import processing.event.KeyEvent;

public class App extends PApplet {
	
	private IScreen s;
	
	@Override
	public void settings() {
		this.size(Constants.screenW, Constants.screenH);
	}

	@Override
	public void setup() {
		s = new mainScreen(); 
	}

	@Override
	public void draw() {
		s = s.update();
		s.draw(this);
	}

	public void keyPressed(KeyEvent kev) {
		s = s.keyPressed(kev);
	}

	public static void main(String[] args) {
		PApplet.runSketch(new String[] { "2D Pool" }, new App());
	}
}
