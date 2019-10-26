SERIE=0
N=int(input("dame el numero de termino de la serie ;"))
BAND="T"
i=1
while (i<=N):
    if (BAND=="T"):
        SERIE=SERIE+(1/i)
        BAND="F"
    else:
        SERIE=SERIE-(1/i)
        BAND="T"
    i=i+1
print(f"la serie es {SERIE}")
