/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sample;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Eloip
 */
public class testTemporel {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS)
    void factorielleSeTermineSurUnePetiteEntree() {
    assertEquals(
    "3628800",
    Utils.computeFactorial(10)
    );
    }
}
