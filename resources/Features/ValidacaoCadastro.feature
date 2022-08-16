#language: pt
#Author: Rafael Lima
#Version: 1.0
#Encoding: UTF-8

@validacao
Funcionalidade: Validar campos obrigatórios
  Eu como usuário não cadastrado
  Desejo validar os campos obrigatórios

  @semEmail
  Cenario: Tentar criar uma conta sem preencher email
    Dado que estou na página inicial
    E clico em login
    Quando clico em criar conta sem preencher o email
    Entao a recebo a mensagem "Invalid email address."

  @semDados
  Cenario: Tentar criar uma conta sem preencher campos obrigatórios
    Dado que estou na página inicial
    E clico em login
    Quando preencho um email válido para prosseguir
    E envio o formulário sem preencher os campos obrigatórios
    Entao visualizo a mensagem "There are 8 errors"


