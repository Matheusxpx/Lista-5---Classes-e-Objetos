
import java.util.Scanner;

public class Pessoa {

  
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private double imc;


    public Pessoa(String nome, String sobrenome, int idade, double altura, double peso) {

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    // MÉTODO PARA CALCULAR IMC  📓
    public void calculaIMC() {

        imc = peso / (altura * altura);
    }

    // MÉTODO PARA INFORMA OBESIDADE 🍔
    public String informaObesidade() {

        if (imc < 18.5) {

            return "Abaixo do peso";

        } else if (imc >= 18.5 && imc < 25) {

            return "Peso normal";

        } else if (imc >= 25 && imc < 30) {

            return "Sobrepeso";

        } else if (imc >= 30 && imc < 35) {

            return "Obesidade Grau 1";

        } else if (imc >= 35 && imc < 40) {

            return "Obesidade Grau 2";

        } else {

            return "Obesidade Grau 3";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = sc.nextLine();

        System.out.println("Digite o sobrenome:");
        String sobrenome = sc.nextLine();

        System.out.println("Digite a idade:");
        int idade = sc.nextInt();

        System.out.println("Digite a altura:");
        double altura = sc.nextDouble();

        System.out.println("Digite o peso:");
        double peso = sc.nextDouble();

      
        Pessoa pessoa = new Pessoa(nome, sobrenome, idade, altura, peso);

     
        pessoa.calculaIMC();

       
        System.out.println("\n===== RESULTADO =====");

        System.out.println("Nome: " + pessoa.getNome());

        System.out.println("Sobrenome: " + pessoa.getSobrenome());

        System.out.println("Idade: " + pessoa.getIdade());

        System.out.println("IMC: " + pessoa.getImc());

        System.out.println("Classificação: " + pessoa.informaObesidade());

        sc.close();
    }
}

