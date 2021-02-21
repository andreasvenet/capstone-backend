package com.example.capstoneproject.service;

import com.example.capstoneproject.model.Device;
import com.example.capstoneproject.repo.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {
    private final DeviceRepository deviceRepository;

    @Autowired
    public DeviceService(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    public Device addDevice(Device device){
        return this.deviceRepository.save(device);
    }

    public List<Device> findAllDevices(){
        return deviceRepository.findAll();
    }

    public Device updateDevice(Device device){
        return this.deviceRepository.save(device);
    }

    public Device findDeviceById(Integer id){
        return deviceRepository.findById(id).get();
    }

    public void deleteDevice(Integer id){
        deviceRepository.deleteDeviceById(id);
    }
}
