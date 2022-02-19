import requests
import json

requisicao = requests.get('http://apiadvisor.climatempo.com.br/api/v1/anl/synoptic/locale/BR?token=56eda943f4060cc966dac392cf48d1e8')

clima = json.loads(requisicao.text)

print(clima[0]['text'])
