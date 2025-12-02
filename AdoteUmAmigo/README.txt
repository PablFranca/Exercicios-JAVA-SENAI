Documentação do Projeto – API de Doação de PETs SENAI SIG
1.	Visão Geral
Este projeto é uma API REST desenvolvida pelos alunos do SENAI SIG, entre diversas turmas, com o propósito de criar um sistema completo e colaborativo para doação responsável de animais.
A API serve como base para cadastro de pets, perfis de adotantes, controle de adoções e disponibilidade de animais. O projeto cresce em conjunto, turma após turma, cada uma melhorando a base deixada pela anterior.


2.	Objetivo do Sistema
A API deve permitir:

●	Cadastro de pets disponíveis para adoção.

●	Atualização da situação do pet (disponível, adotado, em tratamento etc.).

●	Cadastro de adotantes com seus dados de contato.

●	Registro de adoções

●	Filtragem de pets por espécie, porte, idade ou condição.

●	Fornecer endpoints limpos para front simples ou aplicações futuras.


A ideia é tornar o processo de adoção mais organizado e transparente.

3.	Tecnologias Utilizadas
●	Java 17

●	Spring Boot (Web, JPA, Validation)

●	MySQL/MariaDB

●	Maven

●	Swagger / SpringDoc

●	Docker (opcional, recomendado)

●	Lombok



4.	Requisitos Funcionais
RF01 – Cadastro de Pets
Permitir:

●	Registrar pets para adoção

●	Listar pets disponíveis

●	Filtrar por espécie, idade, porte e condição

●	Atualizar dados

●	Marcar como adotado

●	Excluir registros









Campos essenciais:

●	nome

●	especie

●	raca

●	idade

●	porte

●	descricao

●	disponibilidade (boolean)

●	dataEntrada

●	vacinas



RF02 – Cadastro de Adotantes
●	Nome completo

●	CPF

●	Telefone

●	Email

●	Endereço

●	Histórico de adoções





RF03 – Processo de Adoção
●	Adotante seleciona um pet

●	API registra a adoção

●	Pet deixa de aparecer como disponível

●	Registro armazenado para histórico



5.	Requisitos Não Funcionais
●	Padrão REST

●	Respostas em JSON

●	Banco relacional

●	Documentação via Swagger

●	Padrões de código organizados



6.	Estrutura de Pacotes Recomendada
src/main/java/com/senai/adocao
├── controllers
├── services
├── repositories
├── models
├── dtos
├── config

7.	Modelo das Entidades
Pet
●	id

●	nome

●	especie

●	raca

●	idade

●	porte

●	descricao

●	vacinas

●	disponivel (boolean)

●	dataEntrada

●	dataAdocao (opcional)



Adotante
●	id

●	nome

●	cpf

●	telefone

●	email

●	endereco

●	petsAdotados (lista)

Adoção
●	id

●	petId

●	adotanteId

●	dataAdocao

●	observacoes



8.	Endpoints Básicos
Pets
POST /api/pets GET /api/pets
GET /api/pets/{id} PUT /api/pets/{id} DELETE /api/pets/{id}
PUT /api/pets/{id}/adotar GET /api/pets/disponiveis


Adotantes
POST /api/adotantes GET /api/adotantes
GET /api/adotantes/{id}



Adoções
POST /api/adocoes GET /api/adocoes
GET /api/adocoes/{id}

9.	Banco de Dados (modelo simples)
Relacionamentos:

●	Adotante 1:N Adoções

●	Pet 1:1 Adoção

●	Um pet só pode possuir uma adoção, mas um adotante pode adotar vários pets.



10.	Guia de Contribuição
●	Não subir código quebrado

●	Mantém padrão de pastas

●	Usa DTOs quando necessário

●	Commits claros

●	Código limpo e sem gambiarras

●	Variáveis nomeadas decentemente

●	Testar tudo antes de entregar




11.	Conclusão
Este projeto une técnica e propósito.
Cada turma deixa sua marca, cada melhoria abre novos caminhos.
A API de doação de PETs é mais que um exercício de programação, é uma aplicação com significado real, capaz de ajudar animais e pessoas.
