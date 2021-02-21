package com.example.capstoneproject.repo;

import com.example.capstoneproject.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Integer> {
    void deleteDeviceById(Integer id);
}
