SUE=int(input("dame tu misero sueldo :"))
CATE=int(input("dame tu categoria de tabajador :"))
HE=int(input("dime cuentas horas trabajaste :"))
if CATE==1:
    PHE=30
elif CATE ==2:
    PHE=38
elif CATE==3:
    PHE=50
elif CATE==4:
    PHE=70
elif CATE==CATE and CATE!=1 and CATE!=2 and CATE!=3 and CATE!=4:
    PHE=0
if HE >30:
    NSUE=SUE+30*PHE
else:
    NSUE=SUE+HE*PHE
print(f"tu nuevo sueldo es {NSUE}")
