import json

arquivo = 'numeros.json'

with open(arquivo) as objeto:
 numeros = json.load(objeto)
 print(numeros)
