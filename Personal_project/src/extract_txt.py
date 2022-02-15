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
chapter = 1

i = 1
print(str(i)+"장")
while i < (chapter + 1) :
    
    c = format(i, '02')
    readF = f.readline()
    if readF[1:3] == str(c):
        results = re.sub('^창'+str(c)+':\d+' + ' ',"",readF)
        print(results)
       
    else:
        i += 1
        print(str(i)+"장")
        continue
        