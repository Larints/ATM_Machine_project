package Model.ModelExceptions;

public class ValidateAccountException extends Exception{
	/**
	 *  Ошибка авторизации пользователя
	 */
	private static final long serialVersionUID = 8152651808576760398L;

	public ValidateAccountException(String massage) {
		super(massage);
	}
}
