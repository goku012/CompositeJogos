public class Jogo {

    private Conteudo enredo;

    public void setEnredo(Conteudo enredo) {
        this.enredo = enredo;
    }

    public String getEnredo() {
        if (this.enredo == null) {
            throw new NullPointerException("Jogo sem enredo");
        }
        return this.enredo.getConteudo();
    }
}