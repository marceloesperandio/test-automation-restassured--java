## Automation Backend

Esse projeto tem o intuito de ajudar outras pessoas a aprender a arte da automação de teste, estou trabalhando com as ferramentas abaixo para testes de Rest-API.

 - Endpoint: https://dummy.restapiexample.com.
 - Java
 - Junit5
 - Cucumber 7
 - JDK 22
 - Rest-Assured
 - Allure Report.

---

## Pré-requisitos

Certifique-se de ter instalado em seu ambiente:

 - Java 22
 - Maven
 - IDE de sua preferência (recomendado: IntelliJ IDEA, Eclipse)

---

## Configuração do Ambiente
 - Clone este repositório: git clone https://github.com/seu-usuario/seu-projeto.git
 - Abra o projeto em sua IDE.
 - Certifique-se de que as dependências do Maven estão instaladas. Caso contrário, você pode atualizá-las usando o seguinte comando:
   - mvn clean install
   
---

## Executando os Testes
Para executar os testes automatizados, siga estes passos:

 - Navegue até o diretório raiz do projeto.
 - Execute o seguinte comando:
   - mvn test
 - Este comando irá rodar os testes definidos no diretório src/test/java utilizando o Cucumber.

---

## Gerando Relatórios
Este projeto utiliza o Allure para geração de relatórios. Para gerar e visualizar os relatórios dos testes, siga os passos abaixo:

 * Após a execução dos testes, navegue até o diretório raiz do projeto.
 * Execute o seguinte comando:
   - allure serve target/allure-results

---

## Referência

- [Awesome Readme Templates](https://awesomeopensource.com/project/elangosundar/awesome-README-templates)
- [Awesome README](https://github.com/matiassingers/awesome-readme)
- [How to write a Good readme](https://bulldogjob.com/news/449-how-to-write-a-good-readme-for-your-github-project)


## Autores

- [@marcelo](https://github.com/marceloesperandio)