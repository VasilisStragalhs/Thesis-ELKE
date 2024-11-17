package documents.mappers;

import org.springframework.data.jpa.repository.JpaRepository;

import documents.domainmodel.ScientificArea;

public interface ScientificAreaMapper extends JpaRepository<ScientificArea, Integer> {
	
}
