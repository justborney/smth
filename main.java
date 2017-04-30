import java.util.Scanner;

public class main {
    static String turn(String string){
        String turned = "";
        for(int i=0; i<string.length(); i++){
            turned = string.charAt(i) + turned;
        }
        return turned;
    }
    static int oborot(String string){
        int res=0;
        String s1 = string.replace(",", "");
        String[] s2 = s1.split(" ");
        String[] turned = new String[s2.length];
        for(int i=0; i<s2.length; i++) {
            turned[i] = turn(s2[i]);
        }
        for(int i=0; i<turned.length; i++){
            for(int j=i+1; j<s2.length; j++){
                if(turned[i].equals(s2[j])) {
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String string = new Scanner(System.in).nextLine();
        System.out.println(oborot(string));
    }
}