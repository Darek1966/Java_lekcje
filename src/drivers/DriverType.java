package drivers;

public enum DriverType {

    CHROME ("chrome", "/scr/resources/chromedriver.exe"),
    FIREFOX ("firefox", "/sce/resources/firefoxdriver.exe");

    String name;
    String path;

    DriverType(String name, String path) {
        this.name = name;
        this.path = path;

    }
}
