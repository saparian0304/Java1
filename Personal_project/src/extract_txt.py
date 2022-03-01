import re
list_oldBible = ["창세기", "출애굽기", "레위기", "민수기", "신명기", "여호수아", "사사기", "룻기", "사무엘상", "사무엘하", "열왕기상", "열왕기하", "역대상", "역대하", "에스라", "느헤미야", "에스더", "욥기", "시편", "잠언", "전도서", "아가", "이사야", "예레미야", "예레미야애가", "에스겔", "다니엘", "호세아", "요엘", "아모스", "오바댜", "요나", "미가", "나훔", "하박국", "스바냐", "학개", "스가랴", "말라기"]

ap_list = ["창", "출", "레", "민", "신", "수", "삿", "룻", "삼상", "삼하", "왕상", "왕하", "대상", "대하", "스", "느", "에", "욥", "시", "잠", "전", "아", "사", "렘", "애", "겔", "단", "호", "욜", "암", "옵", "욘", "미", "나", "합", "습", "학", "슥", "말"]

num_oldbible = [50, 40, 27, 36, 34, 24, 21, 4, 31, 24, 22, 25, 29, 36, 10, 13, 10, 42, 150, 31, 12, 8, 66, 52, 5, 48, 12, 14, 3, 9, 1, 4, 7, 3, 3, 3, 2, 14, 4]


k=0
for k in range(39):
    f = open('Personal_project/oldbible/{0}.txt'.format(list_oldBible[k]), 'r')

    chapter = num_oldbible[k]
    i = 1
    readF = f.readline()

    while i <= chapter:
        num_chap = format(i, '02')
        
        results = re.sub('^{0}'.format(ap_list[k])+num_chap+':\d+'+' ',"",readF)
        
        # 1~99장일 경우
        if readF[1:3] == num_chap or readF[2:4] == num_chap:
            write_f = open('Personal_project/bible/{0}_{1}{2}.txt'.format(list_oldBible[k], num_chap,"장"), 'w')

            # print(str(i)+"장")
            
        while readF[1:3] == num_chap or readF[2:4] == num_chap:
            # print(results)
            write_f.write(results)
            readF = f.readline()
            results = re.sub('^{0}'.format(ap_list[k])+num_chap+':\d+'+' ',"",readF)
            
        # 100장 이상일 경우
        if readF[1:4] == num_chap:
            write_f = open('Personal_project/bible/{0}_{1}{2}.txt'.format(list_oldBible[k], num_chap,"장"), 'w')

            # print(str(i)+"장")
            
        while readF[1:4] == num_chap:
            # print(results)
            write_f.write(results)
            readF = f.readline()
            results = re.sub('^{0}'.format(ap_list[k])+num_chap+':\d+'+' ',"",readF)
            
        i += 1
        
