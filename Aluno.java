import java.util.Scanner;

public class Aluno {
    private int id;
    private int RA;
    private String CPF;
    private String nome;
    private String sexo;
    private String DataNascimento;
    private String email;
    private String RG;
    public Aluno() {

        id =  0;
        RA = 0;
        CPF = new String();
        nome = new String();
        sexo = new String();
        DataNascimento = new String();
        email = new String();
        RG = new String();
    }
    public Aluno(int id, int rA, String cPF, String nome, String sexo, String dataNascimento, String email, String rG) {
        this.id = id;
        RA = rA;
        CPF = cPF;
        this.nome = nome;
        this.sexo = sexo;
        DataNascimento = dataNascimento;
        this.email = email;
        RG = rG;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getRA() {
        return RA;
    }
    public void setRA(int rA) {
        RA = rA;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getDataNascimento() {
        return DataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        DataNascimento = dataNascimento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRG() {
        return RG;
    }
    public void setRG(String rG) {
        RG = rG;
    }

    public void cadastrar(){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o ID do Aluno:");
        id = entrada.nextInt();
        System.out.println("Digite o RA do Aluno:");
        RA =  entrada.nextInt();
        System.out.println("Digite o CPF do Aluno:");
        CPF = entrada.next();
        System.out.println("Digite o Nome do Aluno:");
        nome = entrada.next();
        System.out.println("Digite o Sexo do Aluno:");
        sexo = entrada.next();
        System.out.println("Digite a Data de Nascimento do Aluno:");
        DataNascimento = entrada.next();
        System.out.println("Digite o Email do Aluno:");
        email = entrada.next();
        System.out.println("Digite o RG do Aluno:");
        RG = entrada.next();


    }
    public void mostrar(){
        System.out.println("ID:" + getId());
        System.out.println("RA:" + getRA());
        System.out.println("CPF:" + getCPF());
        System.out.println("Nome:" + getNome());
        System.out.println("Sexo:" + getSexo());
        System.out.println("Data de Nascimento:" + getDataNascimento());
        System.out.println("Email:" + getEmail() );
        System.out.println("RG:" + getRG());

    }
    
}