package yte.summerp.oopjava.composition;

public class Grade {
	public static final Grade AA = new Grade("AA");
	public static final Grade BA = new Grade("BA");
	public static final Grade BB = new Grade("BB");
	public static final Grade CB = new Grade("CB");
	public static final Grade CC = new Grade("CC");
	public static final Grade DC = new Grade("DC");
	public static final Grade DD = new Grade("DD");
	public static final Grade FD = new Grade("FD");
	public static final Grade FF = new Grade("FF");

	private String gradeCode;

	public Grade(String gradeCode) {
		this.gradeCode = gradeCode;
	}

	public String getGradeCode() {
		return gradeCode;
	}
}
