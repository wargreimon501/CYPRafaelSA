SUMPAR=0
SUMIMP=0
CUEPAR=0
i=1
while (i!=-1):
    NUM=int(input("dame un numero entre :"))
    if NUM!=0:
        if (-1**NUM)>0:
            SUMPAR=SUMPAR+NUM
            CUEPAR=CUEPAR + 1
        else:
            SUMIMP=SUMIMP+1
    i=i+1
PROPAR=SUMPAR/CUEPAR
print("{PROPAR} , {SUMIPM}")
