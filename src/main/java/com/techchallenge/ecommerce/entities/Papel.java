package com.techchallenge.ecommerce.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "papel")
public class Papel {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id_papel;
private String ds_papel;
public Papel() {

}
public Papel(Long id_papel, String ds_papel) {
	super();
	this.id_papel = id_papel;
	this.ds_papel = ds_papel;
}
public Long getId_papel() {
	return id_papel;
}
public void setId_papel(Long id_papel) {
	this.id_papel = id_papel;
}
public String getDs_papel() {
	return ds_papel;
}
public void setDs_papel(String ds_papel) {
	this.ds_papel = ds_papel;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id_papel == null) ? 0 : id_papel.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Papel other = (Papel) obj;
	if (id_papel == null) {
		if (other.id_papel != null)
			return false;
	} else if (!id_papel.equals(other.id_papel))
		return false;
	return true;
}
@Override
public String toString() {
	return "Papel [id_papel=" + id_papel + ", ds_papel=" + ds_papel + "]";
}


}
