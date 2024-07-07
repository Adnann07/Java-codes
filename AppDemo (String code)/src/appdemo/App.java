package appdemo;

public class App {
    public String checkMsg(String msg) {
        // Step 1: Remove spaces within the sentence
        String processedMsg = msg.replaceAll("\\s+", "");
        
        // Step 2: Convert the entire sentence into lowercase
        processedMsg = processedMsg.toLowerCase();
        
        // Step 3: Check if the sentence is a palindrome
        boolean isPalindrome = isPalindrome(processedMsg);
        
        // Step 4: Return the result based on palindrome check
        if (isPalindrome) {
            return processedMsg + " Threat";
        } else {
            return processedMsg + " Not a threat";
        }
    }
    
    private boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
