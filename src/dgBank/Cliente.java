package dgBank;

public class Cliente {
    private String nome;
    private String endereco;
    private String cpf;
    private String profissao;
    private int anoNascimento;


    public void mostraDadosCliente(){
        System.out.println("\n=======================");
        System.out.println("     Dados Cliente    ");
        System.out.println("=======================");
        getNome();
        getEndereco();
        getCpf();
        getProfissao();
        getAnoNascimento();

    }


    public String getNome(){
        System.out.printf("\nNome : %s\n",nome);
        return nome;
    }

    public String getEndereco(){
        System.out.printf("\nEndereco : %s\n",endereco);
        return endereco;
    }

    public String getCpf(){
        System.out.printf("\nCpf : %s\n",cpf);
        return cpf;
    }

    public String getProfissao(){
        System.out.printf("\nProfissão : %s\n",profissao);
        return profissao;
    }

    public  int getAnoNascimento(){
        System.out.printf("\nAno de Nascimento : %s\n\n",anoNascimento);
        return anoNascimento;
    }



    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setProfissao(String profissao){
        this.profissao = profissao;
    }

    public  void setCpf(String cpf){
        this.cpf = cpf;
    }

    public  void setAnoNascimento(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }
}
