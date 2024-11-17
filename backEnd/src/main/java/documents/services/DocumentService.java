package documents.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import documents.domainmodel.FormD1;
import documents.domainmodel.FundingBody;
import documents.domainmodel.Project;
import documents.domainmodel.ScientificArea;
import documents.domainmodel.ScientificManager;
import documents.mappers.FormD1Mapper;
import documents.mappers.FundingBodyMapper;
import documents.mappers.ProjectMapper;
import documents.mappers.ScientificAreaMapper;
import documents.mappers.ScientificManagerMapper;

@Service
public class DocumentService implements IDocumentsService{

	@Autowired
	private FormD1Mapper formD1mapper;
	
	@Autowired
	private FundingBodyMapper fundingBodyMapper;
	
	@Autowired
	private ProjectMapper projectMapper;
	
	@Autowired
	private ScientificManagerMapper scientificManagerMapper;

	@Autowired
	private ScientificAreaMapper scientificAreaMapper;

	
	@Override
	public Project findProjectById(int id) {
		// TODO Auto-generated method stub
		return projectMapper.findById(id).get();
	}

	@Override
	public List<Project> findAllProjects() {
		// TODO Auto-generated method stub
		return projectMapper.findAll();
	}

	@Override
	public Optional<Project> findProjectByTitle(String title) {
		// TODO Auto-generated method stub
		List<Project> projects = projectMapper.findAll();
		for(Project project : projects) {
			if(project.getGreek_title().equals(title))
				return Optional.of(project);
		}
		
		return Optional.empty();
	}

	@Override
	public Optional<ScientificManager> findScientificManagerById(int id) {
		// TODO Auto-generated method stub
		return scientificManagerMapper.findById(id);
	}

	@Override
	public FundingBody findFundingBodyByName(String name) {
		// TODO Auto-generated method stub
		List<FundingBody> fundingBodies = findAllFundingBodies();
		for(FundingBody fundingBody : fundingBodies) {
			if(fundingBody.getName().equals(name))
				return fundingBody;//Optional.of(fundingBody);
		}
		return null;//Optional.empty();
	}

	@Override
	public List<FundingBody> findAllFundingBodies() {
		// TODO Auto-generated method stub
		return fundingBodyMapper.findAll();
	}

	@Override
	public Optional<FormD1> findFormD1ById(int id) {
		// TODO Auto-generated method stub
		return formD1mapper.findById(id);
	}

	@Override
	public List<FormD1> findAllFormsD1() {
		// TODO Auto-generated method stub
		return formD1mapper.findAll();
	}

	@Override
	public void addProject(Project project) {
		// TODO Auto-generated method stub
		projectMapper.save(project);
	}

	@Override
	public void addFundingBody(FundingBody fundingBody) {
		// TODO Auto-generated method stub
		fundingBodyMapper.save(fundingBody);
		
	}

	@Override
	public void addScientificManager(ScientificManager scientificManager) {
		// TODO Auto-generated method stub
		scientificManagerMapper.save(scientificManager);
	}

	@Override
	public List<String> findAllScientificCategories() {
		// TODO Auto-generated method stub
		List<ScientificArea> scientificAreas = scientificAreaMapper.findAll();
		List<String> categories = new ArrayList<String>();
		int id = 0;
		
		for(ScientificArea scientificArea : scientificAreas) {
			if(scientificArea.getCatid() == id) {
				continue;
			}
			id++;
			categories.add(scientificArea.getCategory());
		}
		return categories;
	}
}
