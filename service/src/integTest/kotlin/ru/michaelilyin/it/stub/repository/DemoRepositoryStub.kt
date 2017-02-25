package ru.michaelilyin.it.stub.repository

import ru.michaelilyin.Demo
import ru.michaelilyin.repository.DemoRepository
import javax.ejb.Stateless

/**
 * Created by micha on 25.02.2017.
 */
@Stateless
open class DemoRepositoryStub : DemoRepository {

    private val store = generateInitialData()

    private fun generateInitialData(): MutableMap<Long, Demo> {
        val data = mutableMapOf<Long, Demo>()
        data[1L] = Demo(1L, "first")
        data[2L] = Demo(2L, "second")
        return data
    }

    override fun getDemos(): List<Demo> {
        return store.values.toList()
    }

}
