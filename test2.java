class A1 {
    public void paint() {
        System.out.print("A");
        draw();
    }
    public void draw() {
        System.out.print("B");
        draw();

    }


}

class B1 extends A1 { 
    public void paint(){
        super.draw();
        System.out.print("C");
        this.draw();
    }
    public void draw() {
        System.out.print("D");
    }

}

public class test2 {

    public static void main (String[] args){
     A1 b = new B1();
     b.paint();
     b.draw();


    }
}