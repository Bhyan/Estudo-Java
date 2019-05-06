package entities.exception;

public class WithdrawLimit extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public WithdrawLimit(String erro) {
		super(erro);
	}
}
