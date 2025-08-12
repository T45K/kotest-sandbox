package io.github.t45k.kotest.instanceperleaf.alt

import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.engine.runBlocking
import io.kotest.matchers.shouldBe

class Test : DescribeSpec({
    isolationMode = IsolationMode.InstancePerRoot

    var count = 0

    describe("d1") {
        context("c1") {
            count++

            it("i1") {
                count shouldBe 1
            }
        }

        context("c2") {
            count++

            it("i2") {
                count shouldBe 1
            }
        }
    }

    describe("d2") {
        it("i3") {
            count shouldBe 0
        }
    }
})

class Test2 : DescribeSpec({
    isolationMode = IsolationMode.InstancePerRoot

    var count = 0

    runBlocking {
        suspend {
            count++

            it("i1") {
                count shouldBe 1
            }
        }()

        suspend {
            count++

            it("i2") {
                count shouldBe 1
            }
        }()
    }

    describe("d2") {
        it("i3") {
            count shouldBe 0
        }
    }
})
