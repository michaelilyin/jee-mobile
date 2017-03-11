package ru.michaelilyin.repository.impl

import ru.michaelilyin.domain.Demo
import ru.michaelilyin.repository.DemoRepository
import javax.ejb.Stateless
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

/**
 * Created by micha on 25.02.2017.
 */
@Stateless
open class DemoRepositoryImpl : DemoRepository {

    @PersistenceContext
    private lateinit var entityManager: EntityManager

    override fun getDemos(): List<Demo> {
        return entityManager.createNamedQuery(Demo.Query.selectAll, Demo::class.java).resultList
    }

}
