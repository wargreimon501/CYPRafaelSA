MEN=0
CHI=0
GRA=0
N=int(input("cuantas ventas realisastes :"))
i=1
for i in range(N):
    V=float(input("indicame cuanto vendiste :"))
    if V<=200:
        CHI=CHI+1
    elif V<400:
        MEN=MEN+1
    else:
        GRA=GRA+1
    i=i+1
print(f"las ventas menores a 200 fueron {CHI}. las ventas entre 200 y 400 fueron {MEN} y las ventas mayores de 400 son {GRA}")
