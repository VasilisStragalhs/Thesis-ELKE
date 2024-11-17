package documents.mappers;

import org.springframework.data.jpa.repository.JpaRepository;

import documents.domainmodel.Project;

public interface ProjectMapper extends JpaRepository<Project, Integer> {
	
}
