import java.util.Random;

public class Partida {
    private Equipe equipe1;
    private Equipe equipe2;
    private int numGolsEquipe1;
    private int numGolsEquipe2;

    public int getNumGolsEquipe1() {
        return numGolsEquipe1;
    }

    public void setNumGolsEquipe1(int numGolsEquipe1) {
        this.numGolsEquipe1 = numGolsEquipe1;
    }

    public int getNumGolsEquipe2() {
        return numGolsEquipe2;
    }

    public void setNumGolsEquipe2(int numGolsEquipe2) {
        this.numGolsEquipe2 = numGolsEquipe2;
    }

    public Partida(Equipe equipe1, Equipe equipe2) {
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
    }

    public Equipe getEquipe1() {
        return equipe1;
    }

    public void setEquipe1(Equipe equipe1) {
        this.equipe1 = equipe1;
    }

    public Equipe getEquipe2() {
        return equipe2;
    }

    public void setEquipe2(Equipe equipe2) {
        this.equipe2 = equipe2;
    }
    
    public int resultado() {
        Random random = new Random();
        int golsEquipe1 = 0;
        int golsEquipe2 = 0;
        int numero = random.nextInt(10);
        int pontosTotais1 = (equipe1.getAtaque() * 2) + (equipe1.getDefesa() * 3) + (equipe1.getMeioCampo() * 5);
        int pontosTotais2 = (equipe2.getAtaque() * 2) + (equipe2.getDefesa() * 3) + (equipe2.getMeioCampo() * 5);
        if (pontosTotais1 > pontosTotais2) {
            if (numero < 7) {
                golsEquipe1 = random.nextInt(4) + 2;
                golsEquipe2 = random.nextInt(golsEquipe1 - 1);
                this.numGolsEquipe1 = golsEquipe1;
                this.numGolsEquipe2 = golsEquipe2;
                return 1;
            }
            else if (numero >= 7 && numero < 9) {
                golsEquipe1 = golsEquipe2 = random.nextInt(3);
                this.numGolsEquipe1 = golsEquipe1;
                this.numGolsEquipe2 = golsEquipe2;
                System.out.println();
                return 0;
            }
            else {
                golsEquipe2 = random.nextInt(4) + 2;
                golsEquipe1 = random.nextInt(golsEquipe2 - 1);
                this.numGolsEquipe1 = golsEquipe1;
                this.numGolsEquipe2 = golsEquipe2;
                return 2;
            }
        }
        else if (pontosTotais1 == pontosTotais2) {
            if (numero < 7) {
                golsEquipe1 = golsEquipe2 = random.nextInt(3);
                this.numGolsEquipe1 = golsEquipe1;
                this.numGolsEquipe2 = golsEquipe2;
                return 0;
            }
            else if (numero == 7 || numero == 8) {
                golsEquipe1 = random.nextInt(4) + 2;
                golsEquipe2 = random.nextInt(golsEquipe1 - 1);
                this.numGolsEquipe1 = golsEquipe1;
                this.numGolsEquipe2 = golsEquipe2;
                return 1;
            }
            else {
                golsEquipe2 = random.nextInt(4) + 2;
                golsEquipe1 = random.nextInt(golsEquipe2 - 1);
                this.numGolsEquipe1 = golsEquipe1;
                this.numGolsEquipe2 = golsEquipe2;
                return 2;
            }
        }
        else {
            if (numero < 7) {
                golsEquipe2 = random.nextInt(4) + 2;
                golsEquipe1 = random.nextInt(golsEquipe2 - 1);
                this.numGolsEquipe1 = golsEquipe1;
                this.numGolsEquipe2 = golsEquipe2;
                return 2;
            }
            else if (numero >= 7 && numero < 9) {
                golsEquipe1 = golsEquipe2 = random.nextInt(3);
                this.numGolsEquipe1 = golsEquipe1;
                this.numGolsEquipe2 = golsEquipe2;
                return 0;
            }
            else {
                golsEquipe1 = random.nextInt(4) + 2;
                golsEquipe2 = random.nextInt(golsEquipe1 - 1);
                this.numGolsEquipe1 = golsEquipe1;
                this.numGolsEquipe2 = golsEquipe2;
                return 1;
            }
        }
    }
    
    @Override
    public String toString() {
        return equipe1.getNome() + " " + getNumGolsEquipe1() + "x" + getNumGolsEquipe2() 
                + " " + equipe2.getNome();
    }
}
