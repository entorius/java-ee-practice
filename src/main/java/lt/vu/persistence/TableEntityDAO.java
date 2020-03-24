package lt.vu.persistence;


import lt.vu.entities.TableEntity;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped
public class TableEntityDAO {
    @Inject
    private EntityManager em;

    public void persist(TableEntity tableEntity){
        this.em.persist(tableEntity);
    }

    public TableEntity findOne(Integer id){
        return em.find(TableEntity.class, id);
    }

    public TableEntity update(TableEntity tableEntity){
        return em.merge(tableEntity);
    }
}
