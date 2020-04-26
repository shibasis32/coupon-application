/**
 * 
 */
package com.personal.couponApplication.model.response;

/**
 * This class will be sent as a response when user has hit the registerUser.
 *
 */
public class UserDetailsResponse {

	private String message;

	private String status;

	private String errorMessage;

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param errorMessage
	 *            the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "UserDetailsResponse [message=" + message + ", status=" + status + ", errorMessage=" + errorMessage
				+ "]";
	}

}
