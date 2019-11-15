package pl.mpas.git_examples.car.service;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalExample {

    static Optional<String> getFriendsNick() {
//        return Optional.ofNullable(null);
        return Optional.of("przemek");
    }

    public static void main(String[] args) {
        System.out.println(getFriendsNick());
        String nick = null;

        if (getFriendsNick().isPresent()) {
            nick = getFriendsNick().get();
        } else {
            System.out.println("Nic nie ma");
        }
        System.out.println(nick);

        Optional<String> maybeNick = getFriendsNick();
//        maybeNick.ifPresent(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//
//            }
//        });

        maybeNick.ifPresent(s -> {
            System.out.println("Nick: " + s);
        });
    }
}
