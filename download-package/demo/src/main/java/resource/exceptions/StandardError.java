package resource.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;
	private static String timestamp;
	private static String status;
	private static String error;
	private static String message;
	private static String path;
 
	public StandardError() {
	}
	
	public StandardError(String timestamp, String status, String error, String message, String path) {
		StandardError.setTimestamp(timestamp);
		StandardError.setStatus(status);
		StandardError.setError(error);
		StandardError.setMessage(message);
		StandardError.setPath(path);
	}

	
    public StandardError(int value, String string) {
		// TODO Auto-generated constructor stub
	}

	public static String getTimestamp() {
		return timestamp;
	}

	public static void setTimestamp(String timestamp) {
		StandardError.timestamp = timestamp;
	}

	public static String getStatus() {
		return status;
	}

	public static void setStatus(String status) {
		StandardError.status = status;
	}

	public static String getError() {
		return error;
	}

	public static void setError(String error) {
		StandardError.error = error;
	}

	public static String getMessage() {
		return message;
	}

	public static void setMessage(String message) {
		StandardError.message = message;
	}

	public static String getPath() {
		return path;
	}

	public static void setPath(String path) {
		StandardError.path = path;
	}

}
