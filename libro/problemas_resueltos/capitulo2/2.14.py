TIPOENF=int(input("dime que tipo de enfermedad tiene :"))
EDAD=int(input("dame la edad del paciente :"))
DIAS=int(input("dime el numero de dias que estara el pasiente :"))
if TIPOENF==1:
    COSTOT=DIAS*25
elif TIPOENF==2:
    COSTOT=DIAS*16
elif TIPOENF==3:
    COSTOT=DIAS*20
elif TIPOENF==4:
    COSTOT=DIAS*32
elif EDAD>=14 and EDAD<=22:
    COSTOT=COSTOT*1.10
    print(f"{COSTOT}")
print(f"el conto por el pasiente es {COSTOT}")
