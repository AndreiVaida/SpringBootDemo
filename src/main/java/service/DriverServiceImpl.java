package service;

import domain.Driver;
import dto.DriverDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.DriverRepository;

@Service
public class DriverServiceImpl implements DriverService {
    private final DriverRepository driverRepository;

    @Autowired
    public DriverServiceImpl(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    @Override
    public DriverDto createDriver(DriverDto driverDto) {
        final Driver driver = new Driver();
        driver.setCar(driverDto.getCar());
        driverRepository.save(driver);

        return new DriverDto(driver.getId(), driver.getCar());
    }
}
