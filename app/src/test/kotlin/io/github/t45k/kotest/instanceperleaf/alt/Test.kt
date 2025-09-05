package io.github.t45k.kotest.instanceperleaf.alt

import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

private var count = 0

class Test : DescribeSpec({
    isolationMode = IsolationMode.InstancePerLeaf

    beforeSpec {
        count++
    }

    describe("d1") {
        context("c1") {
            it("i1") {
                count shouldBe 1
            }
        }

        context("c2") {
            it("i2") {
                count shouldBe 2
            }
        }
    }
})
