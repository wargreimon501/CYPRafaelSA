CUECER=0
N=int(input("dame un numero entero positivo :"))
for I in range(0,N,1):
    NUM=int(input("ingresa un entero: "))
    if NUM==0:
        CUECER +=1
print(f"el numero de 0 capturados fue , {CUECER}")
