package io.github.t45k.kotest.foo

import io.kotest.core.spec.style.DescribeSpec

class Test1 : DescribeSpec({
    describe("d1") {
        it("i1") {
            println("foo")
        }
    }
})
