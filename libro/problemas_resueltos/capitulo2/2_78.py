COMPRE=float(input("cuanto compraste :"))
if COMPRE<500:
    PAGAR=COMPRE
if COMPRE <=1000:
        PAGAR=COMPRE-(COMPRE*0.05)
else:
    if COMPRE<=7000:
            PAGAR=COMPRE-(COMPRE*0.11)
    else:
        if COMPRE<=15000:
                PAGAR=COMPRE-(COMPRE*0.18)
        else:
            PAGAR=COMPRE-(COMPRE*0.25)
print(f"{PAGAR}")
