package musteatag.com;

import java.util.ArrayList;

public class CPU {
    private String marca;
    private String serie;
    private double core;
    private double thread;
    private double frequenza;
    ArrayList<pc> cpu = new ArrayList<>();

    public void CPU(String marca, String serie, double core, double thread, double frequenza, ArrayList<pc> cpu) {
        this.marca = marca;
        this.serie = serie;
        this.core = core;
        this.thread = thread;
        this.frequenza = frequenza;
        this.cpu = cpu;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public double getCore() {
        return core;
    }

    public void setCore(double core) {
        this.core = core;
    }

    public double getThread() {
        return thread;
    }

    public void setThread(double thread) {
        this.thread = thread;
    }

    public double getFrequenza() {
        return frequenza;
    }

    public void setFrequenza(double frequenza) {
        this.frequenza = frequenza;
    }

    public ArrayList<pc> getCpu() {
        return cpu;
    }

    public void setCpu(ArrayList<pc> cpu) {
        this.cpu = cpu;
    }
}



