public class PalindromeChecker {
    // Attribute to store the text
    String text;

    // Constructor to initialize the text
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        // Remove spaces and convert to lower case for case-insensitive comparison
        String cleanText = text.replaceAll("\\s", "").toLowerCase();
        
        // Check if the text is equal to its reverse
        StringBuilder reversedText = new StringBuilder(cleanText).reverse();
        return cleanText.equals(reversedText.toString());
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("The text \"" + text + "\" is a palindrome.");
        } else {
            System.out.println("The text \"" + text + "\" is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        // Create a PalindromeChecker object with some text
        PalindromeChecker checker = new PalindromeChecker("A man a plan a canal Panama");

        // Display the result
        checker.displayResult();
    }
}

