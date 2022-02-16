# - - - - - - - - - - - - - - - - - - - - - - - - -

# Um programa executado pela linha de comando.
# Exemplo de uso: python3 nome_do_arquivo soma 1 2

# - - - - - - - - - - - - - - - - - - - - - - - - -

# Imports
import sys
argumentos = sys.argv

# Funcoes
def soma(n1, n2):
    return n1+n2

def sub(n1, n2):
    return n1-n2

# Condicionais
if argumentos[1] == "soma":
    resposta = soma(float(argumentos[2]), float(argumentos[3]))

elif argumentos[1] == "sub":
    resposta = sub(float(argumentos[2]), float(argumentos[3]))

# Resultado
print(resposta)

