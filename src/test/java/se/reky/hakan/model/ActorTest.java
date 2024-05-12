package se.reky.hakan.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ActorTest {

    @Test
    public void testGuardAttacksGoblinAndHpReducesCorrectly() {
        Actor guard = new Guard("Guard", 20, 5);
        Actor goblin = new Goblin("Goblin", 15, 3);

        guard.attack(goblin);

        int expectedGoblinHp = 15-5;
        Assertions.assertEquals(expectedGoblinHp, goblin.getHp());
    }
}