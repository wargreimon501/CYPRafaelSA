CLAVE=int(input("dame el numero de clave :"))
NUMIN=int(input("cuantos minutos hablaste :"))
if CLAVE==12:
    COST=NUMIN*2
if CLAVE==15:
    COST=NUMIN*2.2
if CLAVE==18:
    COST=NUMIN*4.5
if CLAVE==19:
    COST=NUMIN*3.5
if CLAVE==23:
    COST=NUMIN*6 
if CLAVE==25:
    COST=NUMIN*6
if CLAVE==29:
    COST=NUMIN*5
print(f"el precio de la llamada es", COST)
