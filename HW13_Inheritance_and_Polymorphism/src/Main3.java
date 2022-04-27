public class Main3 {
    public static void main(String[] args) {
        Athlete athlete = new Athlete("Grafov", 30, 5);
        Workman yourock = new Workman("Yura", 34, 18);
        Student sobaka = new Student("Dog", 17, 13.6);

        Worker[] workers = {athlete, yourock};
        Beneficiary[] beneficiaries = {athlete, sobaka};

        Work work = new Work();
        work.doWork(workers);
        work.cash(workers);
        work.giveBenefits(beneficiaries);
    }
}
