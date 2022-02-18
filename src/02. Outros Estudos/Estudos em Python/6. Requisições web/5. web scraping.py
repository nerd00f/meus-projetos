# Imports
import requests
import json
from bs4 import BeautifulSoup

# Url da busca
res = requests.get("https://blog.rocketseat.com.br")

# Formata as informacoes
res.encoding = 'utf-8'
soup = BeautifulSoup(res.text, 'html.parser')

# Busca todos os artigos
posts = soup.find_all(class_="item-wrap")
all_post = []

# Busca as informacoes pedidas
for post in posts:
    title = post.h2.text
    author = post.find(class_="author-name").text
    try: tag = post.find(class_="primary-tag").text
    except: tag = ' '
    all_post.append({
        'titulo': title,
        'autor': author,
        'tag' : tag 
    })

# Exibe o resultado no terminal
print(all_post)

# Salva o resultado em um aquivo .json
with open('posts.json', 'w') as json_file:
    json.dump(all_post, json_file,indent=3,ensure_ascii=False)
