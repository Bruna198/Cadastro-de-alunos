import java.util.Scanner;

public class ProntuarioEletronico{
    private int id;
    private float nota;
    private int falta;
    private float media;
    private int frequencia;
    public ProntuarioEletronico() {
        id = 0;
        nota = 0;
        falta = 0;
        media = 0;
        frequencia = 0;

    }
    public ProntuarioEletronico(int id, float nota, int falta, float media, int frequencia) {
        this.id = id;
        this.nota = nota;
        this.falta = falta;
        this.media = media;
        this.frequencia = frequencia;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public float getNota() {
        return nota;
    }
    public void setNota(float nota) {
        this.nota = nota;
    }
    public int getFalta() {
        return falta;
    }
    public void setFalta(int falta) {
        this.falta = falta;
    }
    public float getMedia() {
        return media;
    }
    public void setMedia(float media) {
        this.media = media;
    }
    public int getFrequencia() {
        return frequencia;
    }
    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public void cadastrar(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o ID: ");
        id = entrada.nextInt();
        System.out.println("Digite a nota: ");
        nota = entrada.nextFloat();
        System.out.println("Digite o numero de faltas: ");
        falta = entrada.nextInt();
        System.out.println("Digite a média do Aluno:");
        media = entrada.nextFloat();
        System.out.println("Digite a frequência do Aluno: ");
        frequencia = entrada.nextInt();

}

    public void mostrar(){
        System.out.println("ID:" + getId());
        System.out.println("Nota:" + getNota());
        System.out.println("Faltas:" + getFalta());
        System.out.println("Média" + getMedia());
        System.out.println("Frequências:" + getFrequencia());
    }
}
