#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Livraria online
  Eu como usuário quero me logar no site consulatr e selecionar livro

  @tag1
  Scenario: Cadastro e login
    Given Eu quero acessar a livraria
    When Eu me cadastrar
    Then terei habilidade de manipular minhas escolhas

  @tag2
  Scenario Outline: Escolhendo livro por titulo
    Given Eu quero acessar a livraria
    When Eu escolho o livro por titulo
    Then terei a visualização do livro desejado
    
  @tag3
  Scenario Outline: Escolhendo livro por autor
    Given Eu quero acessar a livraria
    When Eu escolho o livro por autor
    Then terei a visualização do livro desejado

