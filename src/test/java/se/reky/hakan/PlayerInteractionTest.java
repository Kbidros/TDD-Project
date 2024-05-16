package se.reky.hakan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import se.reky.hakan.model.Player;

import java.util.Scanner;

public class PlayerInteractionTest {

    private Player player;

    @BeforeEach
    public void setUp() {
        player = new Player();
        player.setHp(80);
    }

    private PlayerInteraction createPlayerInteraction(String dataForScanner) {
        Scanner scanner = new Scanner(dataForScanner);
        IOHandler ioHandler = new IOHandler(scanner);
        return new SimplePlayerInteraction(ioHandler);
    }


    @Test
    public void testPlayerSetup() {
        String expectedName = "Kristian";
        PlayerInteraction playerInteraction = createPlayerInteraction(expectedName);

        playerInteraction.setupPlayer(player);

        Assertions.assertEquals(expectedName, player.getName());
    }

    @Test
    public void testUpdatePlayerHealth() {
        PlayerInteraction playerInteraction = createPlayerInteraction("");

        int initialHealth = player.getHp();
        int healthChange = -55;
        playerInteraction.updatePlayerHealth(player, healthChange);

        int expectedHealth = initialHealth + healthChange;
        Assertions.assertEquals(expectedHealth, player.getHp());
    }

    @Test
    void testingGithubActions() {
        Assertions.assertEquals(5,3);
    }
}