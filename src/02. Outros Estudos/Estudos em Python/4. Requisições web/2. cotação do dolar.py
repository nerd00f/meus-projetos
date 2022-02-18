import requests
import json

requisicao = requests.get('https://economia.awesomeapi.com.br/all/USD-BRL')

cotacao = json.loads(requisicao.text)

print("valor do dolar:", cotacao['USD']['ask'])
