function isEven(text) {
    if (!text || text.trim() === "") return false;
    
    const words = text.toLowerCase().trim().split(/\s+/);
    const lastWord = words[words.length - 1];
    
    const odds = ["one", "three", "five", "seven", "nine", "eleven", "thirteen", "fifteen", "seventeen", "nineteen"];
    
    return !odds.some(odd => lastWord.endsWith(odd));
}
