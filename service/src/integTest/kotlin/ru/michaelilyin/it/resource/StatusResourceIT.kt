package ru.michaelilyin.it.resource

import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.HttpClientBuilder
import org.apache.http.util.EntityUtils
import org.jboss.arquillian.container.test.api.Deployment
import org.jboss.arquillian.container.test.api.RunAsClient
import org.jboss.arquillian.junit.Arquillian
import org.jboss.arquillian.test.api.ArquillianResource
import org.jboss.shrinkwrap.api.ShrinkWrap
import org.jboss.shrinkwrap.api.spec.WebArchive
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import ru.michaelilyin.Application
import ru.michaelilyin.it.resourceDeployment
import ru.michaelilyin.resource.StatusResource
import java.net.URL


/**
 * TODO: javadoc
 * Created by Michael Ilyin on 19.02.2017.
 */
@RunWith(Arquillian::class)
class StatusResourceIT {

    companion object {
        @JvmStatic
        @Deployment
        fun deployment(): WebArchive = resourceDeployment()
    }

    @Test
    @RunAsClient
    fun testGetStatus(@ArquillianResource base: URL) {
        val client = HttpClientBuilder.create().build()
        client.use {
            val request = HttpGet(base.toURI().resolve("api/status"))
            val response = client.execute(request)
            response.use {
                assertEquals(200, response.statusLine.statusCode)
                assertEquals("OK", EntityUtils.toString(response.entity))
            }
        }
    }
}
