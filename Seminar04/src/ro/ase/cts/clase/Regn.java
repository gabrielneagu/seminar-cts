package ro.ase.cts.clase;

import java.util.Date;

public class Regn {
	private String nume;
	private int nrSpecii;
	private Date dataDescoperirii;

	private Regn(String nume, int nrSpecii, Date dataDescoperirii) {
		super();
		this.nume = nume;
		this.nrSpecii = nrSpecii;
		this.dataDescoperirii = dataDescoperirii;
	}

	private static Regn regn = null;

	public static synchronized Regn getInstance(String n, int nr, Date data) {
		if (regn == null) {
			regn = new Regn(n, nr, data);
		}
		return regn;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setNrSpecii(int nrSpecii) {
		this.nrSpecii = nrSpecii;
	}

	public void setDataDescoperirii(Date dataDescoperirii) {
		this.dataDescoperirii = dataDescoperirii;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Regn [nume=");
		builder.append(nume);
		builder.append(", nrSpecii=");
		builder.append(nrSpecii);
		builder.append(", dataDescoperirii=");
		builder.append(dataDescoperirii);
		builder.append("]");
		return builder.toString();
	}

}
