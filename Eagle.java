public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        System.out.println(getName() + " décolle!");
        this.flying = true;
    }

    @Override
    public void ascend(int meters) {
        if (isFlying()) {
            altitude += meters;
            System.out
                    .println(getName() + " monte de " + meters + " mètres. Son altititude est de : " + this.altitude
                            + " mètres.");
        } else {
            System.out
                    .println(getName() + "ne peut pas voler, car il n'as pas décollé.");
        }

    }

    @Override
    public void glide() {
        if (isFlying()) {
            System.out.println(getName() + " est en train de planer comme un rasta.");
        } else {
            System.out
                    .println(getName() + " ne peut pas voler, car il n'as pas décollé.");
        }
    }

    @Override
    public void descend(int meters) {
        if (isFlying()) {
            altitude -= meters;
            System.out.println(
                    getName() + " descend de " + meters + " mètres. Son altititude est de : " + this.altitude
                            + " mètres.");
        } else {
            System.out
                    .println(getName() + " ne peut pas voler, car il n'a pas décollé.");
        }
    }

    @Override
    public void land() {
        if (isFlying()) {
            this.flying = false;
            System.out.println(
                    getName() + " vient de se poser.");
        } else {
            System.out.println(
                    getName() + "ne peut pas attérir, car il n'a pas décollé");
        }
    }
}
