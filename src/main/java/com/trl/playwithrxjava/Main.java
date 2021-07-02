package com.trl.playwithrxjava;

import io.reactivex.Single;

public class Main {
    public static void main(String[] args) {
        //        Maybe<String> maybe = Maybe.empty();
//        Maybe<String> maybe = Maybe.just("hola");
//        Maybe<String> maybe = Maybe.error(new RuntimeException("ola k ase"));

//        Single<String> maybe = Single.just("hola");
//        Single<String> maybe = Single.just(null);
        Single<String> maybe = Single.error(new RuntimeException("ola k ase"));
        maybe.map(String::toUpperCase)
                .subscribe(
                        success -> System.out.println(">>>>>>>>>>>>>>> " + success),
                        throwable -> System.err.println(">>>>>>>>>>>>>>> " + throwable)
                );
    }
}
