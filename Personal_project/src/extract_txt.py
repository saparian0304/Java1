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
chapter = 40

i = 1

while i < (chapter+2) :
    
    c = format(i, '02')
    readF = f.readline()
    if readF[4:6] == "01":
        if  i == chapter+1 :
            break
        else:
            print(str(i)+"장")
            results = re.sub('^창'+str(c)+':\d+'+' ',"",readF)
            print(results)
            i += 1
       
    else:
        results = re.sub('^창'+format(i-1,'02')+':\d+' + ' ',"",readF)
        print(results)

        continue
        