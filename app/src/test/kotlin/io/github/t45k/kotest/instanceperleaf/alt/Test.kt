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

    describe("d2") {
        println("d2")

        it("i3") {
            println("i3")
        }
    }
})
