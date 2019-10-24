N=int(input("ingrese un numero entero de veces de repeticion :"))
I=1
CUECER=0
NUM=0
for I in range(0,N,1):
    NUM=int(input("dame el valor del numero"))
    if NUM==0 :
        CUECER=CUECER+1
    else:
        I=I+1
print(f"{CUECER}")

