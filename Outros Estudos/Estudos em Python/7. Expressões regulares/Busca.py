# para mais tipos de busca ver as docs:
# https://docs.python.org/3/howto/regex.html

import re

teste = 'Programando em python'

padrao = re.search(r'em',teste) 

if padrao:
  print(padrao.group())
else:
  print("Padrao nao encontrado")
