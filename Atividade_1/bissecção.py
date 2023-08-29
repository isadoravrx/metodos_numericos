import math
import numpy
a = float(input("insira o valor de a: "))
b = float(input("insira o valor de b: "))
erroAceit = float(input("insira o valor do erro aceitável: "))

#utlizando a funcao x² + ln(x)
while (True):
    c = (a + b) / 2
    

    erro = abs(c - a)
    
    if erro <= erroAceit:
        print(f"{c}")
        break

    print(f"{c} ", end='')
    if ((pow(a,2) + numpy.log(a)) * (pow(c,2) + numpy.log(c))) < 0:
        b = c
    elif((pow(c,2) + numpy.log(c)) * (pow(b,2) + numpy.log(b)) < 0):
        a = c
    
    
