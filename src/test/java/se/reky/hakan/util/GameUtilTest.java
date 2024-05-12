package se.reky.hakan.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.reky.hakan.GameException;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class GameUtilTest {

    @Test
    public void testToLowerCaseButFirstLetterCapitalizedThrowsExceptionOnNullInput() {

        GameUtil gameUtil = new GameUtil();

        Exception exception = assertThrows(GameException.class, () -> {
            gameUtil.toLowerCaseButFirstLetterCapitalized(null);
        });

        Assertions.assertEquals("Input can not be null", exception.getMessage());
    }
}