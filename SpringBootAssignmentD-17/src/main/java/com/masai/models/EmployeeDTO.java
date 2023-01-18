package com.masai.models;

public class EmployeeDTO {
	
	private Integer employeeId;
    private String firstName;
    private String lastName;
    private String cellPhone;
    private AddressDTO address;
	public EmployeeDTO(Integer employeeId, String firstName, String lastName, String cellPhone, AddressDTO address) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.cellPhone = cellPhone;
		this.address = address;
	}
	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
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
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public AddressDTO getAddress() {
		return address;
	}
	public void setAddress(AddressDTO address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", cellPhone=" + cellPhone + ", address=" + address + "]";
	}
    
    

}
