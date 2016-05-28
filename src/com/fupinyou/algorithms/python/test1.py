import os
os.chdir('D:\\Python27\\Lib\\site-packages')

from pytesser import *

image = Image.open("fnord.tif")
print image_to_string(image)