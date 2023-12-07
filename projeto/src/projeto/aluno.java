package projeto;
import java.util.Scanner;
public class aluno {

	
	    private String nome;
	    private int idade;
	    private String matricula;

	    public aluno(String nome, int idade, String matricula) {
	        this.nome = nome;
	        this.idade = idade;
	        this.matricula = matricula;
	    }

	    // Método para calcular se o aluno é maior de idade
	    public boolean ehMaiorIdade() {
	        return idade >= 18;
	    }

	    // Método para exibir informações detalhadas do aluno
	    public void exibirDetalhes() {
	        System.out.println("Nome: " + nome);
	        System.out.println("Idade: " + idade + " anos");
	        System.out.println("Matrícula: " + matricula);
	    }
	}

	class Professor {
	    private String nome;
	    private String disciplina;

	    public Professor(String nome, String disciplina) {
	        this.nome = nome;
	        this.disciplina = disciplina;
	    }

	    // Método para verificar se o professor leciona uma disciplina específica
	    public boolean lecionaDisciplina(String disciplina) {
	        return this.disciplina.equalsIgnoreCase(disciplina);
	    }

	    // Método para exibir informações detalhadas do professor
	    public void exibirDetalhes() {
	        System.out.println("Nome: " + nome);
	        System.out.println("Disciplina: " + disciplina);
	    }
	}

	class Disciplina {
	    private String nome;
	    private int cargaHoraria;

	    public Disciplina(String nome, int cargaHoraria) {
	        this.nome = nome;
	        this.cargaHoraria = cargaHoraria;
	    }

	    // Método para calcular a média de horas de estudo semanal
	    public double calcularMediaHorasEstudoSemanal(int semanasLetivas) {
	        return cargaHoraria / (double) semanasLetivas;
	    }

	    // Método para exibir informações detalhadas da disciplina
	    public void exibirDetalhes() {
	        System.out.println("Nome: " + nome);
	        System.out.println("Carga Horária: " + cargaHoraria + " horas");
	    }
	    public class GetSetMain {
	        public static void main(String[] args) {
	            Scanner scanner = new Scanner(System.in);

	            // Criação de um objeto Aluno com getters e setters
	            System.out.println("Informe o nome do aluno:");
	            String nomeAluno = scanner.nextLine();

	            System.out.println("Informe a idade do aluno:");
	            int idadeAluno = scanner.nextInt();
	            scanner.nextLine(); // Limpa o buffer

	            System.out.println("Informe a matrícula do aluno:");
	            String matriculaAluno = scanner.nextLine();

	            // Criação do objeto usando o construtor
	            AlunoGetSet aluno = new AlunoGetSet(nomeAluno, idadeAluno, matriculaAluno);

	            // Exibe detalhes do aluno usando os getters
	            System.out.println("\nDetalhes do Aluno:");
	            System.out.println("Nome: " + aluno.getNome());
	            System.out.println("Idade: " + aluno.getIdade() + " anos");
	            System.out.println("Matrícula: " + aluno.getMatricula());

	            // Atualiza a idade do aluno usando o setter
	            System.out.println("\nInforme a nova idade do aluno:");
	            int novaIdade = scanner.nextInt();
	            aluno.setIdade(novaIdade);

	            // Exibe novamente detalhes do aluno após a atualização
	            System.out.println("\nDetalhes do Aluno após atualização:");
	            System.out.println("Nome: " + aluno.getNome());
	            System.out.println("Idade: " + aluno.getIdade() + " anos");
	            System.out.println("Matrícula: " + aluno.getMatricula());

	            // Fecha o scanner para evitar vazamento de recursos
	            scanner.close();
	        }
	}}