package Phase1;

public class ReplaceSpaces {
    public static void main(String[] args) {
        String sentence = "my name is Tejal";
        String temp = "";
       for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == ' '){
                temp += "@40";
            } else {
                temp += sentence.charAt(i);
            }
        }
        System.err.println(temp);
    }
}
