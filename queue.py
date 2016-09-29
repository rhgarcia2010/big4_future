class Node(object):

    def __init__(self, val):
        self.info = val
        self.next = None

class Queue(object):
    def __init__(self):
        self.size = 0
        self.head = None

    def isEmpty(self):
        return self.size == 0

    def enqueue(self, val):
        newNode = Node(val);

        if self.head is None:
            self.head = newNode
        else:
            last = self.head
            while last.next:
                last = last.next
            last.next = newNode
        self.size = self.size + 1

    def dequeue(self):

        if self.isEmpty():
            return None

        info = self.head.info
        self.head = self.head.next
        self.size = self.size - 1
        return info
