# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""

from flask import Flask

app=Flask(__name__)

@app.route('/')
def hello():
    return("Welcome to Smartinternz")
@app.route('/data/')
def fun():
    print("This is fun function")
    return("Hello there!")
    
if __name__ == '__main__':
    app.run(debug=True)