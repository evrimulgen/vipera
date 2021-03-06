package info.ozkan.vipera.business.patient;

import info.ozkan.vipera.business.role.Role;
import info.ozkan.vipera.dao.patient.PatientDao;
import info.ozkan.vipera.entities.Doctor;
import info.ozkan.vipera.entities.Patient;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;

/**
 * Hasta CRUD işlemleri işletme katmanı sınıfı
 * 
 * @author Ömer Özkan
 * 
 */
@Named("patientManager")
public class PatientManagerImpl implements PatientManager {
    /**
     * Persistence katmanı nesnesi
     */
    @Inject
    private PatientDao patientDao;

    /**
     * Sisteme yeni bir hasta ekler
     */
    @Transactional
    @RolesAllowed(Role.ROLE_ADMIN)
    public PatientManagerResult add(final Patient patient) {
        return patientDao.add(patient);
    }

    @Transactional
    @RolesAllowed(Role.ROLE_ADMIN)
    public PatientManagerResult search(final PatientSearchFilter filter) {
        return patientDao.find(filter);
    }

    @Transactional
    @RolesAllowed(Role.ROLE_ADMIN)
    public PatientManagerResult getById(final Long id) {
        return patientDao.getById(id);
    }

    @Transactional
    @RolesAllowed({ Role.ROLE_ADMIN, Role.ROLE_DOCTOR, Role.ROLE_PATIENT })
    public PatientManagerResult update(final Patient patient) {
        return patientDao.update(patient);
    }

    /**
     * @return the patientDao
     */
    public PatientDao getPatientDao() {
        return patientDao;
    }

    /**
     * @param patientDao
     *            the patientDao to set
     */
    public void setPatientDao(final PatientDao patientDao) {
        this.patientDao = patientDao;
    }

    @Transactional
    @RolesAllowed(Role.ROLE_ADMIN)
    public PatientManagerResult delete(final Patient patient) {
        return patientDao.delete(patient);
    }

    @Transactional
    @RolesAllowed(Role.ROLE_DOCTOR)
    public PatientManagerResult search(final PatientSearchFilter filter,
            final Doctor doctor) {
        return patientDao.find(filter, doctor);
    }

    @Transactional
    @RolesAllowed(Role.ROLE_DOCTOR)
    public PatientManagerResult getById(final Long id, final Doctor doctor) {
        return patientDao.getById(id, doctor);
    }

}
