package com.booking.Service.Impl;


import com.booking.Service.BusService;
import com.booking.entities.Bus;
import com.booking.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class BusServiceImpl implements BusService {
    @Autowired
    private BusRepository busRepository;

    @Override
    public Bus createBus(Bus bus) {
        bus.setCreatedAt(new Date());
        bus.setUpdatedAt(new Date());

        return busRepository.save(bus);
    }
}