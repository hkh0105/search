package lolrecordsearch.domain;

import lolrecordsearch.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "champions", path = "champions")
public interface ChampionRepository
    extends PagingAndSortingRepository<Champion, String> {}
