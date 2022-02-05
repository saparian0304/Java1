# 구절정보 제거하기
'''
import re
f = open('Personal_project/Gen.txt', 'r')

i = 0
while i < 50 :
    readF = f.readline()
    results = re.sub('^창[0][1]:\d+' ' ',"",readF)
    print(results)
    i += 1
''' 
# 장별로 나누기
import re
f = open('Personal_project/Gen.txt', 'r')

i = 0
while i < 50 :
    readF = f.readline()
    if readF[1:3] == "01":
        results = re.sub('^창[0][1]:\d+' ' ',"",readF)
        print(results)
        i += 1
    else:
        continue