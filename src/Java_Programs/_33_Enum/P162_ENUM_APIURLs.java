package Java_Programs._33_Enum;

/*
 * ENUM used to store fixed API base URLs.
 * This avoids hardcoding URLs throughout the code
 * and keeps them centralized and safe.
 */
public enum P162_ENUM_APIURLs {

    // ENUM constants mapped with their respective API URLs
    VWO("https://app.vwo.com"),        // VWO application base URL
    KATALON("https://katalon.com"),    // Katalon website base URL
    GOOGLE("https://google.com");      // Google base URL

    // Variable to hold the URL value
    private final String url;

    /*
     * ENUM constructor
     * Automatically called for each ENUM constant
     * Assigns the URL to the variable
     */
    P162_ENUM_APIURLs(String url) {
        this.url = url;
    }

    /*
     * Getter method to access the URL
     * Provides read-only access to the URL value
     */
    public String getURL() {
        return this.url;
    }
}

package Java_Programs._33_Enum;

public class P163_ENUM_APIURLs_Execution {

    public static void main(String[] args) {

        // Access single URL
        System.out.println("VWO URL     : " + P162_ENUM_APIURLs.VWO.getURL());
        System.out.println("Katalon URL : " + P162_ENUM_APIURLs.KATALON.getURL());
        System.out.println("Google URL  : " + P162_ENUM_APIURLs.GOOGLE.getURL());

        System.out.println("\n---- All API URLs ----");

        // Loop through all enum values
        for (P162_ENUM_APIURLs api : P162_ENUM_APIURLs.values()) {
            System.out.println(api.name() + " -> " + api.getURL());
        }
    }
}
