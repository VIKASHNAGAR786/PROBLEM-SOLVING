n = 370
temp = n
k = 0
result = 0

length = len(str(n))
for i in range(length):
    k = int(temp%10)
    temp = temp/10
    result += pow(k,length)

print(result)

if result==n:
    print(f"armstrong {n} number")
else:
    print("not armstrong number")