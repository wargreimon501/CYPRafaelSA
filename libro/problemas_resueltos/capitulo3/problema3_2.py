SUMMER=0
BAND="T"
I=0
while (I<=1800):
    SUMMER=SUMMER+1
    print(f"{I}")
    if BAND=="T":
        BAND="F"
        I=I+3
    else:
        BAND="F"
        I=I+2
print(f"{SUMMER}")

