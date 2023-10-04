import java.util.Scanner;

class AreaModify {
    int Length;
    int Breadth;

    public void setDim(int len,int bre){
        Length=len;
        Breadth=bre;
    }
    public int getArea(){
        return Length * Breadth;
    }
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = scanner.nextInt();

        AreaModify area=new AreaModify();
        area.Length=length;
        area.Breadth=breadth;
        System.out.println("The area of the rectangle is:" + area.getArea());
    }
}
