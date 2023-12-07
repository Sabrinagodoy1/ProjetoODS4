package projeto;

import java.util.Scanner;

public class EducacaoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação de um objeto Aluno
        System.out.println("Informe o nome do aluno:");
        String nomeAluno = scanner.nextLine();

        System.out.println("Informe a idade do aluno:");
        int idadeAluno = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        System.out.println("Informe a matrícula do aluno:");
        String matriculaAluno = scanner.nextLine();

        aluno aluno = new aluno(nomeAluno, idadeAluno, matriculaAluno);

        // Exibe detalhes do aluno
        System.out.println("\nDetalhes do Aluno:");
        aluno.exibirDetalhes();

        // Verifica se o aluno é maior de idade
        if (aluno.ehMaiorIdade()) {
            System.out.println("\nO aluno é maior de idade.");
        } else {
            System.out.println("\nO aluno não é maior de idade.");
        }

        // Criação de um objeto Professor
        System.out.println("\nInforme o nome do professor:");
        String nomeProfessor = scanner.nextLine();

        System.out.println("Informe a disciplina do professor:");
        String disciplinaProfessor = scanner.nextLine();

        Professor professor = new Professor(nomeProfessor, disciplinaProfessor);

        // Exibe detalhes do professor
        System.out.println("\nDetalhes do Professor:");
        professor.exibirDetalhes();

        // Verifica se o professor leciona uma disciplina específica
        System.out.println("\nInforme uma disciplina para verificar se o professor leciona:");
        String disciplinaVerificar = scanner.nextLine();

        if (professor.lecionaDisciplina(disciplinaVerificar)) {
            System.out.println("O professor leciona a disciplina informada.");
        } else {
            System.out.println("O professor não leciona a disciplina informada.");
        }

        // Criação de um objeto Disciplina
        System.out.println("\nInforme o nome da disciplina:");
        String nomeDisciplina = scanner.nextLine();

        System.out.println("Informe a carga horária da disciplina:");
        int cargaHorariaDisciplina = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        Disciplina disciplina = new Disciplina(nomeDisciplina, cargaHorariaDisciplina);

        // Exibe detalhes da disciplina
        System.out.println("\nDetalhes da Disciplina:");
        disciplina.exibirDetalhes();

        // Calcula e exibe a média de horas de estudo semanal
        System.out.println("\nInforme o número de semanas letivas para calcular a média de horas de estudo semanal:");
        int semanasLetivas = scanner.nextInt();

        double mediaHorasEstudoSemanal = disciplina.calcularMediaHorasEstudoSemanal(semanasLetivas);
        System.out.println("Média de horas de estudo semanal: " + mediaHorasEstudoSemanal);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }


}