package io.github.t45k.kotest.instanceperleaf.alt

import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.DescribeSpec

class Test : DescribeSpec({
    isolationMode = IsolationMode.InstancePerLeaf

    describe("d1") {
        println("d1")

        context("c1") {
            println("c1")

            it("i1") {
                println("i1")
            }
        }

        context("c2") {
            println("c2")

            it("i2") {
                println("i2")
            }
        }
    }
})

/*
results of Kotest 6.0.1
d1
c1
i1
c2
d1
c2
i2
 */

/*
results of Kotest 6.0.0
d1
c1
d1
c1
i1
c2
d1
c2
i2
 */

/*
results of Kotest 5.9.x
d1
c1
i1
d1
c2
i2
 */
