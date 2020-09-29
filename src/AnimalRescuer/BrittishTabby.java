package AnimalRescuer;

public class BrittishTabby extends Cat {

    private boolean shortHair;

    public boolean isShortHair() {
        return shortHair;
    }

    public void setShortHair(boolean shortHair) {
        this.shortHair = shortHair;
    }

    @Override
    public void sleep() {
        System.out.println("Sleeps a lot");
    }
}
