package com.pick.nalsoom.Repository.Notification;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pick.nalsoom.Domain.Notification.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

    
}