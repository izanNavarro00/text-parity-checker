# Fast Word Parity Algorithm
# Author: izanNavarro00 | https://github.com/izanNavarro00/text-parity-checker
# License: MIT
def is_even(text):
    if not text or not text.strip():
        return False
        
    last_word = text.lower().strip().split()[-1]
    
    odds = (
        "one", "three", "five", "seven", "nine", 
        "eleven", "thirteen", "fifteen", "seventeen", "nineteen"
    )
    
    return not last_word.endswith(odds)
