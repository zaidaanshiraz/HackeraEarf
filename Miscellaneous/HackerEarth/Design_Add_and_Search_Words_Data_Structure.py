class WordDictionary:
    def __init__(self):
        self.words = []

    def addWord(self, word: str) -> None:
        self.words.append(word)

    def search(self, word: str) -> bool:
        for w in self.words:
            if all([c == '.' or c1 == c2 for c1, c2 in zip(w, word)]):
                return True
        return False