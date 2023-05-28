class Stack:

    def __init__(self):
        self.__size = 0
        self.__structure = []

    def is_empty(self):
        return self.__size == 0

    def top(self):
        if self.is_empty():
            print("Stack is empty nothing to show")
        else:
            return self.__structure[self.__size - 1]

    def pop(self):
        elem = None
        if self.is_empty():
            print("Stack is empty nothing to pop")
        else:
            self.__size -= 1
            elem = self.__structure.pop()
        return elem

    def push(self, element):
        self.__size += 1
        self.__structure.append(element)

    def size(self):
        return self.__size

    def __repr__(self):
        return self.__structure.__repr__() + " - size: " + self.__size.__repr__()


if __name__ == '__main__':
    stog = Stack()
    print(stog.is_empty())

    stog.push(12)
    print(stog.is_empty())
    stog.push(12)
    stog.push(11)
    stog.push(15)

    print(stog)

    stog.pop()

    print(stog)

    stog.pop()

    print(stog)

    print(stog.is_empty())

    stog.push(89)

    print(stog.top())
