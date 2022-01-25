package pre.DomainDrivenDesign.exception;

/**
 * @Description:
 * @Author: yanzhihao
 * @Date: 2022/1/24 2:11 下午
 */
public class InsufficientBalanceException extends Throwable {
    public InsufficientBalanceException(String s) {
        super(s);
    }
}
