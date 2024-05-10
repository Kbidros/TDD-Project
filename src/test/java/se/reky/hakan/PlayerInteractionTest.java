package se.reky.hakan;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import se.reky.hakan.model.Player;

import java.util.Scanner;

public class PlayerInteractionTest {

    private Player player;

    @BeforeEach
    public void setUp() {
        player = new Player();
    }

    private PlayerInteraction createPlayerInteraction(String dataForScanner) {
        Scanner scanner = new Scanner(dataForScanner);

        return new PlayerInteraction() {
            @Override
            public void setupPlayer(Player player) {

            }

            @Override
            public void updatePlayerHealth(Player player, int hp) {

            }

            @Override
            public void greetPlayer(Player player) {
            }
        };
    }
    @Test
    public void testSomething() {

    }
}
