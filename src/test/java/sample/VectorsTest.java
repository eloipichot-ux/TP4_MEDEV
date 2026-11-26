package sample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VectorsTest {

    @Test
    void composantesPositives() {
        assertEquals(32,
            Vectors.scalarMultiplication(new int[] {1, 2, 3}, new int[] {4, 5, 6}));
    }

    @Test
    void composantesNegatives() {
        assertEquals(-32,
            Vectors.scalarMultiplication(new int[] {-1, -2, -3}, new int[] {4, 5, 6}));
    }

    @Test
    void vecteursOrthogonaux() {
        assertEquals(0,
            Vectors.scalarMultiplication(new int[] {1, 2, 3}, new int[] {-2, 1, 0}));
    }

    @Test
    void tableauxVidesProduitScalaire() {
        assertEquals(0,
            Vectors.scalarMultiplication(new int[] {}, new int[] {}));
    }

    @Test
    void uneSeuleComposante() {
        assertEquals(42,
            Vectors.scalarMultiplication(new int[] {7}, new int[] {6}));
    }

    @Test
    void longueursIncompatibles() {
        assertThrows(IllegalArgumentException.class,
            () -> Vectors.scalarMultiplication(new int[] {1, 2}, new int[] {1, 2, 3}));
    }

    @Test
    void produitScalairePremierArgumentNul() {
        assertThrows(IllegalArgumentException.class,
            () -> Vectors.scalarMultiplication(null, new int[] {1, 2}));
    }

    @Test
    void produitScalaireSecondArgumentNul() {
        assertThrows(IllegalArgumentException.class,
            () -> Vectors.scalarMultiplication(new int[] {1, 2}, null));
    }

    @Test
    void tableauxDistinctsMemeContenu() {
        int[] gauche = {5, 6, 7};
        int[] droite = {5, 6, 7};

        assertTrue(Vectors.equal(gauche, droite));
    }

    @Test
    void tableauxVidesEgaux() {
        assertTrue(Vectors.equal(new int[] {}, new int[] {}));
    }

    @Test
    void longueursDifferentes() {
        assertFalse(Vectors.equal(new int[] {1, 2}, new int[] {1, 2, 3}));
    }

    @Test
    void differenceAuDebut() {
        assertFalse(Vectors.equal(new int[] {9, 2, 3}, new int[] {1, 2, 3}));
    }

    @Test
    void differenceAuMilieu() {
        assertFalse(Vectors.equal(new int[] {1, 9, 3}, new int[] {1, 2, 3}));
    }

    @Test
    void differenceALaFin() {
        assertFalse(Vectors.equal(new int[] {1, 2, 9}, new int[] {1, 2, 3}));
    }

    @Test
    void egalitePremierArgumentNul() {
        assertThrows(IllegalArgumentException.class,
            () -> Vectors.equal(null, new int[] {1, 2}));
    }

    @Test
    void egaliteSecondArgumentNul() {
        assertThrows(IllegalArgumentException.class,
            () -> Vectors.equal(new int[] {1, 2}, null));
    }
}
