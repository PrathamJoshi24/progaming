"Chatbot.py"

import random as rd

def ofline_chat(comannd):
    greet_=("hello","hey","namaste","welcome","wellcome")
    greet_user=("welcome sir",
                "welcome to the dumbest ai **NAVIS**",
                "namaste my owner"
                )

    sad=("died","failed","murdered","failing")
    sad_user=("time passes sir","it's alright sir")
    happy=("created","passed","lived","fine","compleated")
    happy_user=("that's great sir","wow you are great my owner")
    fav_car_user=("fav","car")
    fav_car="lamborghini"
    fav_bike_user=("fav","bike")
    fav_bike="kavasaki ninja"

    #command_list
    
    command_list=comannd.split(" ")
    
    #for loop
    def forloop():
        for words in command_list:
            if words in greet_:
                reply=rd.choice(greet_user)
                return reply
            elif sad in command_list:
                reply=rd.choice(sad_user)
                return reply
            elif happy in command_list:
                reply=rd.choice(happy_user)
                return reply
            elif fav_car_user in command_list:
                reply=fav_car
                return reply
            elif fav_bike_user in command_list:
                reply=fav_bike
                return reply
    final_awnser=forloop()
    if final_awnser==None:
        print("i am not unerstanding that")
    else:
        print(final_awnser)
