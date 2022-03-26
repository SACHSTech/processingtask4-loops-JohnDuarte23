import processing.core.PApplet;

/**
* The program Sketch.java generates four images - a grid, a set of evenly spaced circles, a black-white gradient, and a flower.
* @author: JohnDuarte
*/

public class Sketch extends PApplet {
	
  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(255, 255, 255);
  }

  public void draw() {
    // This portion of code creates the grid in quadrant 1
    float fltV1 = (width / 10);
    float fltV2 = (height - height);
    float fltV3 = (width / 10);
    float fltV4 = (height - (height / 2));
    
    float fltH1 = (width - width);
    float fltH2 = (height / 10);
    float fltH3 = (width / 2);
    float fltH4 = (height / 10);

    // This creates the vertical lines of the grid
    while(fltV1 <= width/2){
      line(fltV1, fltV2, fltV3, fltV4);
      fltV1 = (fltV1 + width / 10);
      fltV3 = (fltV3 + width / 10);
    }

    // This creates the horizontal lines of the grid
    while(fltH2 <= height / 2){
      line(fltH1, fltH2, fltH3, fltH4);
      fltH2 = (fltH2 + height / 10);
      fltH4 = (fltH4 + height / 10);
    }

    // This portion of code creates the circles in quadrant 2
    for(float c = 6; c < 10; c += 1){
      for(float d = 1; d < 5; d += 1){
        fill(100, 200, 10);
        ellipse((width / 10) * c, (height / 10) * d, width / 11, height / 11);
      }
    }

    // This portion of code creates the gradiant in quadrant 3
    for (int intGradient = 0; intGradient <= width/2; intGradient++){
      // Many lines are being produced, each one increacing in colour as they move to the right
      stroke(intGradient, intGradient, intGradient);
      line(intGradient, height/2, intGradient, height);
    }
    
    // This portion of code creates the flower in quadrant 4
    // These are the values of the centre of the flower
    int intCircleX = (width - width / 4);
    int intCircleY = (width - height / 4);

    // This sets the origin to the centre of the flower
    pushMatrix();
    translate(intCircleX, intCircleY);

    //This creates the petals around the centre of the flower
    for (int intDegrees = 0; intDegrees <= 360; intDegrees += 45){
      rotate(radians(intDegrees));
      fill(255, 192, 203);
      ellipse(0, 0 - height / 15, width / 15, height / 8);
    }

    popMatrix();

    // This is the circle in the centre of the flower petals.
     fill(255, 255, 0);
     ellipse(width / 2 + width / 4, height / 2 + height / 4, width / 8, height / 8);
    
  }
}
