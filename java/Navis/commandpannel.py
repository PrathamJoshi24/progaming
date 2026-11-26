"Commandpannel.py"

import Fun_file as fun
import Calculator as calc
import Data
import Xlsx as xl
import networkrelatedstuff as nrs
import Profiles as prof
import OpenAi as cbot
import Chatbot as cb


def command_panel():

    #main pannel

    while True:

        #command prompt

        command=input("> ")
        comand=command.split(" ")

        # true/false

        joke="joke" in comand
        calc=("calculator" in comand or "calculate" in comand)
        excel="excel" in comand
        full_forms=("full" in comand and "form" in comand)
        temp=("temp" in comand or "temprature" in comand or "tempratere" in comand or "temprateure"in comand)

        # if_else statements

        if command=="what is my name":
            print("your name is pratham")

        elif command=="sleep" or command=="exit":
            Data.sleep_func()
            break
        
        elif command=="change_pass":
            change_pass()

        elif joke==True:
            fun.jokes()

        elif calc==True:
            Calc.final_awnser(comand)

        elif excel==True:
            xl.file()

        elif temp==True:
            nrs.temp(comand)

        elif command=="full_company_name":
            nrs.full_name(comand)

        elif full_forms==True:
            nrs.full_form(comand)

        elif command=="search for" or command=="web search":
            nrs.web(comand)

        elif "internet" in comand:
            print(nrs.check_inter())

        else:
            cbot.ai(command)


#------------------over-----------------#
