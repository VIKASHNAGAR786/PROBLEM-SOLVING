public class validpalindrome {
        public boolean isPalindrome(String s) {
            // Removing spaces, commas, and colons
            String modifiedStr = s.replaceAll("[, :]", "");
    
            // Converting the modified string to lowercase
            String lowerCaseStr = modifiedStr.toLowerCase();
    
            String reversedStr = new StringBuilder(lowerCaseStr).reverse().toString();
    
            return s == reversedStr;
        }
}
