SUMOTR=0
SUMPOS=0
CUEPOS=0
N=int(input("dime el numero de datos que ingresaras :"))
i=1
while (i<=N):
    NUM=int(input("dime el numero :"))
    if NUM>>0:
        SUMPOS=SUMPOS+NUM
        CUEPOS=CUEPOS+NUM
    else:
        SUMOTR=SUMOTR+NUM
    i=i+1
PROGEN=(SUMPOS+SUMOTR)/N
PROPOS=(SUMPOS/CUEPOS)
print(f"el acumulo de numeros positivos son {SUMPOS} el acumulo de numero que noson positivos son {SUMOTR} la cantidad de numeros positivos son {CUEPOS}")
