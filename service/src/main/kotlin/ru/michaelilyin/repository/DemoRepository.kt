package ru.michaelilyin.repository

import ru.michaelilyin.Demo
import javax.ejb.Local
import javax.ejb.Stateless
import javax.enterprise.inject.Alternative
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

/**
 * Created by micha on 25.02.2017.
 */
@Local
interface DemoRepository {
    fun getDemos(): List<Demo>
}
