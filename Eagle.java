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
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.println(getName() + " vole ");
        }
    }

    @Override
    public int descend(int meters) {
        if (this.flying) {
            this.altitude = Math.min(this.altitude - meters, 500);
            System.out.println(getName() + " flies downward, altitude: " + this.altitude);
        }
        return this.altitude;
    }

    @Override
    public int ascend(int meters) {
        if (this.flying) {
            this.altitude = Math.min(this.altitude + meters, 500);
            System.out.println(getName() + " flies upward, altitude: " + this.altitude);
        }
        return this.altitude;
    }

    @Override
    public void land() {
        if (this.flying && this.altitude > 0) {
            System.out.println(getName() + " fly like a big bird");
        }
        if (this.flying && this.altitude == 0) {
            System.out.println(getName() + " run like mouse in the field");
        }
    }

}
