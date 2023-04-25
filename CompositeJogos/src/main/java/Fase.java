public class Fase extends Conteudo {

    private int dificuldade;

    public Fase(String descricao, int dificuldade) {
        super(descricao);
        this.dificuldade = dificuldade;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getConteudo() {
        return "Fase: " + this.getDescricao() + " - dificuldade: " + this.dificuldade + "\n";
    }
}