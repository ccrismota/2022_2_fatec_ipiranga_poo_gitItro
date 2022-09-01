public class Empregado{
    private String nome;
    private int idade;
    private int tipo;
    private double salario;
    private double comissao;
    private double bonus;

    public double calcularSalario(){
        if(tipo == 1)
        return salario;
        if(tipo == 2)
        return salario + salario * comissao;
        if(tipo == 3)
        return salario + bonus;
      return 0;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTipo() {
        return tipo;
    }

    public double getBonus() {
        return bonus;
    }

    public double getComissao() {
        return comissao;
    }

    public double getSalario() {
        return salario;
    }

    


    //NOTAS: 

    //O stado do objeto é constituido dos valores de suas variaveis, no caso de "p" o seu estado é energia=5, fome=5, sono=5;
    //Neste caso não foi encapsulado as variaveis para que se tenha acesso pq não quer que mude os valores inicias do jogo;

    //COMMIT É TORNAR A VERSÃO PERMANENT

    //UNTRACKED = SEM CONTROLE DE VERSÃO
    //O 'A' representa a passagem do untracked para o Tracked e o verde significa que está stadge;

    //Git add . => 
}