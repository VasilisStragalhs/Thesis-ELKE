package documents.domainmodel;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="projects")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="greek_title")
	private String greek_title;
	
	@Column(name="englishTitle")
	private String english_title;
	
	@Column(name="start_date_fysical")
	private Date startDateFysical;

	@Column(name="end_date_fysical")
	private Date endDateFysical;

	@Column(name="start_date_economical")
	private Date startDateEconomical;

	@Column(name="end_date_economical")
	private Date endDateEconomical;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGreek_title() {
		return greek_title;
	}

	public void setGreek_title(String greek_title) {
		this.greek_title = greek_title;
	}

	public String getEnglish_title() {
		return english_title;
	}

	public void setEnglish_title(String english_title) {
		this.english_title = english_title;
	}

	public Date getStartDateFysical() {
		return startDateFysical;
	}

	public void setStartDateFysical(Date startDateFysical) {
		this.startDateFysical = startDateFysical;
	}

	public Date getEndDateFysical() {
		return endDateFysical;
	}

	public void setEndDateFysical(Date endDateFysical) {
		this.endDateFysical = endDateFysical;
	}

	public Date getStartDateEconomical() {
		return startDateEconomical;
	}

	public void setStartDateEconomical(Date startDateEconomical) {
		this.startDateEconomical = startDateEconomical;
	}

	public Date getEndDateEconomical() {
		return endDateEconomical;
	}

	public void setEndDateEconomical(Date endDateEconomical) {
		this.endDateEconomical = endDateEconomical;
	}

	public Project(int id, String greek_title, String english_title, Date startDateFysical, Date endDateFysical,
			Date startDateEconomical, Date endDateEconomical) {
		super();
		this.id = id;
		this.greek_title = greek_title;
		this.english_title = english_title;
		this.startDateFysical = startDateFysical;
		this.endDateFysical = endDateFysical;
		this.startDateEconomical = startDateEconomical;
		this.endDateEconomical = endDateEconomical;
	}
	
	public Project() {
	}
	
}
