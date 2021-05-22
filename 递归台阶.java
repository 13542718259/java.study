package jiayou666;

public class test_5_22 {
    public static int JumpFloor(int n) {
        if (n > 2){
            return JumpFloor(n - 1) + JumpFloor(n - 2);
        }else if (n == 1) {
            return 1;
        }else if (n == 2) {
            return 2;	
        }else
            return 0;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(JumpFloor(n));
    }
}
