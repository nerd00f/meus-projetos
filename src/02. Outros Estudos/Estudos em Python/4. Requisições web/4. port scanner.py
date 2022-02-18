# responsavel pela conexao
import socket

# endereco a conectar
ip = 'bancocn.com'
# portas a serem testadas
portas = range(1,65535) # [21, 23, 80, 443, 8080]

# loop
for porta in portas:
    # cliente recebe o socket de protocolo: IP, TCP
    cliente = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    # tempo limite de conexao
    cliente.settimeout(0.1)
    # local da conexao
    codigo = cliente.connect_ex((ip, porta))
    # em caso de sucesso
    if codigo == 0:
        # exiba a porta aberta
        print (porta, "ABERTA")
    # em caso de fracasso
    if codigo != 0:
        # exiba a porta fechada
        print (porta, "fechada")
