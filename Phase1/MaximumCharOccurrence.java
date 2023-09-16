package Phase1;

public class MaximumCharOccurrence {
    public static void main(String[] args) {
        String word = "apple";
        int[] alphabets = new int[25];
        int index = 0;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                index = ch - 'a';
            }
            alphabets[index]++;
        }

        int max = 0;
        int ans = 0;
        for(int j = 0; j < alphabets.length; j++){
            if(alphabets[j] > max){
                max = alphabets[j];
                ans = j;
            }
        }
        char ans2 = (char)(ans + 'a');
        System.err.println("Max Occurance: " + ans2);
    }
}
