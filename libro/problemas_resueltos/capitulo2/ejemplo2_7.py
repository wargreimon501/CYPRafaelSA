NUM=int(input("dame tu numero:"))
V=int(input("dame un numero entero"))
VAL=0
if NUM==1:
    VAL=100*V
elif NUM==2:    
    VAL=100**V
elif NUM==3:
    VAL=100/V 
else:        
    VAL=0
print(VAL)
