package documents.mappers;

import org.springframework.data.jpa.repository.JpaRepository;

import documents.domainmodel.FundingBody;

public interface FundingBodyMapper extends JpaRepository<FundingBody, Integer> {
	
}
