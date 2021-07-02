package com.trl.playwithrxjava;

import io.reactivex.Single;
import org.junit.jupiter.api.Test;

public class SingleTest {
    @Test
    void single_1() {
        Single<String> single = Single.just("hola");

        single.map(String::toUpperCase)
                .subscribe(
                        success -> System.out.println(">>>>>>>>>>>>>>> " + success),
                        throwable -> System.err.println(">>>>>>>>>>>>>>> " + throwable)
                );
    }

    @Test
    void single_2() {
        Single<String> single = Single.just(null);

        single.map(String::toUpperCase)
                .subscribe(
                        success -> System.out.println(">>>>>>>>>>>>>>> " + success),
                        throwable -> System.err.println(">>>>>>>>>>>>>>> " + throwable)
                );
    }

    @Test
    void single_3() {
        Single<String> maybe = Single.error(new RuntimeException("ola k ase"));

        maybe.map(String::toUpperCase)
                .subscribe(
                        success -> System.out.println(">>>>>>>>>>>>>>> " + success),
                        throwable -> System.err.println(">>>>>>>>>>>>>>> " + throwable)
                );
    }

}
