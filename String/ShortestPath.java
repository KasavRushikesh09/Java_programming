import java.util.*;
public class ShortestPath{
    public static float shortest_path(String path){
        int x=0, y=0;
        for(int i=0; i<path.length(); i++){
             char dir = path.charAt(i);
             if(dir == 'E'){
                x++;
             }
             else if(dir == 'W'){
                x--;
             }
             else if(dir == 'N'){
                y++;
             }
             else{
                y--;
             }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string int between (E-W-N-S): ");
        String path = sc.nextLine();
        // String path = "EWNNWNNES";
        System.out.println(shortest_path(path));

    }
}