package ru.michaelilyin.it

import org.jboss.shrinkwrap.api.ShrinkWrap
import org.jboss.shrinkwrap.api.spec.WebArchive
import org.jboss.shrinkwrap.resolver.api.maven.Maven
import ru.michaelilyin.Application
import ru.michaelilyin.resource.StatusResource

/**
 * Created by micha on 25.02.2017.
 */
fun resourceDeployment(): WebArchive {
    return ShrinkWrap.create(WebArchive::class.java)
        .addPackages(true, "kotlin")
        .addPackages(true, "ru.michaelilyin")
        .deletePackages(true, "ru.michaelilyin.it")
        .deletePackages(true, "ru.michaelilyin.repository.impl")
        .addPackages(true, "ru.michaelilyin.it.stub")
}
