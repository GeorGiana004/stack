package musteatag.com;

import java.util.ArrayList;

public class GPU {
    public String  marca;
    public String  modello;
    public int     memoria;
    ArrayList<pc> GPU=new ArrayList<>();

    public GPU(String marca, String modello, int memoria, ArrayList<pc> GPU) {
        this.marca = marca;
        this.modello = modello;
        this.memoria = memoria;
        this.GPU = GPU;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public ArrayList<pc> getGPU() {
        return GPU;
    }

    public void setGPU(ArrayList<pc> GPU) {
        this.GPU = GPU;
    }
}

