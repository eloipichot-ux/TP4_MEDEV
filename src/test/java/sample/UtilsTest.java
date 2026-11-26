package sample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UtilsTest {
    @Test
    void concateneSansAjouterDeSeparateur() {
        String[] mots = {"Hello", ", ", "world", "!"};

        assertEquals("Hello, world!", Utils.concatWords(mots));
    }

    @ParameterizedTest
    @CsvSource({
    "1, 1",
    "2, 2",
    "5, 120",
    "20, 2432902008176640000"
    })
    void factorielleDeValeursConnues(
    int entree, String attendu) {
    assertEquals(
    attendu,
    Utils.computeFactorial(entree)
    );}

    @Test
    void factorielleDeZeroVautUn() {
    assertEquals("1", Utils.computeFactorial(0));}

    @Test
    void factorielleRefuseUnEntierNegatif() {
        assertThrows(IllegalArgumentException.class,
            () -> Utils.computeFactorial(-5));
    }
}