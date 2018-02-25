void setup (){
  size(400,400);
}

void draw () {
  background(200);
  int pupilX=mouseX; 
  int pupilY=mouseY;
  if(pupilX>140){
pupilX=140;
  }
  if(pupilX<65){
   pupilX=65;
  }
  if(pupilY>125){
    pupilY=125;
  }
  if(pupilY<75){
    pupilY=75;
  }
 int orbX=mouseX;
 int orbY=mouseY;
 if(orbX>340){
   orbX=340;
 }
 if(orbX<265){
   orbX=265;
 }
 if(orbY>125){
   orbY=125;
 }
 if(orbY<75){
   orbY=75;
 }
  ellipse(100,100,105,75);
  ellipse(300,100,105,75);
  fill(10,10,10);
  ellipse(pupilX,pupilY,25,25);
  ellipse(orbX,orbY,25,25);
    fill(255,255,255);
    
}