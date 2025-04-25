package thread;

public class Father extends Thread {

    // 입금 요청 --> 3초
    BankAccount bankAccount;

    public Father(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        // 계좌에 입금 요청 --> 3초가 걸려서 스레드로 구성
        bankAccount.deposit(10_000);
    }
}
