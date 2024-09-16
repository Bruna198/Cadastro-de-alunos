import java.util.Scanner;

public class Curso {
    private int id;
    private String nome;
    private String duracao;
    private String periodo;
    private String turma;
    public Curso() {

        id = 0;
        nome = new String();
        duracao = new String();
        periodo = new String();
        turma = new String();
    }
    public Curso(int id, String nome, String duracao, String periodo, String turma) {
        this.id = id;
        this.nome = nome;
        this.duracao = duracao;
        this.periodo = periodo;
        this.turma = turma;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDuracao() {
        return duracao;
    }
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
    public String getPeriodo() {
        return periodo;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }
    
    public void cadastrar(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o ID:");
        id = entrada.nextInt();
        System.out.println("Digite o Nome do Curso:");
        nome = entrada.next();
        System.out.println("Digite a Duração do Curso:");
        duracao = entrada.next();
        System.out.println("Digite o Período do Curso:");
        periodo = entrada.next();
        System.out.println("Digite a Turma do Curso:");
        turma =  entrada.next();

    }
    public void mostrar(){
        System.out.println("ID:" + getId());
        System.out.println("Nome:" + getNome());
        System.out.println("Duração:" + getDuracao());
        System.out.println("Período:" + getPeriodo());
        System.out.println("Turma:" + getTurma());
    }
    
}
