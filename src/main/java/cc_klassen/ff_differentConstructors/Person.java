package cc_klassen.ff_differentConstructors;

class Person {
	private int age ;
	private String lastName ;
	private boolean havingDrivingLicense ;
	
	Person() {
	}

	Person( int age ) {
		this.age = age ;
	}
	
	Person( String lastName ) {
		this.lastName = lastName ;
	}
	
	Person( int age, String lastName ) {
		this.age = age ;
		this.lastName = lastName ;
	}
	
	
	void incAge() {
		setAge(getAge() + 1) ;
	}
	
	void printAllInformation() {
		System.out.println( " age: " + getAge() + " lastName: " 
				+ getLastName() + " drivLic: " + isHavingDrivingLicense() ) ;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	String getLastName() {
		return lastName;
	}

	void setLastName(String lastName) {
		this.lastName = lastName;
	}

	boolean isHavingDrivingLicense() {
		return havingDrivingLicense;
	}

	void setHavingDrivingLicense(boolean havingDrivingLicense) {
		this.havingDrivingLicense = havingDrivingLicense;
	}

	
}
