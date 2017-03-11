package ru.michaelilyin.service

import ru.michaelilyin.domain.Demo
import ru.michaelilyin.repository.DemoRepository
import javax.ejb.Stateless
import javax.inject.Inject

/**
 * Created by micha on 25.02.2017.
 */
@Stateless
open class DemoServiceImpl : DemoService {

    @Inject
    private lateinit var demoRepository: DemoRepository

    override fun getDemos(): Iterable<Demo> {
        return demoRepository.getDemos()
    }

}
