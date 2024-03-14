public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setA(8);
        rectangle.setB(5);
        rectangle.setC(8);
        rectangle.setD(5);
        System.out.println(summa(rectangle.getA(), rectangle.getB()));
    }
    public static int summa (int a,int b){
        int sum = a*b;
     return sum ;
    }
}