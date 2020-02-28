   int x = 50;
   int y = 50;
   int ellipse = 100;
    void setup() {
    size(500, 500);
    }
    
    void draw() {
      background(0, 0, 255);
    ellipse(x, y, ellipse, ellipse);
    }
    void mousePressed() {
      int distance = getDistance(x, y, mouseX, mouseY);
      if(distance < ellipse){
        x = (int)random(50);
        y = (int)random(50);
      }
      
    } 
    int getDistance (int x1, int y1, int x2, int y2) {
      return (int)Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
    }
