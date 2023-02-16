package musteatag.com;
import java.util.ArrayList;

public class pc {

        CPU cpu;
        RAM ram;
        GPU gpu;

        ArrayList<pc>componenti= new ArrayList<>();

        public pc(CPU cpu, RAM ram, GPU gpu, ArrayList<pc> componenti) {
            this.cpu = cpu;
            this.ram = ram;
            this.gpu = gpu;
            this.componenti = componenti;
        }

        public CPU getCpu() {
            return cpu;
        }

        public void setCpu(CPU cpu) {
            this.cpu = cpu;
        }

        public RAM getRam() {
            return ram;
        }

        public void setRam(RAM ram) {
            this.ram = ram;
        }

        public GPU getGpu() {
            return gpu;
        }

        public void setGpu(GPU gpu) {
            this.gpu = gpu;
        }

        public ArrayList<pc> getComponenti() {
            return componenti;
        }

        public void setComponenti(ArrayList<pc> componenti) {
            this.componenti = componenti;
        }
    }

