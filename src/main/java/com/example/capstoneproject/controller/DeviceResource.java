package com.example.capstoneproject.controller;

import com.example.capstoneproject.model.Device;
import com.example.capstoneproject.model.Employee;
import com.example.capstoneproject.service.DeviceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@Transactional
@RequestMapping("/device")
public class DeviceResource {
    private final DeviceService deviceService;

    public DeviceResource(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Device>> getAllDevices (){
        List<Device> devices = deviceService.findAllDevices();
        return new ResponseEntity<>(devices, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Device> getEmployeeById (@PathVariable("id") Integer id){
        Device device = deviceService.findDeviceById(id);
        return new ResponseEntity<>(device, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Device> addEmployee(@RequestBody Device device){
        Device newDevice = deviceService.addDevice(device);
        return new ResponseEntity<>(newDevice, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Device> updateEmployee(@RequestBody Device device){
        Device updateDevice = deviceService.updateDevice(device);
        return new ResponseEntity<>(updateDevice, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> updateEmployee(@PathVariable("id") Integer id){
        deviceService.deleteDevice(id);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
