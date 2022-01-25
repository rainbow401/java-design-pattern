package pre.DomainDrivenDesign.exception;

/**
 * @Description:
 * @Author: yanzhihao
 * @Date: 2022/1/24 2:11 下午
 */
public class InvalidAmountException extends Throwable {
    public InvalidAmountException(String s) {
        super(s);
    }
}
