import random

TYPE = "P3"
WIDTH = 500
HEIGHT = 500
COLORS = "255"

ppm = TYPE + " " + str(WIDTH) + " " + str(HEIGHT) + " " + COLORS + " "

for x in range(0, WIDTH * HEIGHT):
  for y in range(0,3):
    rgb = random.randint(0, 255)
    ppm += str(rgb) + " "

pic = open("pic.ppm", "w")
pic.write(ppm)
pic.close