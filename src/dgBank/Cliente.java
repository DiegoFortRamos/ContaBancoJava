package dgBank;

public class Cliente {
    private String nome;
    private String endereco;
    private String cpf;
    private String profissao;
    private int anoNascimento;


    public void mostraDadosCliente(){
        System.out.printf("Nome : %s \nEndereco :  \nCpf : \nProfissão :  \nAno de Nascimento   "
                ,getNome(), getEndereco(),getCpf(),getProfissao(),getAnoNascimento());
    }


    public String getNome(){
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public String getCpf(){
        return cpf;
    }

    public String getProfissao(){
        return profissao;
    }

    public  int getAnoNascimento(){
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

    public  void setCpf(){
        this.cpf = cpf;
    }

    public  void setAnoNascimento(){
        this.anoNascimento = anoNascimento;
    }
}
