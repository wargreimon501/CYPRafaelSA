ARSU=0
ARNO=0
MES=0
MERSU=50000
ARCE=0
for i in range(1,13,1):
    print(f"mes (i)")
    RNO=int(input("promedi de lluvia del mes de la zona norte "))
    RCE=int(input("promedi de lluvia del mes de la zona centro "))
    RSU=int(input("promedi de lluvia del mes de la zona sur "))

    ARNO= ARNO + RNO
    ARCE=ARCE + RCE
    ARSU=ARSU + RSU

    if RSU<MERSU:
        MERSU=RSU
        MES=i
PROCE=ARCE / 12
print(f"promedio region centro:{PROCE}")
print(f"mes con menor lluvia en reg. sur :{MES}")
print(f"registo del mes con menor lluvia es: {MERSU}")


if ARNO> ARCE:
    if ARNO > ARSU:
        print(f"la region con mayor lluvia es la region norte")
    else:
            print(f"la region con mayor lluvia es la region sur")
elif ARCE> ARSU :
    print(f"la region con mayores lluvias es la region centro")
else:
    print(f"la region on mayores lluvias es la region sur")
print("fin")
