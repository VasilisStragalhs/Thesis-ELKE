package documents.controllers;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import documents.domainmodel.FormD1;
import documents.domainmodel.FundingBody;
import documents.domainmodel.Project;
import documents.domainmodel.ScientificManager;
import documents.services.IDocumentsService;


@RestController
public class DocumentsController {

	@Autowired 
	private IDocumentsService documentsService;
	
	@GetMapping("/user/findScientificManager/{id}")
	public Optional<ScientificManager> findScientificManagerById(@PathVariable int id){
		return documentsService.findScientificManagerById(id);
	}
	
	@GetMapping("/user/findProject/{id}")
	public Project findProjectById(@PathVariable int id){
		return documentsService.findProjectById(id);
	}
	
	@GetMapping("/user/findProjectByTitle/{title}")
	public Optional<Project> findProjectByTitle(@PathVariable String title){
		return documentsService.findProjectByTitle(title);
	}
	
	@GetMapping("/user/findAllProjects")
	public List<Project> findAllProjects(){
		return documentsService.findAllProjects();
	}
	
	
	@GetMapping("/user/findFundingBodyByName/{name}")
	public FundingBody findFundingBodyByName(@PathVariable String name){
		return documentsService.findFundingBodyByName(name);
	}
	
	@GetMapping("/user/findAllFundignBodies")
	public List<FundingBody> findAllFundignBodies(){
		return documentsService.findAllFundingBodies();
	}
	
	@GetMapping("/user/findFormD1/{id}")
	public Optional<FormD1> findFormD1ById(@PathVariable int id){
		return documentsService.findFormD1ById(id);
	}
	
	@GetMapping("/user/findAllFormsD1")
	public List<FormD1> findAllFormsD1(){
		return documentsService.findAllFormsD1();
	}
	
	@PostMapping("/user/addProject")
	public void saveProject(@RequestBody Project project){
		documentsService.addProject(project);
	}
	
	@PostMapping("/user/addFundingBody")
	public void saveFundingBody(@RequestBody FundingBody fundingBody){
		documentsService.addFundingBody(fundingBody);
	}
	
	@PostMapping("/user/addScientificManager")
	public void saveScientificManager(@RequestBody ScientificManager scientificManager){
		documentsService.addScientificManager(scientificManager);
	}
	
	@GetMapping("/user/findAllScientificCategories")
	public List<String> findAllScientificCategories(){
		return documentsService.findAllScientificCategories();
	}
}
