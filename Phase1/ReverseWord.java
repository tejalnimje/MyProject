package Phase1;

public class ReverseWord {
    public static void main(String[] args) {
        String sentence = "my name is Tejal";
        String[] words = sentence.split(" ");
        for(int i = 0; i < words.length; i++){
            char[] tempString = reverse(words[i].toCharArray());
            System.out.print(tempString);
            System.out.print(" ");
        }
        
    }

    private static char[] reverse(char[] word) {
        int s = 0;
        int e = word.length-1;
        for(int i = 0; i < word.length-1; i++){
            char temp = word[s];
            word[s] = word[e];
            word[e] = temp;
            s++;
            e--;
        }
        return word;
        //System.out.println(word);
    }
}
