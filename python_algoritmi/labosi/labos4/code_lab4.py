import random

def rand_search(inpt: str, some_word: str):
    list_of_string = inpt.split(" ")
    print(list_of_string)
    random.seed(123)
    status = False

    while len(list_of_string) > 0:
        i = random.randint(0, len(list_of_string))
        print(f"Random index to test: {i}")
        if list_of_string[i] != some_word:
            temp = list_of_string.pop(i)
            print(f"Removing: {temp}")
        else:
            print("Is inside list!")
            status = True
            break
    return status

