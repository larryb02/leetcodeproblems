import java.util.ArrayList;
import java.util.List;
public class uniquechar {
    public static void main(String[] args) {
        String s = "dddccdbba";
        uniquechar test = new uniquechar();
        test.unqchar(s);
        
    }
    
    public int unqchar(String s){
        char [] ballz = s.toCharArray();
        List <Character> balls = new ArrayList<>();
        for (Character ball : ballz) {
            balls.add(ball);
        }
        for(int i = 0; i < balls.size();i++){
            balls.remove(i);
            if(!balls.contains(s.charAt(i))){
                return i;
            }
            balls.add(i, s.charAt(i));
        }
        return -1;
    }
}
