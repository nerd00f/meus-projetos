# - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

# Exercicio: Criar um software de gerenciamento bancário
# - Esse software poderá ser capaz de criar clientes e contas
# - Cada cliente possui nome, cpf, idade
# - Cada conta possui um 
#   cliente, saldo, limite, sacar, depositar e consultar_saldo

# - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

from cliente import Cliente
from conta import Conta

cliente1 = Cliente('Gui', '123.456.789-10', 27)


conta_do_gui = Conta(cliente1, 10.50, 1000)

print(conta_do_gui.cliente.nome, conta_do_gui.consulta_saldo())

conta_do_gui.depositar(1000.40)

print(conta_do_gui.consulta_saldo())

conta_do_gui.sacar(500)

print(conta_do_gui.consulta_saldo())

conta_do_gui.sacar(1000)

print(conta_do_gui.consulta_saldo())