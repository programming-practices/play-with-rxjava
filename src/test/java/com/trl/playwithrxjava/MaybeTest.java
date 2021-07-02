package com.trl.playwithrxjava;

import io.reactivex.Maybe;
import org.junit.jupiter.api.Test;

class MaybeTest {

    @Test
    void maybe_1() {
        Maybe<String> maybe = Maybe.empty();

        maybe.map(String::toUpperCase)
                .subscribe(
                        success -> System.out.println(">>>>>>>>>>>>>>> " + success),
                        throwable -> System.err.println(">>>>>>>>>>>>>>> " + throwable),
                        () -> System.out.println(">>>>>>>>>>>>>>> Complete")
                );
    }

    @Test
    void maybe_2() {
        Maybe<String> maybe = Maybe.just("hola");

        maybe.map(String::toUpperCase)
                .subscribe(
                        success -> System.out.println(">>>>>>>>>>>>>>> " + success),
                        throwable -> System.err.println(">>>>>>>>>>>>>>> " + throwable),
                        () -> System.out.println(">>>>>>>>>>>>>>> Complete")
                );
    }

    @Test
    void maybe_3() {
        Maybe<String> maybe = Maybe.just(null);

        maybe.map(String::toUpperCase)
                .subscribe(
                        success -> System.out.println(">>>>>>>>>>>>>>> " + success),
                        throwable -> System.err.println(">>>>>>>>>>>>>>> " + throwable),
                        () -> System.out.println(">>>>>>>>>>>>>>> Complete")
                );
    }

    @Test
    void maybe_4() {
        Maybe<String> maybe = Maybe.error(new RuntimeException("ola k ase"));

        maybe.map(String::toUpperCase)
                .subscribe(
                        success -> System.out.println(">>>>>>>>>>>>>>> " + success),
                        throwable -> System.err.println(">>>>>>>>>>>>>>> " + throwable),
                        () -> System.out.println(">>>>>>>>>>>>>>> Complete")
                );
    }

}