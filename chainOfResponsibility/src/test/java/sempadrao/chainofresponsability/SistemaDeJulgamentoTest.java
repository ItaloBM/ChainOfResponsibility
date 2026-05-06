package sempadrao.chainofresponsability;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SistemaDeJulgamentoTest {

    @Test
    void deveJulgarFaltasComVariosIfs() {
        SistemaDeJulgamento sistema = new SistemaDeJulgamento();

        // Falta leve
        assertEquals("Juiz de campo aplicou cartão (Amarelo/Advertência).", sistema.julgarInfracao(1));

        // Agressão gravíssima
        assertEquals("Tribunal Desportivo suspendeu o jogador por vários jogos.", sistema.julgarInfracao(5));
    }
}