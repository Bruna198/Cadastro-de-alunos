
import java.util.Scanner;

public class Disciplina {
    private int id;
    private String nome;
    private String CargaHoraria;
    private String ConteudoProgramatico;
    public Disciplina() {

        id = 0;
        nome = new String();
        CargaHoraria = new String();
        ConteudoProgramatico = new String();
    }
    public Disciplina(int id, String nome, String cargaHoraria, String conteudoProgramatico) {
        this.id = id;
        this.nome = nome;
        CargaHoraria = cargaHoraria;
        ConteudoProgramatico = conteudoProgramatico;
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
    public String getCargaHoraria() {
        return CargaHoraria;
    }
    public void setCargaHoraria(String cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }
    public String getConteudoProgramatico() {
        return ConteudoProgramatico;
    }
    public void setConteudoProgramatico(String conteudoProgramatico) {
        ConteudoProgramatico = conteudoProgramatico;
    }

    public void cadastrar(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o ID da Disciplina:");
        id = entrada.nextInt();
        System.out.println("Digite o Nome da Disciplina:");
        nome =  entrada.next();
        System.out.println("Digite a Carga Horária da Disciplina:");
        CargaHoraria = entrada.next();
        System.out.println("Digite o Conteúdo Programático da Disciplina:");
        ConteudoProgramatico = entrada.next();

  }
    public void mostrar(){
        System.out.println("ID:" + getId());
        System.out.println("Nome:" + getNome());
        System.out.println("Carga Horária:" + getCargaHoraria());
        System.out.println("Conteúdo Programático:" + getConteudoProgramatico());
        
    }
}