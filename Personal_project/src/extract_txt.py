import re
f = open('Personal_project/Gen.txt', 'r')

chapter = 3
i = 1
readF = f.readline()

while i <= chapter:
    num_chap = format(i, '02')
    
    results = re.sub('^창'+num_chap+':\d+'+' ',"",readF)
    
    if readF[1:3] == num_chap:
        print(str(i)+"장")
        
    while readF[1:3] == num_chap:
        print(results)
        readF = f.readline()
        results = re.sub('^창'+num_chap+':\d+'+' ',"",readF)
        
    i += 1
    
 