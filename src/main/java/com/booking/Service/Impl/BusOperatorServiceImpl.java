package com.booking.Service.Impl;

import com.booking.Service.BusOperatorService;
import com.booking.entities.BusOperator;
import com.booking.repository.BusOperatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class BusOperatorServiceImpl implements BusOperatorService {
    @Autowired
    private BusOperatorRepository busOperatorRepository;
    @Override
    public BusOperator createBusOperator(BusOperator busOperator) {
        busOperator.setCreatedAt(new Date());
        busOperator.setUpdatedAt(new Date());
        return busOperatorRepository.save(busOperator);
    }
}