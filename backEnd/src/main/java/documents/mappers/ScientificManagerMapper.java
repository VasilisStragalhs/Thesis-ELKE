package documents.mappers;

import org.springframework.data.jpa.repository.JpaRepository;

import documents.domainmodel.ScientificManager;

public interface ScientificManagerMapper extends JpaRepository<ScientificManager, Integer> {
	
}
