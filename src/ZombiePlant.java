public class ZombiePlant {
    private int potency;
    private int treatments;

    public ZombiePlant(int potency, int treatment){
        this.potency=potency;
        this.treatments=treatments;
    }

    public int getPotency() {
        return potency;
    }

    public int treatmentsNeeded() {
        return treatments;
    }

    public boolean isDangerous() {
        if(treatments>0){
            return true;
        }
        return false;
    }

    public void treat(int potency) {
        if (potency<=this.potency && this.potency>0 && treatments>0) {
            treatments--;
        }
        if (potency>this.potency){
            treatments++;
        }
    }
}