package documents.domainmodel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="scientific_areas")
public class ScientificArea {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="catid")
	private int catid;
	
	@Column(name="category")
	private String category;
	
	@Column(name="subid")
	private int subid;
	
	@Column(name="subcategory")
	private String subcategory;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getSubcategory() {
		return subcategory;
	}


	public int getCatid() {
		return catid;
	}


	public void setCatid(int catid) {
		this.catid = catid;
	}


	public int getSubid() {
		return subid;
	}


	public void setSubid(int subid) {
		this.subid = subid;
	}


	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}


	public ScientificArea() {
	}
	
}
