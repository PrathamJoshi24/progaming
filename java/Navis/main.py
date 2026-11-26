"Navis.py"

import Profiles as prof
import commandpannel as cp
from getpass import getpass as gp

command=""
username=input("username: ")
password=gp("password: ")


if password=="2461535" and "stark"==username:
    prof.profile1()
    cp.command_panel()

elif password=="stark_int." and username=="mark1":
    prof.profile2()
    cp.command_panel()

elif username=="guest":
    name="guest_account"
    cp.command_panel()

else:
    print("wrong username or password")
 