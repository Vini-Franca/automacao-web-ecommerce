#language: pt
#Author: Rafael Lima
#Version: 1.0
#Encoding: UTF-8

@carrinho
Funcionalidade: Adicionar produtos ao carrinho
  Eu como usuário cadastrado
  Desejo adicionar produtos ao carrinho

  @add
  Cenario: Adicionar produto ao carrinho
    Dado que estou na home page
    E faço login com meu email e senha
    Quando adiciono um produto ao carrinho
    Entao devo visualizar "Product successfully added to your shopping cart"

  @addDress
  Cenario: Adicionar um vestido ao carrinho
    Dado que estou na home page
    E faço login com meu email e senha
    Quando adiciono um vestido ao carrinho
    Entao devo visualizar "Product successfully added to your shopping cart"

  @addBlouse
  Cenario: Adicionar uma blusa ao carrinho
    Dado que estou na home page
    E faço login com meu email e senha
    Quando adiciono uma blusa ao carrinho
    Entao devo visualizar "Product successfully added to your shopping cart"




