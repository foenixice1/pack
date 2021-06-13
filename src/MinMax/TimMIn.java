package MinMax;

public class TimMIn {
    public static void main(String[] args) {
        int[] num = new int[] {1,5,4,5,21,1,2,1,0};

        int min = num[0];
        for (int i = 0 ; i < num.length ; i++) {
            if ( num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất là :" + min);
    }
}
