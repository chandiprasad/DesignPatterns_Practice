package com.mockito.model;

public class Person {
    public static final String UNDEFINED_COUTRY_NAME = "Undefined country";
    public static final String DEFAULT_NAME = "Lewandowski";
    private final String countryName;
    private final String name;
    private int id;
   	private String firstName;
   	private String lastName;

    public Person(String countryName) {
        this.countryName = countryName;
        this.name = DEFAULT_NAME;
    }

    public Person(Person person, String countryName) {
        this.countryName = countryName;
        this.name = person.name;
    }

    public Person() {
        this.countryName = UNDEFINED_COUTRY_NAME;
        this.name = DEFAULT_NAME;
    }

    public Person(String name, String countryName) {
        this.name = name;
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public boolean isCountryDefined() {
        return !UNDEFINED_COUTRY_NAME.equals(this.countryName);
    }

    public String getName() {
        return name;
    }
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
