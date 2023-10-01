package com.booking.repository;

import com.booking.entities.UserOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserOfferRepository extends JpaRepository<UserOffer, Long> {
}


