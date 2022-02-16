import requests

try:
  req = requests.get('https://solyd.com.br')
  
except Exception as err:
  print('Erro de requisição:', err)

print(req)
print(req.text)
