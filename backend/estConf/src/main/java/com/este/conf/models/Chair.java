package com.este.conf.models;

import java.util.SortedSet;
import java.util.TreeSet;

import javax.persistence.Entity;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.SortNatural;

@Entity
public class Chair extends Person {


	@OneToMany(mappedBy = "creator")
	@Cascade(value = { CascadeType.ALL })
	@SortNatural
	private SortedSet<Conference> createdConferences = new TreeSet<>();

	//---------M2M
	
	@OneToMany(mappedBy = "chair")
	@Cascade(value = { CascadeType.ALL })
	@SortNatural
	@MapKey(name = "conference")
	private SortedSet<ChairRole> chairRoles = new TreeSet<>();
	
	
	public Chair() {
		// TODO Auto-generated constructor stub
	}
	public Chair(int idPerson, String title, String firstName, String middleName, String lastName, Byte[] photo,
			String organizationName, String country, String region, String phone, String email, String password) {
		super(idPerson, title, firstName, middleName, lastName, photo, organizationName, country, region, phone, email,
				password);
 	}
	public SortedSet<Conference> getCreatedConferences() {
		return createdConferences;
	}
	public void setCreatedConferences(SortedSet<Conference> createdConferences) {
		this.createdConferences = createdConferences;
	}
	public SortedSet<ChairRole> getChairRoles() {
		return chairRoles;
	}
	public void setChairRoles(SortedSet<ChairRole> chairRoles) {
		this.chairRoles = chairRoles;
	}
	

}
