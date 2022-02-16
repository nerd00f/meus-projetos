import random

def gerar():
    return random.randint(1,100)

def jogo():
    resposta = gerar()
    tentativa = 0
    print("\nEstou pensando em um número de 1 a 100, pode adivinhar qual é?")

    chute=0
    while chute is not resposta:
        tentativa +=1
        chute = int(input("Qual seu chute: "))
        if chute > resposta:
            print("Errou! É um valor menor que ", chute)
        elif chute < resposta:
            print("Errou! É um valor maior que ", chute)
        else:
            print("Parabéns! O número gerado foi ",resposta, \
                  "Acertou em ",tentativa," tentativas!")

while True:
    jogo()
