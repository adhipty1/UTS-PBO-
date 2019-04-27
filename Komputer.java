public class Komputer {
    private CPU cpu;
    public Komputer(CPU cpu){
        this.cpu = cpu;
    }
    public Komputer(){
    }
    public void memasang(CPU cpu){
        System.out.println("CPU: "+cpu.getCPUDAta()+" dipasang");
    }
    public void melepas(CPU cpu){
        System.out.println("CPU: "+cpu.getCPUDAta()+" dilepas");
    }
    public void cetakInfo(CPU cpu){
        System.out.println("Spesifikasi: CPU: "+cpu.getCPUDAta()+" dipasang");
    }   
}
