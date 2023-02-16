package musteatag.com;

import java.util.ArrayList;

public class RAM {

    private String tecnologia_DDR;
    private double requenza;
    private int latency;
    ArrayList<pc>ram;

    public RAM(String tecnologia_DDR, double requenza, int latency, ArrayList<pc> ram) {
        this.tecnologia_DDR = tecnologia_DDR;
        this.requenza = requenza;
        this.latency = latency;
        this.ram = ram;
    }

    public String getTecnologia_DDR() {
        return tecnologia_DDR;
    }

    public void setTecnologia_DDR(String tecnologia_DDR) {
        this.tecnologia_DDR = tecnologia_DDR;
    }

    public double getRequenza() {
        return requenza;
    }

    public void setRequenza(double requenza) {
        this.requenza = requenza;
    }

    public int getLatency() {
        return latency;
    }

    public void setLatency(int latency) {
        this.latency = latency;
    }

    public ArrayList<pc> getRam() {
        return ram;
    }

    public void setRam(ArrayList<pc> ram) {
        this.ram = ram;
    }
}

