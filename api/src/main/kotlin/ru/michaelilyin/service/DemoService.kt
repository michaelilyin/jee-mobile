package ru.michaelilyin.service

import ru.michaelilyin.domain.Demo
import javax.ejb.Remote

/**
 * Created by micha on 11.03.2017.
 */
@Remote
interface DemoService {
    fun getDemos(): Iterable<Demo>
}
