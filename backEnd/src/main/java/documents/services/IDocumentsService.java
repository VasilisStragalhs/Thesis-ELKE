package documents.services;

import java.util.List;
import java.util.Optional;

import documents.domainmodel.FormD1;
import documents.domainmodel.FundingBody;
import documents.domainmodel.Project;
import documents.domainmodel.ScientificManager;

public interface IDocumentsService {
	Project findProjectById(int id);
	Optional<Project> findProjectByTitle(String title);
	List<Project> findAllProjects();
	Optional<ScientificManager> findScientificManagerById(int id);
	FundingBody findFundingBodyByName(String name);
	List<FundingBody> findAllFundingBodies();
	public Optional<FormD1> findFormD1ById(int id);
	List<FormD1> findAllFormsD1();
	void addProject(Project project);
	void addFundingBody(FundingBody fundingBody);
	void addScientificManager(ScientificManager scientificManager);
	List<String> findAllScientificCategories();

}
