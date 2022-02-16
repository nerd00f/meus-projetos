# Crie um algoritmo que leia um numero 
# e mostre seu dobro, triplo e raiz quadrada

n = int(input('Digite um número:'))
print('O dobro de {} vale {}'.format(n,n*2))
print('O triplo de {} vale {}'.format(n,n*3))
r = n**(1/2)
print('A raiz quadrada de {} é igual a {:.2f}'.format(n,r))
