package lolrecordsearch.domain;

import lolrecordsearch.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "records", path = "records")
public interface RecordRepository
    extends PagingAndSortingRepository<Record, String> {}
