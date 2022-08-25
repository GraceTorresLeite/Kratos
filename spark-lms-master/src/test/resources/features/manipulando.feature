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
  Eu como usuário quero me logar no site consultar livro por autor e categoria

  @tag1
  Scenario: login com sucesso
    Given Eu quero acessar a livraria
    When Eu digito meus dados
    Then terei habilidade de manipular minhas escolhas

  @tag2
  Scenario Outline: Escolhendo livro por categoria
    Given Eu logada no site
    When Eu escolho o livro por categoria
    Then terei a visualização do livro desejado por categoria
    
  @tag3
  Scenario Outline: Escolhendo livro por autor
    Given Eu quero acessar a livraria
    When Eu escolho o livro por autor
    Then terei a visualização do livro desejado por autor


