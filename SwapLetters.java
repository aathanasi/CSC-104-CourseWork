public class SwapLetters {
    public static String swapLetters(String str, int index1, int index2) {
        if (str == null || index1 < 0 || index2 < 0 || index1 >= str.length() || index2 >= str.length()) {
            throw new IllegalArgumentException("Invalid indices or null string");
        }
        
        // Convert string to a character array for easy swapping
        char[] chars = str.toCharArray();
        
        // Swap the characters at the specified indices
        char temp = chars[index1];
        chars[index1] = chars[index2];
        chars[index2] = temp;
        
        // Return the modified string
        return new String(chars);
    }

    public static void main(String[] args) {
        String original = "hello";
        int index1 = 1; // 'e'
        int index2 = 4; // 'o'
        
        String result = swapLetters(original, index1, index2);
        System.out.println("Original String: " + original);
        System.out.println("Modified String: " + result);
    }
}
