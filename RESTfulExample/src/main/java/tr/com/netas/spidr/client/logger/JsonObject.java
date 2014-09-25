package tr.com.netas.spidr.client.logger;

import java.util.List;

public class JsonObject {
	String r;
	List<Log> lg;
	
	
	public JsonObject() {
	}
	public String getR() {
		return r;
	}
	public void setR(String r) {
		this.r = r;
	}
	public List<Log> getLg() {
		return lg;
	}
	public void setLg(List<Log> lg) {
		this.lg = lg;
	}

}
