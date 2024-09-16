import java.util.Scanner;

public class Professor {
    private int id;
    private String curso;
    private String nome;
    private String sexo;
    private String DataNascimento;
    private String email;
    private String RG;
    private String CPF;
    private String Graduacao;
    private String PosGraduacao;
    private String Mestrado;
    public Professor() {

        id = 0;
        curso = new String();
        nome = new String();
        sexo = new String();
        DataNascimento  = new String();
        email = new String();
        RG = new String();
        CPF = new String();
        Graduacao = new String();
        PosGraduacao = new String();
        Mestrado = new String();

    }
    public Professor(int id, String curso, String nome, String sexo, String dataNascimento, String email, String rG,
            String cPF, String graduacao, String posGraduacao, String mestrado) {
        this.id = id;
        this.curso = curso;
        this.nome = nome;
        this.sexo = sexo;
        DataNascimento = dataNascimento;
        this.email = email;
        RG = rG;
        CPF = cPF;
        Graduacao = graduacao;
        PosGraduacao = posGraduacao;
        Mestrado = mestrado;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
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
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public String getGraduacao() {
        return Graduacao;
    }
    public void setGraduacao(String graduacao) {
        Graduacao = graduacao;
    }
    public String getPosGraduacao() {
        return PosGraduacao;
    }
    public void setPosGraduacao(String posGraduacao) {
        PosGraduacao = posGraduacao;
    }
    public String getMestrado() {
        return Mestrado;
    }
    public void setMestrado(String mestrado) {
        Mestrado = mestrado;
    }
    
    public void cadastrar(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digiten o ID:");
        id = entrada.nextInt();
        System.out.println("Digite o Curso:");
        curso = entrada.next();
        System.out.println("Digite o Nome do Professor:");
        nome = entrada.next();
        System.out.println("Digite o Sexo do Professor: ");
        sexo = entrada.next();
        System.out.println("Digite a Data de Nascimento:");
        DataNascimento = entrada.next();
        System.out.println("Digite o Email:");
        email =  entrada.next();
        System.out.println("Digite o RG:");
        RG = entrada.next();
        System.out.println("Digite o CPF:");
        CPF =  entrada.next();
        System.out.println("Digite a Graduação:");
        Graduacao =  entrada.next();
        System.out.println("Digite Pós Graduação:");
        PosGraduacao = entrada.next();
        System.out.println("Digite o Mestrado:");
        Mestrado = entrada.next();
    }
    public void mostrar(){
        System.out.println("ID:" + getId());
        System.out.println("Curso:" + getCurso());
        System.out.println("Nome:" + getNome());
        System.out.println("Sexo:" + getSexo());
        System.out.println("Data de Nacimento:" + getDataNascimento());
        System.out.println("Email:" + getEmail());
        System.out.println("RG:" + getRG());
        System.out.println("CPF:" + getCPF());
        System.out.println("Graduação:" + getGraduacao());
        System.out.println("Pós Graduação:" + getPosGraduacao());
        System.out.println("Mestrado:" + getMestrado());
        
    }
    
    
}