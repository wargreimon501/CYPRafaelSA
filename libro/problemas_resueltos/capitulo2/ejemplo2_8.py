CATE=int(input("dame tu categoria :"))
SUE=float(input("da me tu misero sueldo :"))
NSUE=0
if CATE==1:
    NSUE=SUE*1.15
elif CATE==2:
    NSUE=SUE*1.10
elif CATE==3:
    NSUE=SUE*1.08
elif CATE==4:
    NSUE=SUE*1.07
print(f" tu nuevo salario es {NSUE}")
