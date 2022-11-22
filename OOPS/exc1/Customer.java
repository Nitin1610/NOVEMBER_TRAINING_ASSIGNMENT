package com.yash.exc1;

public class Customer extends Person {
	
	private String date_of_registration;
    private String delivery_address;
    private  String contactno;
    private String email_id;

    @Override
    public String toString() {
        return super.toString() + "Customer{" +
                "date_of_registration='" + date_of_registration + '\'' +
                ", delivery_address='" + delivery_address + '\'' +
                ", contactno='" + contactno + '\'' +
                ", email_id='" + email_id + '\'' +
                '}';
    }

    public Customer(int pId, String pName, String pAddress, String dob, String date_of_registration, String delivery_address,
                    String contactno, String email_id) {
        super(pId, pName, pAddress, dob);
        this.date_of_registration = date_of_registration;
        this.delivery_address = delivery_address;
        this.contactno = contactno;
        this.email_id = email_id;
    }

    public String getDate_of_registration() {
        return date_of_registration;
    }

    public String getDelivery_address() {
        return delivery_address;
    }

    public String getContactno() {
        return contactno;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setDate_of_registration(String date_of_registration) {
        this.date_of_registration = date_of_registration;
    }

    public void setDelivery_address(String delivery_address) {
        this.delivery_address = delivery_address;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

}
