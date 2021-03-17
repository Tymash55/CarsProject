package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="items")
public class Cars{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="ID")
	private int id;
	
	@Column(name="Serial Number")
	private int serialNum;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="COLOR")
	private String color;
	
	//add @ManyToOne(cascade=CascateType.MERGE, fetch=FetchType.EAGER)
	//Finish  join	@JoinColumn(name="")
	
	//Default Constructor
	public Cars() {
		super();
	}

	public Cars(String name, String color, int serialNum) {
		this.name = name;
		this.color = color;
		this.serialNum = serialNum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Cars [id=" + id + ". serial number=" + serialNum +  ", name=" + name + ", color=" + color + "]";
	}
	
	
}
	
