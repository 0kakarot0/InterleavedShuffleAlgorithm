# InterleavedShuffleAlgorithm
This Java program, named ShuffleNumbers, generates a list of six unique, non-consecutive numbers from the range 0 to 9. The main principle of the algorithm used in this program is to separate even and odd numbers, shuffle them independently, and then interleave them, guaranteeing that no two consecutive numbers will be adjacent in the final list.

# ShuffleNumbers

## Description
ShuffleNumbers is a Java program that generates a list of six unique, non-consecutive numbers ranging from 0 to 9. The algorithm used in this program separates even and odd numbers, shuffles them independently, and then interleaves them, ensuring that no two consecutive numbers will be adjacent in the final list.

## Algorithm (Interleaved Shuffle Algorithm)
1. **Initialization**: Create lists for even numbers, odd numbers, and the numbers 0-9.
2. **Selection**: Shuffle the list of numbers and select the first six numbers.
3. **Separation**: Separate the selected numbers into even and odd.
4. **Shuffling**: Shuffle the lists of even and odd numbers separately.
5. **Interleaving**: Interleave the even and odd lists by alternately taking a number from each.
6. **Output**: Print out the resulting list of six shuffled numbers.

## Challenges
The main challenge with this algorithm is that it doesn't generate all possible permutations of non-consecutive numbers. Certain patterns are impossible due to separating the numbers into even and odd. Moreover, the distribution of generated sequences is not uniform; some sequences are more likely to be created than others.

Another challenge is that the algorithm is designed to work with a specific number of elements (six in this case). For a different number of elements or a different range of numbers, the algorithm would need to be adjusted.

## Possible Enhancements
1. **Uniform Distribution**: Improve the algorithm to ensure that all possible sequences of non-consecutive numbers are generated with equal probability. This might require a more complex combinatorial algorithm.
2. **Flexibility**: Modify the algorithm to work with a variable number of elements and different ranges of numbers.
3. **Performance**: The current algorithm has a time complexity of O(n), where n is the number of elements. It could be optimized for larger lists or ranges of numbers.
4. **Testing**: Develop a comprehensive suite of unit tests to ensure the correctness of the algorithm under various conditions.

## How to Run
Compile the Java file and run the `ShuffleNumbers` program. The program does not require any specific arguments.

```shell
javac ShuffleNumbers.java
java ShuffleNumbers
```
## License
This project is licensed under the MIT License. Refer to the LICENSE file for more information.

## Author
Ahtisham Ilyas

## Contact
For any inquiries or issues, please contact [Your Email].

Enjoy generating unique, non-consecutive numbers with ShuffleNumbers!
