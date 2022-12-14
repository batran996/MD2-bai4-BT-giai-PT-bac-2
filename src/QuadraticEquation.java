public class QuadraticEquation {
    private int a ;
    private int b;
    private int c;
    public QuadraticEquation(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public QuadraticEquation(){

    }
    public int getDelta(){
        return (this.b*this.b - 4*this.a*this.c);
    }
    public double nghiem1(){
        return ((-this.b +Math.sqrt(getDelta())) / (2*this.a));
    }
    public double nghiem2(){
        return ((-this.b -Math.sqrt(getDelta())) / (2*this.a));

    }
}

