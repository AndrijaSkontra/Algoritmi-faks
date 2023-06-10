from typing import Dict

def analiza_recenice(recenica):
    frekvencije = {}
    znakovi = [c for c in recenica if not c.isdecimal() and not c.isspace()]
    znakovi = [c.lower() for c in znakovi]

    for znak in znakovi:
        if znak in frekvencije:
            frekvencije[znak] += 1
        else:
            frekvencije[znak] = 1

    return frekvencije


if __name__ == '__main__':
    words = "23 This is a se78ntence for tesTing - try THIS only one 1!!"
    frek: Dict = analiza_recenice(words)
    sorted_dict = dict(sorted(frek.items(), key=lambda x: ord(x[0])))
    for key, value in sorted_dict.items():
        print(f"Character {key} occurs {value} times.")
