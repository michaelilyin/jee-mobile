package ru.michaelilyin.service

import ru.michaelilyin.Demo
import ru.michaelilyin.repository.DemoRepository
import javax.ejb.Stateless
import javax.inject.Inject

/**
 * Created by micha on 25.02.2017.
 */
interface DemoService {
    fun getDemos(): Iterable<Demo>
}

@Stateless
open class DemoServiceImpl : DemoService {

    @Inject
    private lateinit var demoRepository: DemoRepository

    override fun getDemos(): Iterable<Demo> {
        return demoRepository.getDemos()
    }

}
