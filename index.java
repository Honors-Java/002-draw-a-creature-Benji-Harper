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
  
  //This is for the horns
  fill(150,0,0);
  stroke(150,0,0);
  rect(130,110,30,75);
  rect(270,110,30,75);
  fill(75);
  stroke(75);
  ellipse(200,0,255,255);
  
  
  //The head
  stroke(150,0,0);
  fill(150,0,0);
  rect(200,350,115,150);
  ellipse(200,200,200,200);
  
 //The eyes
  stroke(0);
  fill(0,0,0);
  rect(165,180,10,25);
  rect(235,180,10,25);
  
  //The mouth
  ellipse(200,240,25,25);

}