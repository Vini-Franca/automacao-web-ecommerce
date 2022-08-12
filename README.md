estrutura-java-cucumber-selenium

# Projeto Base Automação Web - Selenium, Java & Cucumber

## Ferramentas utilizadas:
- [Maven](https://maven.apache.org/ "Maven")
- [Java](https://www.java.com/pt_BR/ "Java")
- [JUnit](https://junit.org/junit4/ "JUnit")
- [Selenium](https://www.seleniumhq.org/ "Selenium")
- [ChromeDriver](https://chromedriver.chromium.org/downloads "ChromeDriver")
- [Cucumber](https://cucumber.io/ "Cucumber")
- [PageFactory](https://github.com/SeleniumHQ/selenium/wiki/PageFactory "PageFactory")

### Arquitetura - Bibliotecas utilizadas

Neste projeto foram utilizadas 4 bibliotecas:
- [selenium-java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java "selenium-java")
- [junit](https://mvnrepository.com/artifact/junit/junit "junit")
- [cucumber-java](https://mvnrepository.com/artifact/info.cukes/cucumber-java "cucumber-java")
- [cucumber-junit](https://mvnrepository.com/artifact/info.cukes/cucumber-junit "cucumber-junit")

A biblioteca selenium-java possui as implementações de: *WebDriver, ChromeDriver, ExpectedConditions, WebDriverWait, Actions, WebElement, FindBy, PageFactory*, utilizadas no projeto.

A biblioteca junit possui as implementações de: RunWith utilizado no projeto.

A biblioteca cucumber-java possui as implementações de: *Scenario, Before, After, Dado, E, Entao, CucumberOptions*, utilizadas no projeto.

A biblioteca cucumber-junit possui a implementação da classe *Cucumber.class*, utilizada da classe RunTest como ferramenta de execução.

### Arquitetura - Mapeamento dos elementos
Para mapear os elementos utilizamos a biblioteca do selenium PageFactory, responsável por abstrair os elementos para uma classe única e para facilitar a escrita e manutenção. Por padrão os elementos são armazenados nas classes com o padrão <NomeClasse>WebElement. Detalhes da implementação e exemplos:
- WebElement - responsável por identificar os elementos como Web;
- FindBy - responsável por mapear, através de anotações, os seletores dos WebElements

Após mapeados, é necessário "inicializar" os elementos na classe em que serão utilizadas. Por padrão, os elementos são utilizados nas classe <NomeDaClasse>Funcionalidade correspondentes.

### Arquitetura - Interação com elementos da página
Para interagir com elementos da página, conforme o padrão Page Objects, criamos uma classe de Page para cada página ou grupo de páginas do sistema. Abaixo detalhes da implementação e exemplos:
- PageFactory: responsável pela inicialização dos elementos na página
- Util: responsável por armazenar funções úteis para criação e execução dos testes.

### Arquitetura - Cucumber e Definições de steps
Para criação dos testes, o passo a passo é definido em arquivos .feature, dentro do diretório resources/Features. Estes arquivos contém o detalhamento do teste que será executado. Para isso utilizamos o Cucumber.
Para cada passo utilizado neste arquivo, deve ser criada uma definição de Steps
correspondente. Os arquivos de steps serão criados no diretório steps.

### Arquitetura - Execução dos testes
Para execução dos testes, utilizamos classe JUnit, em conjunto com anotações do CucumberOptions para facilitar a criação de suítes de testes com diferentes configurações.

### Arquitetura - Relatórios
Com a estrutura atual, após a conclusão da execução dos cenários será exibido no terminal do Runner um link para visulizar o report do próprio Cucumber.
E na pasta target/report você encontrará um arquivo index.html - relatório personalizado do Cluecumber.

### Arquitetura - ChromeDriver
Por conveniência, faça o download do chromedriver adequado para o seu sistema operacional e adicione no diretório resources/drivers.
Local para download: https://chromedriver.chromium.org/downloads

Créditos - Documentação [Samuel Lucas](https://github.com/samlucax) | Estrutura [Marcelo Ribelato](https://github.com/MarceloRibelato)

------------
