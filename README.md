![poster](.github/cover.png)

## 🤘 Sobre

Projeto Petlov para o treinamento de automação de testes com Java e JUnit 5

## 💻 Tecnologias
- Selenium Webdriver 4.20.0
- JDK 21
- JUnit 5

# Projeto de Testes e Automação para a Plataforma PetLov 🐾

## Descrição 📋

Este projeto visa garantir a qualidade e funcionalidade da plataforma PetLov através de testes automatizados. Utilizando Selenium WebDriver e Selenide, foram desenvolvidos testes para verificar o slogan do site e a funcionalidade de cadastro de pontos de doação.

## Tecnologias Utilizadas 🛠️

- **Java:** Linguagem de programação para desenvolvimento dos testes.
- **Selenium WebDriver:** Ferramenta para automação de navegadores.
- **Selenide:** Biblioteca que facilita a escrita de testes de automação.
- **JUnit:** Framework de testes para execução dos testes.
- **Maven:** Gerenciador de dependências e build system.

## Estrutura do Projeto 📁

O projeto está dividido em três principais pacotes, cada um com suas respectivas classes de teste:

### Pacote `br.com.rocketskills.petlov`

- **Slogan.java:** Testa se o slogan do site é exibido corretamente. Utiliza Selenium WebDriver para abrir a página e verificar o texto do elemento `<h1>`.

- **selenium.java:** Testa o processo de cadastro de um ponto de doação. Inclui os seguintes passos:
  1. Navegar para a página de cadastro.
  2. Preencher o formulário de cadastro com dados fictícios.
  3. Verificar a mensagem de sucesso após o envio do formulário.
  Utiliza Selenium WebDriver para interação com a página.

- **CadastroSelenide.java:** Testa o processo de cadastro de um ponto de doação utilizando Selenide. Inclui os seguintes testes:
  - `caminhoFeliz`: Verifica o fluxo de cadastro com dados válidos.
  - `emailIncorreto`: Verifica a resposta da plataforma quando um e-mail inválido é fornecido.
  Utiliza Selenide para interação com a página e validação dos resultados.

## Configuração do Ambiente ⚙️

### Pré-requisitos ✅

- Java 17 ou superior.
- Maven.
- Navegador Chrome e ChromeDriver (ou outro navegador e driver compatível).

### Instalação 🚀

1. Clone este repositório:

    ```bash
    git clone https://github.com/seu-usuario/seu-repositorio.git
    ```

2. Navegue até o diretório do projeto:

    ```bash
    cd seu-repositorio
    ```

3. Instale as dependências do Maven:

    ```bash
    mvn install
    ```

## Executando os Testes 🧪

Para executar os testes com JUnit:

```bash
mvn test


