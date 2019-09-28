A=float(input("dame el valor a   :"))
B=float(input("dame es valor b  :"))
C=float(input("dame el valor c:"))
DIS=B**2-4*A*C
if DIS>0:
    X1=((-B)+DIS**0.5)/(2*A)
    X2=((-B)-DIS**0.5)/(2*A)
    print(f" es valor de dis es {DIS} Y los valores de las raices de x1 es {X1} y de x2 es {X2}")
print("fin de la condicional paso 3")
