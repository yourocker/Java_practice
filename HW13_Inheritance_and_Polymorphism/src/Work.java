public class Work {
    public void doWork(Worker[] workers) {
        for (int i = 0; i < workers.length; i++) {
            workers[i].work();
        }
    }

    public void cash(Worker[] workers) {
        for (int i = 0; i < workers.length; i++) {
            workers[i].getSalary();
        }
    }

    public void giveBenefits(Beneficiary[] beneficiaries) {
        for (int i = 0; i < beneficiaries.length; i++) {
            beneficiaries[i].getBenefit();
        }
    }
}
