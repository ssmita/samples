package com.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;



@Entity
@Table (name="User_details1")
public class UserDetails {
	
	@Id @GeneratedValue
	private int userId;
	@Column (name="UserName")
	private String username;
	
	@OneToMany
	private Collection<Vehicle> vehicle = new ArrayList<Vehicle>();
	
	
	
/*	@OneToOne
	@JoinColumn(name = "VehicleId")
	private Vehicle vehicle;
*/	
	
	/*@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="USER_ADDRESS",joinColumns=@JoinColumn(name = "USERID"))
	@GenericGenerator(name="hilo-gen",strategy="hilo")
	@CollectionId(columns = {@Column(name="ADDRESS_ID")},generator="hilo-gen",type=@Type(type="long"))
	private Collection<Address> listOfAddresses = new ArrayList<Address>();
	
	
	
	public Collection<Address> getListOfAddresses() {
		return listOfAddresses;
	}

	public void setListOfAddresses(Collection<Address> listOfAddresses) {
		this.listOfAddresses = listOfAddresses;
	}
*/
	/*@Transient
	private int phoneNo;
	@Temporal (TemporalType.DATE)
	private Date joinedDate;
	
	@Lob
	private String description;*/
	
/*	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}*/

	public Collection<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	public int getUserId() {
		System.out.println("Value of userId in getter method is :" + userId);
		return userId;
	}
	
	public void setUserId(int userId) {
		System.out.println("Value of userId in setter method is: " + userId);
		this.userId = userId;
	}
	public String getUsername() {
		System.out.println("Value of username in getter method is: "+ username);
		
		return username;
	}
	public void setUsername(String username) {
		System.out.println("Value of username in setter method is :" + username);
		this.username = username;
	}

/*	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
*/	

}
