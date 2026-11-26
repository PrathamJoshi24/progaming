import pygame as pg
from numba import njit
from random import randint,random


@njit(fastmath = True)
def run():
    ll = 0
    w = 0
    wow = range(1,100)
    while True:
        for j in range(1,390000):
            for i in range(1,390000):
                if j+1==i:
                  w+=1
                else:
                  ll+=1
        break
    print(ll)
    print(w)
    
time = pg.time.Clock()
run()
print(f"secons={time.tick()/1000}s")
