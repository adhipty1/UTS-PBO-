public class Drive {

        public static void main(String[] args) {
        AMD amd1 = new AMD(0);
        intel intel1 = new intel(0);
        Komputer komputer1 = new Komputer();
        komputer1.cetakInfo(intel1);
        komputer1.memasang(amd1);
        komputer1.melepas(intel1);
        komputer1.cetakInfo(amd1);
    }
}
    

