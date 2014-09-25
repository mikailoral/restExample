package tr.com.netas.spidr.client.logger;

public class Log {
	String l ;
	String m ;
	String n ;
	String t ;
	
	
	
	public Log() {
	}
	public String getL() {
		return l;
	}
	public void setL(String l) {
		this.l = l;
	}
	public String getM() {
		return m;
	}
	public void setM(String m) {
		this.m = m;
	}
	public String getN() {
		return n;
	}
	public void setN(String n) {
		this.n = n;
	}
	public String getT() {
		return t;
	}
	public void setT(String t) {
		this.t = t;
	}
	
	@Override
	public String toString() {
		return t + " : " + " : " + n + " : " + l + "\n" + m;
	}

}
