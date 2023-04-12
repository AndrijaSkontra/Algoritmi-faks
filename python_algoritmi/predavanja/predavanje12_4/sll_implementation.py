class Node:

    def __init__(self, element, next_node):
        self.__element = element # nesto najblize za private __
        self.__next = next_node

    @property
    def element(self): # getter u pythonu
        return self.__element

    @element.setter
    def element(self, element):
        self.__element = element

    @property
    def next(self):
        return self.__next

    @next.setter
    def next(self, next_node):
        self.__next = next_node

    def __repr__(self):
        return f"NODE[{self.element}] -> {self.next}"


class SLL:

    def __init__(self):
        self.__head = None
        self.__tail = None
        self.__size = 0

    @property
    def size(self):
        return self.__size

    @size.setter
    def size(self, value):
        self.__size = value

    @property
    def head(self):
        return self.__head

    @head.setter
    def head(self, node_head):
        self.__head = node_head

    def is_empty(self):
        return self.size == 0

    def add_first(self, element):
        node = Node(element, None)
        if self.is_empty():
            self.head = node
            self.__tail = self.head
        else:
            node.next = self.head
            self.head = node
        self.size += 1
        print("new element at first pos!")

    def __repr__(self):
        pass


if __name__ == '__main__':
    """
    node = Node(10, None)
    node.element = 100
    node_1 = Node(-100, None)
    node.next = node_1
    print(node)
    """
    sll = SLL()
    print(f"size -> {sll.size}")
    sll.add_first(10)
    print(f"size -> {sll.size}")
