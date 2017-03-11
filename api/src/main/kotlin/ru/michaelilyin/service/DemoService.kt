package ru.michaelilyin.service

import ru.michaelilyin.domain.Demo
import javax.ejb.Local

/**
 * Created by micha on 11.03.2017.
 */
@Local
interface DemoService {
    fun getDemos(): Iterable<Demo>
}
