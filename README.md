# Table of Contents
1. [Introduction](#introduction)
2. [Key Characteristics of Dynamic Programming](#key-characteristics-of-dynamic-programming)
   1. [Optimal Substructure](#optimal-substructure)
   2. [Overlapping Subproblems](#overlapping-subproblems)
3. [Common Examples of Dynamic Programming Problems](#common-examples-of-dynamic-programming-problems)
   1. [Calculating the Fibonacci Sequence](#calculating-the-fibonacci-sequence)
   2. [Shortest Path Problems](#shortest-path-problems)
   3. [Longest Common Subsequence Problems](#longest-common-subsequence-problems)
   4. [Knapsack Problems](#knapsack-problems)
   5. [Matrix Chain Multiplication](#matrix-chain-multiplication)
   6. [Coin Change Problems](#coin-change-problems)
4. [Implementing Dynamic Programming](#implementing-dynamic-programming)
   1. [Top-Down (Memoization)](#top-down-memoization)
   2. [Bottom-Up (Tabulation)](#bottom-up-tabulation)
5. [Conclusion](#conclusion)

# Introduction
Dynamic programming is a problem-solving technique used in computer science and mathematics. It's designed to solve complex problems by breaking them down into smaller subproblems and solving each subproblem only once, storing the results and reusing them when needed. Dynamic programming is particularly useful when a problem can be divided into overlapping subproblems, and the same subproblem needs to be solved multiple times.

## Key characteristics of dynamic programming include:

### Optimal Substructure: 
  The problem can be divided into smaller subproblems, and the optimal solution to the original problem can be constructed from optimal solutions to these subproblems.

### Overlapping Subproblems: 
  The same subproblem is encountered multiple times during the computation. To avoid redundant work, dynamic programming stores the results of subproblems and reuses them when needed.

Dynamic programming is typically applied to optimization problems, where the goal is to find the best solution among a set of possible solutions. By solving and storing the results of subproblems, dynamic programming can greatly improve the efficiency of the solution.

## Common Examples of Dynamic Programming Problems
    1. Calculating the Fibonacci sequence.
    2. Finding the shortest path in graph problems (e.g., Dijkstra's algorithm).
    3. Solving longest common subsequence (LCS) problems.
    4. Solving knapsack problems.
    5. Performing matrix chain multiplication.
    6. Handling coin change problems.
## Dynamic programming can be implemented using two main approaches:

### Top-Down (Memoization): 
  In this approach, you start with the original problem and recursively break it down into subproblems. Results of subproblems are stored in a data structure (often a table or dictionary) to avoid recomputation.

### Bottom-Up (Tabulation): 
  In this approach, you solve the subproblems first and then build up to the original problem. You start with the simplest subproblems and iteratively compute more complex subproblems, storing the results in a table.

Dynamic programming is a powerful technique that is commonly used to optimize algorithmic solutions and is essential for solving a wide range of computational problems efficiently.
