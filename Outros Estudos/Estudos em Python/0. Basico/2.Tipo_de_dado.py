# Faça um programa que leia algo pelo teclado 
# mostre na tela o seu tipo primitivo 
# e todas as informações possíveis

var = input('Digite algo:')
print('O tipo primitivo desse valor é:', type(var))
print('só tem espaços?', var.isspace())
print('é um número?', var.isnumeric())
print('é alphabético?', var.isalpha())
print('é alphanúmerico?', var.isalnum())
print('está em maisculo?', var.isupper())
print('está em minusculo?', var.islower())
print('está em capitalizada?', var.istitle())
