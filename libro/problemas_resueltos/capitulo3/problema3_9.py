SERIE=0
N=int(input("dame un numero :"))
i=1
while (i<=N):
    SERIE=SERIE+i**i
    i=i+1
print(f"{SERIE}")
