class CompanyModel:
     
    def __init__(self, _name):
        self.name = _name
 
    def SaveFormat(self):
        data = '{0};'.format(self.name)
 
        return data



import requests
from bs4 import BeautifulSoup

url = 'https://find.godpeople.com/?page=total&kwrd=%BC%F61'
response = requests.get(url)
soup = BeautifulSoup(response.text, 'html.parser')

tbody = soup.select_one('tbody')

companyList = []
print(tbody)
for tr in tbody.select('td'):
    name = tr.select('bN')[2].text    
  
    company = CompanyModel(name)
    companyList.append(company)
    
print(companyList)