package pool.screens;

import processing.core.PApplet;
import processing.event.KeyEvent;

public interface IScreen {
	
	/**
	 * Renders this world on the given canvas
	 * @param c - the canvas to render onto
	 * @return the updated canvas
	 */
	PApplet draw(PApplet c);
	
	/**
	 * Produces an updated world
	 */
	IScreen update();
	
	/**
	 * Handles key events for this world
	 * @param kev - the key event to process
	 * @return the updated world
	 */
	IScreen keyPressed(KeyEvent kev);

}
