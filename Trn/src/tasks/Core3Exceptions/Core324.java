package tasks.Core3Exceptions;

import java.util.Objects;

public class Core324 {
    public static void main(String[] args) throws BadCreditHistoryException, ProblemWithLawException {
        BankClient client1 = new BankClient("Good");
        BankClient client2 = new BankClient("Проблемы с законом");
        BankClient client3 = new BankClient("Проблемы с банковской историей");
        BankWorker rabotnik = new BankRabotnik();
        System.out.println(getCreditForClient(rabotnik, client1) + "\n"); //true

        System.out.println(getCreditForClient(rabotnik, client2) + "\n"); //false

        System.out.println(getCreditForClient(rabotnik, client3) + "\n"); // "Проблемы с банковской историей" false

    }

    public static boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) throws ProblemWithLawException, BadCreditHistoryException {
        try {
            return bankWorker.checkClientForCredit(bankClient);
        } catch (BadCreditHistoryException exception) {
            System.out.println("Проблемы с банковской историей");
            return false;
        } catch (ProblemWithLawException exception) {
            return false;
        }
    }
}

class ProblemWithLawException extends Exception {
}

class BadCreditHistoryException extends Exception {
}

class BankRabotnik implements BankWorker {
    @Override
    public boolean checkClientForCredit(BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException {
        if (bankClient.status.equals("Проблемы с банковской историей")) {
            throw new BadCreditHistoryException();
        } else if (bankClient.status.equals("Проблемы с законом")) {
            throw new ProblemWithLawException();
        }
        return true;
    }
}

class BankClient {
    public String status;

    public BankClient(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankClient that = (BankClient) o;
        return Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status);
    }
}

interface BankWorker {
    boolean checkClientForCredit(BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException;
}