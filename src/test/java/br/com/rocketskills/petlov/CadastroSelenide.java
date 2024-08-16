package br.com.rocketskills.petlov;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


class PontoDoacao {
    String nome;
    String email;
    String cep; // Alterado para String
    String numero; // Alterado para String
    String complemento;
    String pets;

    public PontoDoacao(String nome, String email, String cep, String numero, String complemento, String pets) {
        this.nome = nome;
        this.email = email;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
        this.pets = pets;
    }
}

class CadastroSelenide {

	private void submeteFormulario(PontoDoacao pontoDoacao){
		$("h1").shouldHave(text(("Cadastro de ponto de doação")));
		$("input[placeholder='Nome do ponto de doação']").setValue(pontoDoacao.nome);	
		$("input[name=email]").setValue(pontoDoacao.email);
		$("input[name=cep]").setValue(pontoDoacao.cep);
		$("input[value='Buscar CEP']").click();		
		$("input[name='addressNumber']").setValue(pontoDoacao.numero);
		$("input[name='addressDetails']").setValue(pontoDoacao.complemento);
		$(By.xpath("//span[text()='" + pontoDoacao.pets + "']/..")).click();
		$(".button-register").click();
	}

    @Test
    @DisplayName("Deve poder cadastrar um ponto de doação")
    void caminhoFeliz() {

		// Pre-condição
        PontoDoacao pontoDoacao = new PontoDoacao(
            "Estação Pet",
            "estacao@test.com.br",
            "63800000",
            "3520",
            "casa",
            "Cachorros"
        );

		open("https://petlov.vercel.app/signup");

		// Ação

		submeteFormulario(pontoDoacao);
		
		// Resultado esperado
		String target = "Seu ponto de doação foi adicionado com sucesso. Juntos, podemos criar um mundo onde todos os animais recebam o amor e cuidado que merecem.";

		$("#success-page p").shouldHave(text((target)));			
		
	}

	@Test
    @DisplayName("Não deve cadastrar com um email inválido")
    void emailIncorreto() {

		// Pre-condição
        PontoDoacao pontoDoacao = new PontoDoacao(
            "Lar dos Peludos",
            "atendimento&peludos.com.br",
            "63800000",
            "3520",
            "casa",
            "Gatos"
        );

		open("https://petlov.vercel.app/signup");

		// Ação

		submeteFormulario(pontoDoacao);
		
		// Resultado esperado
		String target = "Informe um email válido";

		$(".alert-error").shouldHave(text((target)));			
		
	}
}
