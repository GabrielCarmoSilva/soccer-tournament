public class Equipe {
    private String nome;
    private int ataque;
    private int meioCampo;
    private int defesa;
    private Integer numPontos;
    private int saldoGols;

    public int getNumPontos() {
        return numPontos;
    }

    public void setNumPontos(int numPontos) {
        this.numPontos = numPontos;
    }

    public int getSaldoGols() {
        return saldoGols;
    }

    public void setSaldoGols(int saldoGols) {
        this.saldoGols = saldoGols;
    }

    public Equipe(String nome, int ataque, int meio_campo, int defesa) {
        this.nome = nome;
        this.ataque = ataque;
        this.meioCampo = meio_campo;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getMeioCampo() {
        return meioCampo;
    }

    public void setMeioCampo(int meio_campo) {
        this.meioCampo = meio_campo;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    } 
}
