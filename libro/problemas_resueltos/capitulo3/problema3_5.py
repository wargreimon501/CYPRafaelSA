SUMOTR=0
SUMPOS=0
CUEPOS=0
N=int(input("dime el numero de datos que ingresaras :"))
i=1
for i in range(N):
    NUM=int(input("dime el numero :"))
    if NUM>=0:
        SUMPOS=SUMPOS+NUM
        CUEPOS=CUEPOS+1
    else:
        SUMOTR=SUMOTR+1
    i=i+1
PROGEN=(SUMPOS+SUMOTR)/N
PROPOS=(SUMPOS/CUEPOS)
print(f"el acumulo de numeros positivos son {SUMPOS} el acumulo de numero que noson positivos son {SUMOTR} la cantidad de numeros positivos son {CUEPOS} {PROGEN} {PROPOS} " )
