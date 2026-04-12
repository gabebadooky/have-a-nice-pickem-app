package com.haveanicepickem.app.maintenance;

import java.time.LocalDateTime;
import org.hibernate.annotations.ColumnDefault;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "maintenance", schema = "pickem")
public class MaintenanceEntity {
    // id           SERIAL          PRIMARY KEY,
	// flag         BOOLEAN         NOT NULL,
	// created_at   TIMESTAMP       NOT NULL

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(allocationSize = 1, name = "maintenance_seq", sequenceName = "maintenance_seq")
    private Long id;

    @Column(nullable = false)
    private boolean flag;

    @Column(nullable = false)
    @ColumnDefault("current_timestamp")
    private LocalDateTime createdAt;


    public boolean getFlag() {
        return this.flag;
    }

}
