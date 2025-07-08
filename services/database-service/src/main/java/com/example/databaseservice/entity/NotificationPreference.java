package com.example.databaseservice.entity;

import com.example.databaseservice.domain.CommunicationChannel;
import com.example.databaseservice.domain.NotificationType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(indexes = {
    @Index(name = "idx_user_id", columnList = "userId"),
    @Index(name = "idx_notification_type", columnList = "notificationType"),
    @Index(name = "idx_communication_channel", columnList = "communicationChannel")
})

    @Getter
    @Setter
public class NotificationPreference {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private int userId;

    @Column(nullable = false)
    private NotificationType notificationType;

    @Column(nullable = false)
    private CommunicationChannel communicationChannel;

    private int treshold;

    @Column(nullable = false)
    private boolean enabled;
}
