package service;

import dto.DriverDto;

public interface DriverService {
    /**
     * @param driverDto driver to be added
     * @return created driver
     */
    DriverDto createDriver(DriverDto driverDto);
}
