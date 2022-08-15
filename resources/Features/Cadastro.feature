#language: pt
#Author: Rafael Lima
#Version: 1.0
#Encoding: UTF-8

@usuario
Funcionalidade: Cadastrar e logar usuário
  Eu como usuário não cadastrado
  Desejo me cadastrar
  A fim de me tornar um cliente

  @cadastro
  Cenario: Criar novo usuário
    Dado que estou na página inicial
    E preencho o formulário de cadastro
    Quando envio o formulário
    Entao devo visualizar a mensagem "Welcome to your account."

  @login
  Cenario: Logar usuario
    Dado que estou na página inicial
    E clico em login
    Quando preencho e envio minhas credenciais
    Entao devo visualizar a mensagem "Welcome to your account."

  @logout
  Cenario: Fazer o loggout do usuario
    Dado que estou na página inicial
    E faço o login com minhas credenciais
    Quando clico em Sign Out
    Entao devo ser redirecionado a página inicial

  @newsletter
  Cenario: Realizar cadastro na Newsletter
    Dado que estou na página inicial
    E faço o login com minhas credenciais
    Quando preencho com meu email o campo Newsletter
    E clico para enviar
    Entao devo visualizar o texto "Newsletter : You have successfully subscribed to this newsletter."




