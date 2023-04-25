import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JogoTest {

    @Test
    void deveRetornarEnredoJogo() {
        Nivel nivel1 = new Nivel("Floresta");

        Nivel nivel2 = new Nivel("Caverna");
        Fase fase21 = new Fase("Puzzle", 3);
        nivel2.addConteudo(fase21);

        Nivel nivel3 = new Nivel("Castelo");
        Fase fase31 = new Fase("Batalha contra o dragão", 5);
        Fase fase32 = new Fase("Escape da torre", 4);
        nivel3.addConteudo(fase31);
        nivel3.addConteudo(fase32);

        Nivel enredo = new Nivel("Jornada do Herói");
        enredo.addConteudo(nivel1);
        enredo.addConteudo(nivel2);
        enredo.addConteudo(nivel3);

        Jogo jogo = new Jogo();
        jogo.setEnredo(enredo);

        assertEquals("Nível: Jornada do Herói\n" +
                "Nível: Floresta\n" +
                "Nível: Caverna\n" +
                "Fase: Puzzle - dificuldade: 3\n" +
                "Nível: Castelo\n" +
                "Fase: Batalha contra o dragão - dificuldade: 5\n" +
                "Fase: Escape da torre - dificuldade: 4\n", jogo.getEnredo());
    }

    @Test
    void deveRetornarExecacaoJogoSemEnredo() {
        try {
            Jogo jogo = new Jogo();
            jogo.getEnredo();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Jogo sem enredo", e.getMessage());
        }
    }
}