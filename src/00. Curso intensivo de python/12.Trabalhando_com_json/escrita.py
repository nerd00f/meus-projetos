import json

numeros = [1,3,5,7]

arquivo = 'numeros.json'

with open(arquivo, 'w') as objeto:
 json.dump(numeros, objeto)
