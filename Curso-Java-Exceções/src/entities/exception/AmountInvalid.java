package entities.exception;

public class AmountInvalid extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public AmountInvalid(String erro) {
		super(erro);
	}
}
