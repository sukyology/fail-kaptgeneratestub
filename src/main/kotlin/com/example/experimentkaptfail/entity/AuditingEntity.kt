package com.example.experimentkaptfail.entity

import jakarta.persistence.MappedSuperclass
import java.time.OffsetDateTime

@MappedSuperclass
abstract class AuditingEntity{
    val createdAt: OffsetDateTime = OffsetDateTime.now()
    var lastModifiedAt: OffsetDateTime = createdAt
}