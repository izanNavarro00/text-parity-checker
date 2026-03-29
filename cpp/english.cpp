#include <iostream>
#include <vector>
#include <string>

bool isEven(std::string text) {
    if (text.empty()) return false;
    
    std::string lastWord = text.substr(text.find_last_of(" ") + 1);
    std::vector<std::string> odds = {"one", "three", "five", "seven", "nine", "eleven", "thirteen", "fifteen", "seventeen", "nineteen"};
    
    for (const std::string& odd : odds) {
        if (lastWord.size() >= odd.size() && 
            lastWord.compare(lastWord.size() - odd.size(), odd.size(), odd) == 0) {
            return false;
        }
    }
    return true;
}
