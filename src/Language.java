public enum Language {
    ENGLISH(1.73, "English"),
    GERMAN(2.05, "German"),
    FRENCH(2.02, "French"),
    ITALIAN(1.94, "Italian"),
    PORTUGUESE(1.94, "Portuguese"),
    RUSSIAN(1.76, "Russian"),
    SPANISH(1.94, "Spanish"),
    UNKNOWN(2.0, "Unknown");
 
    private double ic;
    private String name;
 
    private Language(double ic, String name) {
        this.ic = ic;
        this.name = name;
    }
 
    public double getIC() {
        return ic;
    }
 
    @Override
    public String toString() {
        return name;
    }
}