package tr.com.netas.spidr.client.logger;

public class Message {
	String user;
	String notificationId;
	String message;
	String args;
	
	public Message() {
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(String notificationId) {
		this.notificationId = notificationId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	public String getArgs() {
		return args;
	}

	public void setArgs(String args) {
		this.args = args;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return user + "\n" + notificationId + "\n" + message + "\n" + args;
	}

}
