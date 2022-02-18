# importa o objeto veiculo
from veiculo import Veiculo

# carro herda os atributos da classe veiculo
class Carro(Veiculo):

    # definicao de valores
    def __init__(self, cor, marca, tanque):
        Veiculo.__init__(self, cor, 4, marca, tanque)

    # definicao de metodos
    def abastecer(self, litros):
        if self.tanque + litros > 50:
            print("Erro: tanque cheio")
        else:
            self.tanque += litros
