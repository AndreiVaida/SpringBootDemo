package controller;

import dto.DriverDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import service.DriverService;

@Controller
@RequestMapping(path = "/")
public class DriverController extends ExceptionHandlerController {
    private final DriverService driverService;

    @Autowired
    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return new ResponseEntity<>("Hello world !", HttpStatus.OK);
    }

    @PostMapping(path = "/driver")
    public ResponseEntity<DriverDto> createDriver(@RequestBody DriverDto driverDto) {
        final DriverDto createdDriver = driverService.createDriver(driverDto);

        return new ResponseEntity<>(createdDriver, HttpStatus.CREATED);
    }
}
