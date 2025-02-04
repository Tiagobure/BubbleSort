# Bubble Sort
***
Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, 
compares adjacent elements, and swaps them if they are in the wrong order. 
The pass through the list is repeated until the list is sorted.
Here's a step-by-step explanation and implementation:

---
O Bubble Sort é um algoritmo simples de ordenação que percorre repetidamente uma lista, 
compara elementos adjacentes e os troca se estiverem na ordem errada. 
O processo é repetido até que a lista esteja completamente ordenada.
Abaixo está uma explicação passo a passo e uma implementação:
***
Exemplo

Vamos ordenar a lista [5, 3, 8, 4, 6] usando o Bubble Sort:

## Pass 1:

   - Compare 5 e 3 → Troca → [3, 5, 8, 4, 6]

   - Compare 5 e 8 → Não troca → [3, 5, 8, 4, 6]

   - Compare 8 e 4 → Troca → [3, 5, 4, 8, 6]

   - Compare 8 e 6 → Troca → [3, 5, 4, 6, 8]

## Pass 2:

   - Compare 3 e 5 → Não troca → [3, 5, 4, 6, 8]

   - Compare 5 e 4 → Troca → [3, 4, 5, 6, 8]

   - Compare 5 e 6 → Não troca → [3, 4, 5, 6, 8]

   - Compare 6 e 8 → Não troca → [3, 4, 5, 6, 8]

## Pass 3:

   - Nenhuma troca é necessária, então a lista está ordenada.

***
Time Complexity

   - Worst Case: O(n2)O(n2) (when the list is in reverse order)

   - Best Case: O(n)O(n) (when the list is already sorted)

   - Average Case: O(n2)O(n2)

Space Complexity

   - O(1)O(1) (in-place sorting, uses constant extra space)
