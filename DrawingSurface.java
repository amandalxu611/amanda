package amandaxu.illusions2;

import java.awt.Color;
import java.awt.geom.Point2D;

import amandaxu.shapes.*;
import processing.core.PApplet;

public class DrawingSurface extends PApplet {
	private Circle c1;
	private Rectangle rect;

	public DrawingSurface() {
		c1 = new Circle();
		rect = new Rectangle();
	}

	// The statements in the setup() function
	// execute once when the program begins
	public void setup() {

	}

	// The statements in draw() are executed until the
	// program is stopped. Each statement is executed in
	// sequence and after the last line is read, the first
	// line is executed again.
	public void draw() {
		float ratioX = width / 400f;
		float ratioY = height / 400f;
		scale(ratioX, ratioY);

		background(255);

		for (int i = 1; i <= 30; i++) {
			c1 = new Circle(200, 200, 350 - 10.5 * i);
			if (i % 2 == 0) {
				c1.setFillColor(Color.WHITE);
			} else {
				c1.setFillColor(Color.BLACK);
			}
			c1.draw(this);
		}

		rect = new Rectangle(72.5, 72.5, 255, 255);
		rect.setStrokeColor(new Color(200, 66, 245));
		rect.setStrokeWidth(6);
		rect.draw(this);

	}

}
