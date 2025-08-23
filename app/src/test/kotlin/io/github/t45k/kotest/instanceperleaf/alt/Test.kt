package io.github.t45k.kotest.instanceperleaf.alt

import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class Test : DescribeSpec({
    isolationMode = IsolationMode.InstancePerLeaf

    var count = 0

    describe("d1") {
        count++
        context("c1") {
            it("i1") {
                count shouldBe 1
            }
        }

        context("c2") {
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
