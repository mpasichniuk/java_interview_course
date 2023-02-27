package lesson3;

public class Game {

        public static void main(String[] args) {
            final var numberOfPlays = 20;
            new Thread(() -> play("Ping", numberOfPlays)).start();
            new Thread(() -> play("Pong", numberOfPlays)).start();
        }

        private static synchronized void play(String name, int numberOfPlays) {
            while (true) {
                System.out.println(name);
                try {
                    Game.class.notify();
                    if (--numberOfPlays == 0) {
                        break;
                    } else {
                       Game.class.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

