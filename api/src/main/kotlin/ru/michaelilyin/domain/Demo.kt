package ru.michaelilyin.domain

import javax.persistence.*

/**
 * TODO: javadoc
 * Created by Michael Ilyin on 19.02.2017.
 */
@Entity
@Table(name = "demo")
@NamedQuery(name = Demo.Query.selectAll, query = "select d from Demo d")
open class Demo(
        @Id
        @Column(name = "id")
        open var id: Long = 0,

        @Column(name = "name")
        open var name: String = ""
) {
        object Query {
                const val selectAll = "selectAll"
        }
}
