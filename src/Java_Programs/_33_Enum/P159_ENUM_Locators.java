package Java_Programs._33_Enum;

public enum P159_ENUM_Locators {
    page_button("#btn"), //page object for button
    page_input("#input1");
    private String locators;

    P159_ENUM_Locators(String locators) {
        this.locators = locators;
    }

    String getLocators(){
        return this.locators;
    }
}