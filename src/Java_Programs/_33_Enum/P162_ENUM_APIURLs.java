package Java_Programs._33_Enum;

public enum P162_ENUM_APIURLs {
    vwo("https://app.vwo.com"),
    katalon("https://katalon.com"),
    google("https://google.com");

    private String URL;

    P162_ENUM_APIURLs(String URL) {
        this.URL = URL;
    }

    String getURL() {
        return this.URL;
    }
}
