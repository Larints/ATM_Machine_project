package Model.ModelExceptions;

public class DiactivateAccountRequestException extends Exception {
	/**
	 * Ошибка взаимодействия с деактивированным счетом
	 */
	private static final long serialVersionUID = 3731372210856126828L;

	public DiactivateAccountRequestException(String massage) {
		super(massage);
	}
}