import requests
import json

# Faz requisicao da informacao para a API

def requisição(title):

    try:
        req = requests.get('https://www.omdbapi.com/?t='+title)
        dicionario = json.loads(req.text)
        return dicionario

    except Exception as err:
        print('Erro de requisição:', err)
        return None

# Interacao com o usuario

sair = False

while not sair:

    opcao = input('Digitar nome do filme, ou SAIR para fechar: ')

    if opcao == 'SAIR':
        sair = True
    else:
        filme = requisição(opcao)

    if filme['Response'] == "False":
        print('Filme não encontrado')
