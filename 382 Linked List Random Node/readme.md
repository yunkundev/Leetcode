#  382. Linked List Random Node

Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.

Follow up:
What if the linked list is extremely large and its length is unknown to you? Could you solve this efficiently without using extra space?

### Solution:

This problem mainly introduce a new knowledge to me : Reservoir Sampling

This is the supplement of knowledge about Reservoir Sampleing (very important)

Problem:

Choose k entries from n numbers. Make sure each number is selected with the probability of k/n

Basic idea:

Choose 1, 2, 3, ..., k first and put them into the reservoir.

For k+1, pick it with a probability of k/(k+1), and randomly replace a number in the reservoir.

For k+i, pick it with a probability of k/(k+i), and randomly replace a number in the reservoir.

Repeat until k+i reaches n
