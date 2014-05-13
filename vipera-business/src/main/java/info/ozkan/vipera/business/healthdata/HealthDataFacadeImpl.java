package info.ozkan.vipera.business.healthdata;

import info.ozkan.vipera.entities.HealthData;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * {@link HealthDataFacade} arayüzünün implementasyonu
 * 
 * @author Ömer Özkan
 * 
 */
@Named("healthDataFacade")
public class HealthDataFacadeImpl implements HealthDataFacade {
    /**
     * sağlık alanı servisi
     */
    @Inject
    private HealthDataService healthDataService;

    public HealthDataResult add(final HealthData healthData) {
        return healthDataService.add(healthData);
    }

}
