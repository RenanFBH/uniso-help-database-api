 <div align="center">
   
# UNISO Help — Database API

**API REST para integração e disponibilização de dados do aplicativo UNISO Help**

Desenvolvido com Java e Spring Boot pela equipe Synapps.

[Objetivos](#-objetivos) · [Tecnologias](#-tecnologias-utilizadas) · [Arquitetura](#-arquitetura) · [Status](#-status-do-projeto)

</div>

---

## 🎯 Objetivos

O **UNISO Help — Database API** é o componente de back-end do projeto acadêmico UNISO Help, desenvolvido pela equipe Synapps para centralizar e disponibilizar informações acadêmicas e administrativas da Universidade de Sorocaba (UNISO).

Desenvolvida com Java e Spring Boot, a API tem como finalidade fornecer dados estruturados em formato JSON para consumo pelo aplicativo mobile, estabelecendo a comunicação entre a interface do usuário e os serviços de back-end.

Entre os principais objetivos, estão:

- Disponibilizar informações por meio de endpoints REST.
- Retornar dados estruturados em formato JSON.
- Organizar o processamento das requisições e as regras de negócio.
- Permitir a integração entre o aplicativo mobile e o back-end.
- Estruturar os serviços para a futura ampliação das funcionalidades.
- Facilitar a manutenção e a evolução do sistema.

## ⚙️ Funcionalidades

- **Consulta de dados:** disponibilização de informações por meio de requisições HTTP.
- **Processamento de requisições:** recebimento e tratamento das solicitações enviadas pelos clientes.
- **Respostas JSON:** disponibilização de dados estruturados para integração com o aplicativo.

> **Nota:** o projeto está em desenvolvimento. As funcionalidades descritas devem ser consideradas conforme o estágio de implementação de cada operação. Os endpoints serão documentados à medida que forem implementados e testados.

## 🛠️ Tecnologias utilizadas

<div align="center">

| Tecnologia | Finalidade |
|:---:|---|
| [Java](https://www.java.com/) | Linguagem de programação do back-end |
| [Spring Boot](https://spring.io/projects/spring-boot) | Configuração e desenvolvimento da aplicação |
| [Spring Web](https://docs.spring.io/spring-boot/reference/web/servlet.html) | Construção de endpoints HTTP e serviços REST |
| [Maven](https://maven.apache.org/) | Gerenciamento de dependências e construção do projeto |
| [JSON](https://www.json.org/) | Formato de intercâmbio de dados |
| [Git](https://git-scm.com/) | Controle de versão |
| [GitHub](https://github.com/) | Hospedagem e colaboração no código-fonte |

</div>

## 🏗️ Arquitetura

A aplicação está sendo desenvolvida com separação de responsabilidades, buscando organizar o processamento das requisições e a lógica de negócio.

- **Controller:** recebe as requisições HTTP e disponibiliza os endpoints da API.
- **Service:** concentra a lógica de negócio e o processamento das operações.
- **Entity / Model:** representa os dados manipulados pela aplicação.
- **Repository:** camada destinada ao acesso e à persistência de dados, caso seja utilizada na implementação do acesso ao banco de dados.

Essa organização permite separar as responsabilidades e facilita a manutenção e a ampliação dos serviços.

## 🔗 Integração com o aplicativo

O UNISO Help é composto por dois componentes principais: o aplicativo front-end e a API backend.

O aplicativo é responsável pela interação com os estudantes, enquanto a API fornece os dados necessários para apresentar as informações disponíveis no sistema.

<div align="center">

**Fluxo de comunicação**

Aplicativo mobile → Requisição HTTP → API Spring Boot → Resposta JSON → Aplicativo mobile

</div>

O fluxo de comunicação funciona da seguinte maneira:

1. O aplicativo envia uma requisição HTTP para um endpoint da API.
2. O backend recebe e processa a solicitação.
3. A API retorna uma resposta HTTP com os dados ou o resultado da operação.
4. O aplicativo interpreta a resposta JSON e apresenta as informações ao usuário.

## 🚧 Status do projeto

<div align="center">

**Em desenvolvimento — Protótipo acadêmico de API REST**

</div>

O repositório contém a estrutura inicial do back-end e os serviços em desenvolvimento para atender às necessidades do aplicativo UNISO Help.

As funcionalidades serão implementadas progressivamente, incluindo a ampliação dos endpoints e a integração com os mecanismos de persistência de dados necessários ao projeto.

Este repositório faz parte de um protótipo acadêmico e não representa, neste momento, um serviço institucional oficial da Universidade de Sorocaba.

## 🎓 Contexto acadêmico

O UNISO Help está sendo desenvolvido no contexto de um Projeto Integrador dos cursos de **Análise e Desenvolvimento de Sistemas** e **Ciência da Computação** da Universidade de Sorocaba.

O trabalho reúne conhecimentos de desenvolvimento de software, arquitetura de aplicações, integração entre sistemas e organização de serviços de back-end.

A proposta também está alinhada ao **Objetivo de Desenvolvimento Sustentável 4 (ODS 4) — Educação de Qualidade**, buscando facilitar o acesso dos estudantes às informações relevantes para sua trajetória acadêmica.

## 👥 Equipe — Synapps

- Aline Weiss
- Guilherme de Souza Pansani
- João Vitor Araujo de Lima Terra
- Renan Françoso Bezerra

---

<div align="center">

Desenvolvido pela equipe **Synapps**, com foco em integração de sistemas e acesso organizado às informações acadêmicas.

</div>
