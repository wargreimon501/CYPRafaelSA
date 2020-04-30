import funciones_casa

from funciones_casa import*
x=int(input("dame el radio de la esfera ;"))
a=araeaesfera(x)
vol=(4/3)*3.1416*x**3
print(f"el area de la esfera es {a} y su volumen {vol}")
