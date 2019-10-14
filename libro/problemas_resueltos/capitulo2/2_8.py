COMPRE=float(input("cuanto compraste :"))
if COMPRE<500:
    PAGAR=COMPRE
elif COMPRE <=1000:
        PAGAR=COMPRE-(COMPRE*0.05)
elif COMPRE<=7000:
    PAGAR=COMPRE-(COMPRE*0.11)
elif COMPRE<=15000:
    PAGAR=COMPRE-(COMPRE*0.18)
else:
    PAGAR=COMPRE-(COMPRE*0.25)
print(f"{PAGAR}")
        
