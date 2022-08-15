#language: pt
#Author: Rafael Lima
#Version: 1.0
#Encoding: UTF-8

@checkout
Funcionalidade: Finalizar compra
  Eu como usuário cadastrado
  Desejo adicionar produtos ao carrinho
  A fim de finalizar a compra com sucesso

  @check
  Cenario: Realizar pagamento via cheque
    Dado que estou na home page
    E faço login com meu email e senha
    Quando adiciono um produto ao carrinho
    E prossigo para finalizar compra por cheque
    Entao devo receber a mensagem "Your order on My Store is complete."

  @bankWire
  Cenario: Realizar pagamento via transferencia bancaria
    Dado que estou na home page
    E faço login com meu email e senha
    Quando adiciono um produto ao carrinho
    E prossigo para finalizar compra por trasnferencia bancaria
    Entao devo receber a mensagem "Your order on My Store is complete."





