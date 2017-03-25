package ru.michaelilyin.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * Created by micha on 24.03.2017.
 */
@Entity
@Table(name = "users")
open class User(
    @Id
    @Column(name = "id", nullable = false)
    open var id: Long = 0,

    @Column(name = "name", nullable = false)
    open var name: String = "",

    @Column(name = "email", nullable = false)
    open var email: String = ""
) {
}
