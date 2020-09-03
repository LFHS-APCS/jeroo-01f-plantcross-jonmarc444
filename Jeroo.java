/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

    
    public void plantCross() {
        start();
  planttopleftquadrant();
  planttopright_bottomrightquadrant();
  planttopright_bottomrightquadrant();
  plantbottomleftquadrant();
    }
    // Put any helpermethods here

public void start(){
  turn(RIGHT);
  sixhop();
  turn(LEFT);
  doublehop();
}
public void planttopleftquadrant(){
  fourplanthop();
  turn(LEFT);
  threeplanthop();
  turn(RIGHT);
  twoplanthop();
}
public void planttopright_bottomrightquadrant(){
  turn(RIGHT);
  threeplanthop();
  turn(LEFT);
  threeplanthop();
  turn(RIGHT);
  twoplanthop();
}
public void plantbottomleftquadrant(){
  turn(RIGHT);
  threeplanthop();
  turn(LEFT);
  threeplanthop();
  turn(RIGHT);
  planthop();
  doublehop();
}
public void fourplanthop(){
  threeplanthop();
  planthop();
}
public void threeplanthop(){
  twoplanthop();
  planthop();
}
public void twoplanthop(){
  planthop();
  planthop();
}
public void planthop(){
  hop();
  plant();
}
public void sixhop(){
  doublehop();
  doublehop();
  doublehop();
}
public void doublehop(){
  hop();
  hop();
}

    
    
    
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int x, int y) { super(x, y); }

    public Jeroo(int x, int y, CompassDirection direction) { super (x, y, direction);}

    public Jeroo(int x, int y, int flowers) { super (x, y, flowers);}

    public Jeroo(int x, int y, CompassDirection direction, int flowers) { super(x, y, direction, flowers);}

}
