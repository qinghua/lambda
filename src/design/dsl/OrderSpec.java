package design.dsl;

import static design.dsl.BddTest.describe;

public class OrderSpec {{
    describe("订单模块", it -> {
        it.should("增加订单", expect -> {
            expect.that(1 + 1 == 2);
        });

        it.should("删除订单", expect -> {
            expect.that(1 + 1 == 3);
        });
    });
}}
