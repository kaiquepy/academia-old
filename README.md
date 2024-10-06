# Sistema de Gerenciamento de Academia

## Descrição

Este é um projeto desenvolvido para a disciplina de Programação Orientada a Objetos (POO), no curso de **Bacharelado em Sistemas de Informação** da **Universidade Federal dos Vales do Jequitinhonha e Mucuri (UFVJM)**. O sistema tem como objetivo gerenciar academias, oferecendo funcionalidades como:

- Gerenciamento de agendamentos e horários de aulas.
- Controle de clientes, incluindo reservas e histórico de participação.
- Gestão de funcionários e administradores.
- Controle de estoque da loja.
- Emissão de relatórios financeiros e balanços mensais.

Este projeto foi desenvolvido utilizando o padrão de arquitetura **MVC (Model-View-Controller)** em **Java**.

## Estrutura do Projeto

O projeto segue a arquitetura MVC, dividindo a aplicação em três camadas principais:

- **Model**: Representa os dados da aplicação, como clientes, funcionários, agendamentos e estoque.
- **View**: Interface com o usuário, responsável por exibir as informações do sistema.
- **Controller**: Controla a lógica entre o Model e a View, gerenciando as interações.


### Estrutura de Pastas

A estrutura do projeto foi organizada para seguir o padrão **MVC (Model-View-Controller)**, com separação clara entre as camadas de **Model**, **View** e **Controller**.

```bash
├── src
│   └── com
│       └── academia
│           ├── model
│           ├── view   
│           └── controller
├── pom.xml
└── README.md
```

- `model`: Contém as classes que representam a lógica de negócio e os dados (ex: Aluno, Professor);
- `view`: Contém as classes responsáveis pela interface de exibição e interação com o usuário (ex: AcademiaView);
- `controller`: Contém as classes que fazem a mediação entre o Model e o View (ex: AcademiaController);
- `pom.xml`: Arquivo de configuração do Maven, responsável pelo gerenciamento de dependências;
- `README.md`: Documentação do projeto.


## Funcionalidades

1. **Autenticação no sistema**: Somente usuários autenticados podem acessar certas funcionalidades do sistema, como gerenciamento de clientes e funcionários.
2. **Gerenciamento de agendamentos**: Permite agendar, cancelar e verificar disponibilidade de aulas.
3. **Controle de clientes**: Gerenciar informações dos clientes, como nome, contato e status de pagamento.
4. **Controle de estoque**: Gerenciar o estoque de produtos na loja da academia, verificando a disponibilidade de itens.
5. **Relatórios e balanços**: Geração de relatórios financeiros diários e mensais, além de balanços gerais.

## Tecnologias Utilizadas

- **Java 17**
- **Maven** para gerenciamento de dependências.
- Arquitetura **MVC (Model-View-Controller)**.

## Como Executar o Projeto

### Requisitos

- **JDK 17** ou superior.
- **Maven** instalado.

### Passos

1. Clone o repositório:

    ```bash
    git clone https://github.com/kaiquepy/academia.git
    ```

2. Navegue até o diretório do projeto:

    ```bash
    cd academia
    ```

3. Compile o projeto utilizando o Maven:

    ```bash
    mvn clean install
    ```

4. Execute o projeto:

    ```bash
    mvn exec:java -Dexec.mainClass="com.academia.Academia"
    ```

## Diagrama de Classes

O diagrama de classes reflete a estrutura do sistema, com classes como `Aluno`, `Professor`, `Aula`, `Administrador`, e outras. Ele foi elaborado de forma a garantir modularidade, respeitando os princípios de encapsulamento, herança e polimorfismo da Programação Orientada a Objetos.

Para mais detalhes sobre o diagrama de classes e fluxos de eventos, consulte a [documentação do projeto](./docs/Projeto_POO_Academia.pdf).

## Autores

- **Kayky Nery Alcântara Vieira**
- **Kaique Vieira Miranda**

## Professor

- **Eduardo Pelli**