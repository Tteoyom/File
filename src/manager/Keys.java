package manager;

public enum Keys {
    //basic
    BASICGCC("GCC"),
    BASICJAVA("Java"),
    FILE("file searching"),
    OUTPUT("output"),

    /*####################################################*/;

    Keys(String key) {
        this.keyString = key;
    }

    public String getKeyString() {
        return keyString;
    }

    private final String keyString;
}