public class OOPS {
    public static void main(String[] args) {
         Pen p1 = new Pen();//created a pen obj called p1
         p1.setColor("blue");
         System.out.println(p1.color);
         p1.setTip(5);
         System.out.println(p1.tip);
         p1.color = "Yellow";
         System.out.println(p1.color);

        
    }
}
class Pen{
    String color;
    int tip;


    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
