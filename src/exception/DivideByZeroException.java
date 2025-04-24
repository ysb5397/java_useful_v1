package exception;

/**
 * 사용자정의 예외 클래스 만들기
 */
public class DivideByZeroException extends Exception {

    private String message;

    public DivideByZeroException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
