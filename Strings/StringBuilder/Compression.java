package Strings.StringBuilder;

public class Compression {
    public static char[] compress(char[] chars) {
        StringBuilder newStr = new StringBuilder("");
        int n = chars.length;
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }
            newStr.append(chars[i]);
            if (count > 1) {
                newStr.append(count);
            }
        }
        chars = new char[newStr.length()];
        for(int i=0;i<newStr.length();i++){
            chars[i]=newStr.charAt(i);
        }
        char[] charx = chars;
        return charx;
    }
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }
}
