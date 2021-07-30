import java.util.*;
class Switch{
    public static void main(String[] args){
        System.out.print("input the current month > ");
        
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch(month){
            case 3: case 4: case 5:
                System.out.println("Current season is Spring");
                break;
            case 6: case 7: case 8:
                System.out.println("Current season is Summer");
                break;
            case 9: case 10: case 11:
                System.out.println("Current season is Fall");
                break;
            default:
            case 12: case 1: case 2:
                System.out.println("Current season is Winter");
        }
    }
}