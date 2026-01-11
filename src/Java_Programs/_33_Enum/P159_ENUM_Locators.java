package Java_Programs._33_Enum;

public enum P159_ENUM_Locators {

    PAGE_BUTTON("#btn"),
    PAGE_INPUT("#input1");

    private final String locator;

    P159_ENUM_Locators(String locator) {
        this.locator = locator;
    }

    public String getLocator() {
        return this.locator;
    }
}
