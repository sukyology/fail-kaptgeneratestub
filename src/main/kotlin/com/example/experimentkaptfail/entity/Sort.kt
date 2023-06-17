package com.example.experimentkaptfail.entity

import com.example.experimentkaptfail.entity.QMember.member
import com.querydsl.core.types.dsl.ComparableExpression

enum class Sort(override val path: ComparableExpression<out Comparable<*>>) : Sorting {
    CREATED_AT(member.createdAt),
}



interface Sorting {
    val path: ComparableExpression<out Comparable<*>>
}
