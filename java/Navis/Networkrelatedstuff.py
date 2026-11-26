"Nrs.py"

from bs4 import BeautifulSoup as bs
import requests as rq
import urllib
from urllib.request import urlopen

def check_inter():
    try:
        req=rq.get("https://www.google-print.com",timeout=3)
        return True
    except rq.exceptions.ConnectionError:
        return False

def temp(area):
    location=area[-1]
    search=f"temprature in {location}"
    url=f"https://www.google.com/search?q={search}"
    r=rq.get(url)
    data=bs(r.text,"html.parser")
    temprature=data.find("div",class_="BNeawe").text
    print(temprature)


def full_name(company):
     search=f"price of shares of {company[-1]}"
     url=f"https://www.google.com/search?q={search}"
     r=rq.get(url)
     data=bs(r.text,"html.parser")
     price=data.find("div",class_="BNeawe").text
     print(price)

def web(sf):
    search=sf
    url=f"https://www.google.com/search?q=meaning of {search[-1]}"
    r=rq.get(url)
    data=bs(r.text,"html.parser")
    info=data.find("div",class_="BNeawe").text
    print(info)

def full_form(comand_f_list):
    ff=comand_f_list[-1]
    search=f"full form of {ff}"
    url=f"https://www.google.com/search?q={search}"
    r=rq.get(url)
    data=bs(r.text,"html.parser")
    full_form=data.find("div",class_="BNeawe").text
    print(full_form)
