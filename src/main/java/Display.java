class Display {
    private double sizeInches;
    private String resolution;

    private boolean isOn;

    public Display(double sizeInches, String resolution) {
        this.sizeInches = sizeInches;
        this.resolution = resolution;
        this.isOn = false;
    }
    public String turnOn() {
        this.isOn = true;
        return "Display turned on. " + this.sizeInches + "-inch, " + this.resolution;
    }
    public String turnOff() {
        this.isOn = false;
        return "Display turned off.";
    }
    public double getSizeInches() {
        return this.sizeInches;
    }
    public String getResolution() {
        return this.resolution;
    }
    public boolean getIsOn() {
        return this.isOn;
    }
    public String toString() {
        return "Display: " + this.sizeInches + "Inches, " + this.resolution;
    }
}