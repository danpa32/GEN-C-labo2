package ch.heigvd.dp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// This is a test class
public class DeuxEntiersTest {
    @Test
    void divise() {
        DeuxEntiers septTrois = new DeuxEntiers(7,3);
        assertEquals(2,septTrois.divise());
    }

    @Test
    void modulo() {
        DeuxEntiers moduloTest = new DeuxEntiers(7, 3);
        assertEquals(0, moduloTest.modulo());
    }
}
