package co.udea.heroes.api.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason="undefined")
public class GeneralException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String message;
	private String translationKey;

	public GeneralException(String message) {
		this.message =  message;
	}

	public GeneralException(String message, String translationKey) {
		this.message =  message;
		this.translationKey = translationKey;
	}

	public String getTranslationKey() {
		return translationKey;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
