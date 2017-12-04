package exception;

/**
 * created  by KDF on 2017/12/4.
 */


public class BookException extends RuntimeException {

    private Integer code;
    public BookException(Integer code,String msg){
        super(msg);
        this.code =code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
