import math
x1=int(input("dame el valor de x1 "))
x2=int(input("dame el valor de x2 "))
x3=int(input("dame el valor de x3 "))
y1=int(input("dame el valor de y1 "))
y2=int(input("dame el valor de y2 "))
y3=int(input("dame el valor de y3 "))

q=math.sqrt((x1-x2)**2+(y1-y2)**2)

d=math.sqrt((x2-x3)**2+(y2-y3)**2)

s=math.sqrt((x3-x1)**2+(y3-y1)**2)
per=q+d+s

print(f"{per}")
a=float(input("dame el angulo que quieres que saque su tanjente "))
b=sin(a)
c=cos(a)
res=b/c
print(f"la tanjente del anculo {a} es {res}")
