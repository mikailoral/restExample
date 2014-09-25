package tr.com.netas.spidr.client.logger;

public class Track {

	String title;
	String singer;
	int rakam;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}
	

	public int getRakam() {
		return rakam;
	}

	public void setRakam(int rakam) {
		this.rakam = rakam;
	}

	@Override
	public String toString() {
		return "Track [title=" + title + ", singer=" + singer + " rakam: " + rakam +"]";
	}

}
