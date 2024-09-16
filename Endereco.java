import java.util.Scanner;

public class Endereco {
    private int id;
    private String Rua;
    private int numero;
    private String Bairro;
    private String Cidade;
    private String Estado;
    private String CEP;
    private String complemento;
    public Endereco() {

        id = 0;
        Rua = new String();
        numero = 0;
        Bairro = new String();
        Cidade = new String();
        Estado = new String();
        CEP = new String();
        complemento = new String();

    }
    public Endereco(int id, String rua, int numero, String bairro, String cidade, String estado, String cEP,
            String complemento) {
        this.id = id;
        Rua = rua;
        this.numero = numero;
        Bairro = bairro;
        Cidade = cidade;
        Estado = estado;
        CEP = cEP;
        this.complemento = complemento;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getRua() {
        return Rua;
    }
    public void setRua(String rua) {
        Rua = rua;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getBairro() {
        return Bairro;
    }
    public void setBairro(String bairro) {
        Bairro = bairro;
    }
    public String getCidade() {
        return Cidade;
    }
    public void setCidade(String cidade) {
        Cidade = cidade;
    }
    public String getEstado() {
        return Estado;
    }
    public void setEstado(String estado) {
        Estado = estado;
    }
    public String getCEP() {
        return CEP;
    }
    public void setCEP(String cEP) {
        CEP = cEP;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public void cadastrar(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o ID:");
        id = entrada.nextInt();
        System.out.println("Digite o Nome da Rua:");
        Rua = entrada.next();
        System.out.println("Digite o Número da Casa:");
        numero = entrada.nextInt();
        System.out.println("Digite o Bairro:");
        Bairro = entrada.next();
        System.out.println("Digite a Cidade:");
        Cidade = entrada.next();
        System.out.println("Digite o Estado:");
        Estado = entrada.next();
        System.out.println("Digite o CEP da Rua:");
        CEP = entrada.next();
        System.out.println("Digite o Complemento:");
        complemento = entrada.next();
 }
    public void mostrar(){
        System.out.println("ID:" + getId());
        System.out.println("Rua:" + getRua());
        System.out.println("Número:" + getNumero());
        System.out.println("Bairro:" + getBairro());
        System.out.println("Cidade:" + getCidade());
        System.out.println("Estado:" + getEstado());
        System.out.println("CEP:" + getCEP());
        System.out.println("Complemento:" +getComplemento());
        


    }


}
