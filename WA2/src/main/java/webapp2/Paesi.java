package webapp2;

import java.util.ArrayList;
import java.util.List;

public class Paesi {
	
	static List<String> ita= new ArrayList<>();
	static List<String> fra= new ArrayList<>();
	static List<String> ger= new ArrayList<>();
	public Paesi(List<String> ita, List<String> fra, List<String> ger) {
		super();
		this.ita = ita;
		this.fra = fra;
		this.ger = ger;
	}
	public static List<String> getIta() {
		return ita;
	}
	public void setIta(List<String> ita) {
		this.ita = ita;
	}
	public static List<String> getFra() {
		return fra;
	}
	public void setFra(List<String> fra) {
		this.fra = fra;
	}
	public static List<String> getGer() {
		return ger;
	}
	public void setGer(List<String> ger) {
		this.ger = ger;
	}
	
}
