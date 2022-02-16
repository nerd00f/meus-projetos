# define o objeto
class Veiculo:

    # define seus atributos
    def __init__(self, cor, rodas, marca, tanque):
        self.cor = cor
        self.rodas = rodas
        self.marca = marca
        self.tanque = tanque

    # define um metodo
    def abastecer(self, litros):
        self.tanque += litros
