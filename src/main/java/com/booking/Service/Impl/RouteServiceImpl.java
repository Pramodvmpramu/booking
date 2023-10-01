package com.booking.Service.Impl;

import com.booking.Service.RouteService;
import com.booking.entities.Route;
import com.booking.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class RouteServiceImpl implements RouteService {

    @Autowired
    private RouteRepository routeRepository;

    @Override
    public Route createRoute(Route route) {

        route.setCreatedAt(new Date());
        route.setUpdatedAt(new Date());
        return routeRepository.save(route);
    }
}
