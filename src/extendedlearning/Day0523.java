package extendedlearning;

public class Day0523 {
    public static void main(String[] args){
        //行
        for (int line = 1 ; line <= 9 ; line++ ){
         //列
            for (int i = 1; i <= line; i++){
                System.out.print(i + "X" + line + "=" + (i * line) + " ");
            }
            System.out.print("\n");
            //System.out.println();
        }
    }
}
