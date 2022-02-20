# importar classes
from veiculo import Veiculo
from carro import Carro

# criar instancia, definir valores
caminhao_rosa = Veiculo('rosa', 6, 'ford', 10)
carro_azul = Carro('azul', 'ferrari', 30)

# exibir valores
print('Caminhão rosa')
print('Cor:', caminhao_rosa.cor)
print('Marca:', caminhao_rosa.marca)
print('Tanque:', caminhao_rosa.tanque)
caminhao_rosa.abastecer(70)
print('Tanque:', caminhao_rosa.tanque)
print('-  -  -   ')
print('Carro azul')
print('Cor:', carro_azul.cor)
print('Marca:', carro_azul.marca)
print('Tanque:', carro_azul.tanque)
carro_azul.abastecer(70)
