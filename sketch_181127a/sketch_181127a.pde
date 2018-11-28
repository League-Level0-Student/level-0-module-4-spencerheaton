PImage face;
void setup(){
 face = loadImage("beethoven-600x600jpg.jpg");
size(600,800);
face.resize(width,height);
background(face);
}
void draw(){ 
background(face);
fill(250,250,250);
ellipse(300,420,50,50);
ellipse(190,430,50,50);
fill(0,0,0);

ellipse(mouseX,mouseY,10,10);
ellipse(mouseX,mouseY,10,10);
}