# Cria um novo arquivo
arquivo = open('arquivo.txt', 'w')

# Loop que escreve no arquivo
for i in range(1, 1001):
    arquivo.write(str(i)+'\n')
