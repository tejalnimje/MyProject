package Phase1;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        int index = compress(chars);
        for (int i = 0; i < index; i++){
            System.err.print(chars[i]);
        }
    }

    public static int compress(char[] chars) {
        int i = 0;
        int ansIndex = 0;
        int n = chars.length;
        while(i < n){
            int j = i+1;
            while(j < n && chars[i] == chars[j]){
                j++;
            }
            chars[ansIndex++] = chars[i];
            int count = j-i;
            if(count > 1){
                String cnt = Integer.toString(count);
                for(char ch : cnt.toCharArray()){
                    chars[ansIndex++] = ch;
                }
            }
            i = j;
        }
        return ansIndex;
    }
}
