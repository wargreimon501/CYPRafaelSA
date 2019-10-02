NUM=int(input("dame tu numero:"))
V=int(input("dame un numero entero:"))
if NUM==1:
    VAL=100*V
    print(f"el numero {NUM} y valor de v {V} es resultado es {VAL}")
if NUM==2:    
    VAL=100**V
    print(f"el numero {NUM} y valor de v {V} es resultado es {VAL}")
if NUM==3:
    VAL=100/V
    print(f"el numero {NUM} y valor de v {V} es resultado es {VAL}")
if NUM==NUM and NUM!=1 and NUM!=2 and NUM!=3:
    VAL=0
    print(f"el numero {NUM} y valor de v {V} es resultado es {VAL}")
