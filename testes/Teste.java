package com.sgp.testes;

import java.util.Scanner;
import com.sgp.modelos.Pet;

public class TesteAcessoMenuPet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pet pet = new Pet();
        int opcao;

        do {
            System.out.println("\n=== Menu Pet ===");
            System.out.println("1. Mostrar dados do pet");
            System.out.println("2. Alterar nome");
            System.out.println("3. Alterar idade");
            System.out.println("4. Alterar peso");
            System.out.println("5. Alterar espécie");
            System.out.println("6. Idade em meses");
            System.out.println("7. Descrição do pet");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Digite um número válido!");
                opcao = -1;
            }

            switch (opcao) {
                case 1:
                    System.out.println(pet.toString());
                    break;
                case 2:
                    System.out.print("Digite o novo nome: ");
                    String nome = scanner.nextLine();
                    if (nome != null && !nome.isEmpty()) {
                        pet.setNome(nome);
                        System.out.println("Nome alterado com sucesso!");
                    } else {
                        System.out.println("Nome inválido!");
                    }
                    break;
                case 3:
                    System.out.print("Digite a nova idade: ");
                    try {
                        int idade = Integer.parseInt(scanner.nextLine());
                        if (idade >= 0 && idade <= 30) {
                            pet.setIdade(idade);
                            System.out.println("Idade alterada com sucesso!");
                        } else {
                            System.out.println("Idade inválida! Deve ser entre 0 e 30.");
                        }
                    } catch (Exception e) {
                        System.out.println("Erro: digite um número inteiro válido!");
                    }
                    break;
                case 4:
                    System.out.print("Digite o novo peso: ");
                    try {
                        double peso = Double.parseDouble(scanner.nextLine());
                        if (peso > 0) {
                            pet.setPeso(peso);
                            System.out.println("Peso alterado com sucesso!");
                        } else {
                            System.out.println("Peso inválido! Deve ser maior que 0.");
                        }
                    } catch (Exception e) {
                        System.out.println("Erro: digite um número válido para o peso!");
                    }
                    break;
                case 5:
                    System.out.print("Digite a nova espécie: ");
                    String especie = scanner.nextLine();
                    if (especie != null && !especie.isEmpty()) {
                        pet.setEspecie(especie);
                        System.out.println("Espécie alterada com sucesso!");
                    } else {
                        System.out.println("Espécie inválida!");
                    }
                    break;
                case 6:
                    System.out.println("Idade em meses: " + pet.idadeEmMeses());
                    break;
                case 7:
                    System.out.println("Descrição: " + pet.descricao());
                    break;
                case 0:
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}