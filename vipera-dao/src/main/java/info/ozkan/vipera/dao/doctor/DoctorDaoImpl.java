package info.ozkan.vipera.dao.doctor;

import info.ozkan.vipera.business.doctor.DoctorManagerError;
import info.ozkan.vipera.entities.Doctor;
import info.ozkan.vipera.entities.DoctorNotificationSetting;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * Hekim veritabanı üzerinde işlem yapan Dao sınıfı
 * 
 * @author Ömer Özkan
 * 
 */
@Named("doctorDao")
public class DoctorDaoImpl implements DoctorDao {
    /**
     * Hekimi api ile arar
     */
    private static final String JQL_BY_API =
            "from Doctor d WHERE d.apiKey = :apiKey";
    /**
     * Hekimi id ile arar
     */
    private static final String JQL_GET_BY_ID =
            "from Doctor d where d.id = :id";
    /**
     * hekimi tckn ile arar
     */
    protected static final String JQL_GET_BY_TCKN =
            "from Doctor d where d.tckn = :tckn";
    /**
     * Persistence nesne
     */
    private EntityManager em;

    /*
     * (non-Javadoc)
     * 
     * @see info.ozkan.vipera.dao.doctor.DoctorDao#add(info.ozkan.vipera
     * .entities.Doctor)
     */
    public DoctorDaoResult add(final Doctor doctor) {
        final DoctorDaoResult result = new DoctorDaoResult();
        em.persist(doctor);
        for (final DoctorNotificationSetting setting : doctor.getSettings()) {
            em.merge(setting);
        }
        result.setSuccess(true);
        return result;
    }

    /**
     * {@link DoctorBrowseFilter} nesnesini {@link CriteriaQuery} nesnesine
     * dönüştürür
     * 
     * @param filter
     *            filtre
     * @return
     */
    private CriteriaQuery<Doctor> creataCriteriaQueryFromFilter(
            final DoctorBrowseFilter filter) {
        final CriteriaBuilder cb = em.getCriteriaBuilder();
        final CriteriaQuery<Doctor> cq = cb.createQuery(Doctor.class);
        final Root<Doctor> root = cq.from(Doctor.class);
        final Map<String, Object> filters = filter.getFilters();
        final List<Predicate> predicates = new ArrayList<Predicate>();
        for (final String attr : filters.keySet()) {
            final Object obj = filters.get(attr);
            if (obj != null && !obj.toString().isEmpty()) {
                final String pattern = '%' + obj.toString() + '%';
                predicates.add(cb.like(
                        root.<String> get(attr).as(String.class), pattern));
            }
        }
        cq.select(root).where(predicates.toArray(new Predicate[0]));
        return cq;
    }

    public DoctorDaoResult delete(final Doctor doctor) {
        final DoctorDaoResult result = new DoctorDaoResult();
        em.remove(em.merge(doctor));
        result.setSuccess(true);
        result.setDoctor(doctor);
        return result;
    }

    /**
     * Filtrelere göre veritabanında arama işlemi yapar
     */
    public List<Doctor> find(final DoctorBrowseFilter filter) {
        final CriteriaQuery<Doctor> cq = creataCriteriaQueryFromFilter(filter);
        return em.createQuery(cq).getResultList();
    }

    public DoctorDaoResult getById(final Long id) {
        final DoctorDaoResult result = new DoctorDaoResult();
        final Query query = em.createQuery(JQL_GET_BY_ID);
        query.setParameter(Doctor.ID, id);
        final List<Doctor> doctors = query.getResultList();
        if (doctors.size() == 0) {
            result.setSuccess(false);
            result.setError(DoctorManagerError.DOCTOR_NOT_EXIST);
        } else {
            result.setSuccess(true);
            result.setDoctor(doctors.get(0));
        }
        return result;
    }

    /**
     * Veritabanından TCKN'ye ait hekimi sorgular
     * 
     * @param tckn
     *            TC Kimlik No
     * @return Doctor nesnesi
     */
    public DoctorDaoResult getByTckn(final Long tckn) {
        final Query query = em.createQuery(JQL_GET_BY_TCKN);
        query.setParameter(Doctor.TCKN, tckn);
        final DoctorDaoResult result = new DoctorDaoResult();
        final List resultList = query.getResultList();
        getSingleResult(result, resultList);
        return result;
    }

    /**
     * Eğer kayıt varsa ilk kaydı sonuca ekler
     * 
     * @param result
     * @param resultList
     */
    private void getSingleResult(final DoctorDaoResult result,
            final List resultList) {
        if (resultList.size() == 0) {
            result.setSuccess(false);
            result.setError(DoctorManagerError.DOCTOR_NOT_EXIST);
        } else {
            result.setSuccess(true);
            result.setDoctor((Doctor) resultList.get(0));
        }
    }

    /**
     * Persistence nesne
     * 
     * @param em
     */
    @PersistenceContext
    public void setEntityManager(final EntityManager em) {
        this.em = em;
    }

    public DoctorDaoResult update(final Doctor doctor) {
        final DoctorDaoResult result = new DoctorDaoResult();
        em.merge(doctor);
        for (final DoctorNotificationSetting setting : doctor.getSettings()) {
            em.merge(setting);
        }
        result.setSuccess(true);
        result.setDoctor(doctor);
        return result;
    }

    public DoctorDaoResult getByApi(final String apiKey) {
        final DoctorDaoResult result = new DoctorDaoResult();
        final Query query = em.createQuery(JQL_BY_API);
        query.setParameter("apiKey", apiKey);
        final List<Doctor> resultList = query.getResultList();
        getSingleResult(result, resultList);
        return result;
    }

}