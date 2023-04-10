package ru.ezuykow.europeanpark.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

/**
 * @author ezuykow
 */
@Entity
@Table(name = "persons")
public class Person {

    @Id
    @Column(name = "tg_user_id")
    private Long tgUserId;
    @Column(name = "tg_username")
    private String tgUsername;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "role")
    private String role;
    @Column(name = "entrance")
    private Integer entrance;
    @Column(name = "floor")
    private Integer floor;
    @Column(name = "flat_number")
    private Integer flatNumber;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "car_number")
    private String carNumber;
    @Column(name = "parking_number")
    private String parkingNumber;
    @Column(name = "rating")
    private Integer rating;

    public Long getTgUserId() {
        return tgUserId;
    }

    public void setTgUserId(Long tgUserId) {
        this.tgUserId = tgUserId;
    }

    public String getTgUsername() {
        return tgUsername;
    }

    public void setTgUsername(String tgUsername) {
        this.tgUsername = tgUsername;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getEntrance() {
        return entrance;
    }

    public void setEntrance(Integer entrance) {
        this.entrance = entrance;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(Integer flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getParkingNumber() {
        return parkingNumber;
    }

    public void setParkingNumber(String parkingNumber) {
        this.parkingNumber = parkingNumber;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(tgUserId, person.tgUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tgUserId);
    }

    @Override
    public String toString() {
        return "Person{" +
                "tgUserId=" + tgUserId +
                ", tgUsername='" + tgUsername + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role='" + role + '\'' +
                ", entrance=" + entrance +
                ", floor=" + floor +
                ", flatNumber=" + flatNumber +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", parkingNumber='" + parkingNumber + '\'' +
                ", rating=" + rating +
                '}';
    }
}
