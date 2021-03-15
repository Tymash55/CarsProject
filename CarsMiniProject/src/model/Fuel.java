package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="fuel")
public class Fuel{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="ID")
	private int id;
	
	@Column(name="Serial number")
	private int serialNumber;
	
	@Column(name="OCTANE")
	private int octane;
	
	@Column(name="LB")
	private int lb;
	

	
	//add @ManyToOne(cascade=CascateType.MERGE, fetch=FetchType.EAGER)
	//Finish  join	@JoinColumn(name="")
	
	//Default Constructor
	public Fuel() {
		super();
	}
	
	public Fuel(int octane, int lb) {
		this.id = id;
		this.serialNumber = serialNumber;
		this.octane = octane;
		this.lb=lb;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getOctane() {
		return octane;
	}

	public void setOctane(int octane) {
		this.octane = octane;
	}
	
	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public int getLb() {
		return lb;
	}

	public void setLb(int lb) {
		this.lb = lb;
	}

	
	@Override
	public String toString() {
		return "Cars [id=" + id + ",serial number=" + serialNumber + ", octane=" + octane + ", lb=" + lb + "]";
	}
	
	
}