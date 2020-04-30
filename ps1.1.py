def suma(x,y):
    return x+y
def resta(x,y):
    return(x-y)
def multiplicacion (x,y):
    return x*y
N=int(input("dame un numero entero"))
M=int(input("dame  otro numero entero"))
a=suma (N,M)
b=resta(N,M)
c=multiplicacion(N,M)
print(f"la suma de esos numeros es {a} , la resta es {b} y la multiplicacion es {c}")
