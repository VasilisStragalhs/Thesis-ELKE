package documents.domainmodel;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="form_D1")
public class FormD1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "scientific_manager_id", referencedColumnName = "id")
	private ScientificManager scientificManager;
	
	@Column(name="project_id")
	private int projectId;	
	
	@Column(name="funding_body_id")
	private int fundingBodyId;
	
	@Column(name="status")
	private String status;
	
	@Column(name="has_human")
	private boolean hasHuman;
	
	@Column(name="has_been_submitted")
	private boolean hasBeenSubmitted;
	
	@Column(name="submition_number")
	private String submitionNumber;
	
	@Column(name="has_been_approved")
	private boolean hasBeenApproved;
	
	@Column(name="approval_number")
	private String approvalNumber;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "scientific_area_id", referencedColumnName = "id")
	private ScientificArea scientificArea;
	
	public ScientificArea getScientificArea() {
		return scientificArea;
	}

	public void setScientificArea(ScientificArea scientificArea) {
		this.scientificArea = scientificArea;
	}

	public ScientificManager getScientificManager() {
		return scientificManager;
	}

	public void setScientificManager(ScientificManager scientificManager) {
		this.scientificManager = scientificManager;
	}

	public String getSubmitionNumber() {
		return submitionNumber;
	}

	public String getApprovalNumber() {
		return approvalNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public int getFundingBodyId() {
		return fundingBodyId;
	}

	public void setFundingBodyId(int fundingBodyId) {
		this.fundingBodyId = fundingBodyId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isHasHuman() {
		return hasHuman;
	}

	public void setHasHuman(boolean hasHuman) {
		this.hasHuman = hasHuman;
	}

	public boolean isHasBeenSubmitted() {
		return hasBeenSubmitted;
	}

	public void setHasBeenSubmitted(boolean hasBeenSubmitted) {
		this.hasBeenSubmitted = hasBeenSubmitted;
	}

	public String isSubmitionNumber() {
		return submitionNumber;
	}

	public void setSubmitionNumber(String submitionNumber) {
		this.submitionNumber = submitionNumber;
	}

	public boolean isHasBeenApproved() {
		return hasBeenApproved;
	}

	public void setHasBeenApproved(boolean hasBeenApproved) {
		this.hasBeenApproved = hasBeenApproved;
	}

	public String isApprovalNumber() {
		return approvalNumber;
	}

	public void setApprovalNumber(String approvalNumber) {
		this.approvalNumber = approvalNumber;
	}

	
	public FormD1() {
		
	}
}
