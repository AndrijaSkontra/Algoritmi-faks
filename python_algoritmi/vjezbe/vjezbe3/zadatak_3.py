class MyNode:

    def __init__(self, element, next_node):
        self.__element = element
        self.__myNext = next_node

    @property
    def element(self):  # getter for element
        return self.__element

    @element.setter
    def element(self, element):  # setter for element
        self.__element = element

    @property
    def next(self):
        return self.__myNext

    @next.setter
    def next(self, next_node):
        self.__myNext = next_node

    def __repr__(self):
        if self.__element is None:
            return f"None"
        else:
            return f"NODE[element: {self.__element}, next node: {self.__myNext}]"


class SingleLinkedList:

    def __init__(self):
        self.__head = MyNode(None, None)
        self.__tail = MyNode(None, None)
        self.__size = 0

    def size(self):
        return self.__size

    def is_empty(self):
        return self.__size == 0

    def add_first(self, element):
        new_node = MyNode(element, self.__head)
        self.__head = new_node
        if self.__size == 0:
            self.__tail = self.__head
        self.__size += 1

    def add_last(self, element):
        if self.is_empty():
            self.add_first(element)
        else:
            new_node = MyNode(element, None)
            self.__tail.next = new_node
            self.__tail = new_node
            self.__size += 1

    def clear(self):
        self.__head = MyNode(None, None)
        self.__tail = MyNode(None, None)
        self.__size = 0

    def contains_element(self, element):
        contains = False
        if self.is_empty():
            print("List is empty nothing to search")
        else:
            temp = self.__head
            for i in range(self.__size):
                if temp.element == element:
                    contains = True
                    break
                temp = temp.next
        return contains

    def get_first(self):
        if self.is_empty():
            print("There is no first element, because list is empty!")
        else:
            return self.__head.element

    def get_last(self):
        if self.is_empty():
            print("There is no first element, because list is empty!")
        else:
            return self.__tail.element

    def insert(self, index, element):
        if (index < 0) or (index > self.__size):
            print("index out of bounds")
        elif(self.is_empty()) or (index == 0):
            self.add_first(element)
        elif index == self.__size:
            self.add_last(element)
        else:
            temp = self.__head
            for i in range(index - 1):
                temp = temp.next
            print(temp.element)
            new_node = MyNode(element, temp.next)
            temp.next = new_node
            self.__size += 1

    def remove_first(self):
        if self.is_empty():
            print("nothing to remove...")
        else:
            temp = self.__head
            self.__head = self.__head.next
            temp.next = None
            self.__size -= 1

    def remove_last(self):
        if self.is_empty():
            print("can't remove because its empty")
        else:
            temp = self.__head
            for i in range(self.__size - 2):
                temp = temp.next
            temp.next = None
            self.__tail = temp
            self.__size -= 1

    def remove(self, index):
        if (index < 0) or (index > self.__size):
            print("index out of bounds")
        elif index == 0:
            self.remove_first()
        elif index == self.__size - 1:
            self.remove_last()
        else:
            temp = self.__head
            for i in range(index - 1):
                temp = temp.next
            temp2 = temp.next
            temp.next = temp2.next
            temp2.next = None
            self.__size -= 1

    def __repr__(self):
        return f"SLL[head = {self.__head}, tail = {self.__tail}, size = {self.__size}]"


if __name__ == '__main__':

    # testing SingleLinkedList
    my_list = SingleLinkedList()
    my_list.add_last(2)
    my_list.add_first(1)
    print(my_list)
    my_list.clear()
    print(my_list)
    my_list.add_first(1)
    my_list.add_last(2)
    print(my_list)
    print(f"List contains 2: {my_list.contains_element(2)}")
    print(f"List contains 1: {my_list.contains_element(1)}")
    print(f"List contains 51: {my_list.contains_element(51)}")
    print(f"First element od the list is: {my_list.get_first()}")
    print(f"Last element od the list is: {my_list.get_last()}")
    my_list.insert(2, 123)
    my_list.insert(0, 321)
    my_list.insert(1, 456)
    my_list.insert(2, 987)
    print(my_list)
    my_list.remove(0)
    print(my_list)
    my_list.remove(4)
    print(my_list)
    my_list.remove(1)
    print(my_list)
