import java.util.*;

class FlowEx{
    public static void main(String[] args){
        int input;
        System.out.print("input 1 digit > ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        input = Integer.parseInt(tmp);

        if(input == 0){
            System.out.println("digit is zero");
        }
        if(input != 0){
            System.out.printf("digit is not zero. digit is %d", input);
        }
    }
}