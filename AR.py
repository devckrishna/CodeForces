for _ in range(int(input())):
    D,d,P,q=map(int,input().split())
    i=0
    days,rem=D//d,D%d
    sum= days*P*d+ ((days)*(days-1)//2)*q*d
    if rem!=0:
        sum+=(P+(days)*q)*rem
    print(sum)