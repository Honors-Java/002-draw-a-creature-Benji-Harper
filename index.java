void setup() {
	size(400, 400);
}

void draw() {
  background(75);
  ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);
  rectMode(CENTER);
 
  //Make a creature!!! 
  //all of your programming should be after this 👍
  
  //This is for the horns, at the time I didn't know how to do triangles so
  //I improvised by covering part of the rectangles with a large circle
  //Then put the head over that circle
  fill(150,0,0);
  stroke(150,0,0);
  rect(130,110,30,75);
  rect(270,110,30,75);
  fill(75);
  stroke(75);
  ellipse(200,0,255,255);
  
  
  //The head
  stroke(0);
  fill(150,0,0);
  rect(200,350,115,150);
  ellipse(200,200,200,200);
   //Goatee
   fill(0);
   triangle(200,310,190,295,210,295);

  
 //The eyes
  stroke(0);
  fill(0,0,0);
  rect(165,180,10,26);
  rect(235,180,10,26);
   //Pupils
   fill(255,255,0);
   stroke(255,255,0);
   triangle(165,175,160,193,170,193);
   triangle(235,175,230,193,240,193);

  //The mouth
  fill(0);
  stroke(0);
  ellipse(200,240,25,25);
   //The teeth
   fill(255);
   stroke(255);
   triangle(200,245,195,252,205,252);
   triangle(195,235,192,232,200,228);
   triangle(205,235,208,232,200,228);
}