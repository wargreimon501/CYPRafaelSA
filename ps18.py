import funciones_casa
from funciones_casa import*
x=int(input("dame el valor del radio del cono :"))
y=int(input("dame el valor de la generetriz :"))
altu=float(input("dame el valor de la altura del cono :"))
w=areabase(x)
s=arealateral(x,y)
ar=w+s
vol=(1/3)*w*altu
q=sumar(x,y)
print(f" el area de la base de tu cono es {w}, el area lateral de tu cono  {s} el area total de tu cono es {ar} y el voimen de tu cono es  {vol}")

