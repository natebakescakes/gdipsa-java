package dullclass;

import java.util.Date;
import java.util.Objects;

public class Student {
	
	private String name;
	private Date dob;
	private String nric;
	private String nickName;
	private int mark;
	
	public Student() {
		super();
	}
	
	public Student(String name, Date dob, String nric, String nickName, int mark) {
		super();
		this.name = name;
		this.dob = dob;
		this.nric = nric;
		this.nickName = nickName;
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getNric() {
		return nric;
	}

	public void setNric(String nric) {
		this.nric = nric;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}
	
	@Override
	public String toString() {
		return String.format("Student [name=%s, dob=%s, nric=%s, nickName=%s, mark=%d]", name, dob, nric, nickName, mark);
	}

	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((nric == null) ? 0 : nric.hashCode());
//		return result;
		
		return Objects.hash(this.nric);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (nric == null) {
			if (other.nric != null)
				return false;
		} else if (!nric.equals(other.nric))
			return false;
		return true;
	}

	
	

}
