SUMGAS=0
GASTO=int(input("dame lo que gastastes : "))
while (GASTO != -1 ):
    SUMGAS=SUMGAS + GASTO
    GASTO=int(input("dame lo que gastastes de mas : "))
print(f"lo que gastastes  en total fue {SUMGAS}")
