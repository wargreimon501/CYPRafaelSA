MAY=-100000
MEN=100000
N=int(input("dame el numero entero :"))
i=1
for i in range(N):
    NUM=int(input("dame el numero :"))
    if NUM>MAY:
        MAY=NUM
    else:
        NUM < MEN
        MEN=NUM
    i=i+1
print(f"el numero mayor  es {MAY} el numero menor es {MEN}")
