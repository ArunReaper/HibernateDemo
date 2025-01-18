package org.example;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Date;

@Entity
@Table(name = "StudentDetails")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private int addressId;

    @Column(length = 50, name = "STREET")
    private String street;

    @Column(length = 100)
    private String city;

    private boolean isPostalAddress;

    @Temporal(TemporalType.DATE)
    private Date dateAdded;

    private double salary;

    @Lob
    private byte[] image;


    public Address() {
        super();
    }

    public Address(int addressId, String street, String city, boolean isPostalAddress, Date dateAdded, double salary, byte[] image) {
        this.addressId = addressId;
        this.street = street;
        this.city = city;
        this.isPostalAddress = isPostalAddress;
        this.dateAdded = dateAdded;
        this.salary = salary;
        this.image = image;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isPostalAddress() {
        return isPostalAddress;
    }

    public void setPostalAddress(boolean postalAddress) {
        isPostalAddress = postalAddress;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", isPostalAddress=" + isPostalAddress +
                ", dateAdded=" + dateAdded +
                ", salary=" + salary +
                ", image=" + Arrays.toString(image) +
                '}';
    }
}
