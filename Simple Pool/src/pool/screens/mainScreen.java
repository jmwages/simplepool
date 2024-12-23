package pool.screens;

import processing.core.PApplet;
import processing.event.KeyEvent;

public class mainScreen implements IScreen {

	@Override
	public PApplet draw(PApplet c) {
		return c;
	}

	@Override
	public IScreen update() {
		return this;
	}

	@Override
	public IScreen keyPressed(KeyEvent kev) {
		return this;
	}

}
