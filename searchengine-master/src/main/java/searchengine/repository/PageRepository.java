package searchengine.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import searchengine.model.EntityPage;
import searchengine.model.EntitySite;

import java.util.List;

@Repository
public interface PageRepository extends CrudRepository<EntityPage, Integer> {
    int countAllBySite(EntitySite site);

    List<EntityPage> findBySiteInAndIndexes_Lemma_Lemma(Iterable<EntitySite> sites, String lemma);

    boolean existsBySiteAndPath(EntitySite site, String path);

    EntityPage findBySiteAndPath(EntitySite site, String path);
}
