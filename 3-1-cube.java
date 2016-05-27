public class Main {

    public static void main(String[] args) {
        int a = 4;
        System.out.println("This is a test for number "+a);
        int b = square(a);
        int c = cube(a);
        System.out.println("a squared is "+ b);
        System.out.println("a cubed is "+ c);
        
    }
    
    static int square(int x){
        return x*x;
    }
    //Complete the cube method. Try to use the square method.
   
    static int cube(int z){
        return square(z)*z;
    }
    
    
}
