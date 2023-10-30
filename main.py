import pandas as pd
import matplotlib.pyplot as plt

df = pd.read_csv('results.csv')

df.head()

df.groupby('Tempo De Execução').min()

df.groupby('Tempo De Execução').max()

df.sort_values(by=['Nome Do Algoritmo', 'Tempo De Execução'])

quick_sort_data = df[(df['Nome Do Algoritmo'] == "Quick Sort") & (df['Ordem Do Vetor'] == 'RANDOM')]
merge_sort_data = df[(df['Nome Do Algoritmo'] == "Merge Sort") & (df['Ordem Do Vetor'] == 'RANDOM')]
insertion_sort_data = df[(df['Nome Do Algoritmo'] == "Insertion Sort") & (df['Ordem Do Vetor'] == 'RANDOM')]
selection_sort_data = df[(df['Nome Do Algoritmo'] == "Selection Sort") & (df['Ordem Do Vetor'] == 'RANDOM')]

plt.plot(quick_sort_data['Tamanho Do Vetor'], quick_sort_data['Tempo De Execução'],  marker='o', linestyle='-', color='red', label='Quick Sort')
plt.plot(merge_sort_data['Tamanho Do Vetor'], merge_sort_data['Tempo De Execução'],  marker='o', linestyle='-', color='green', label='Merge Sort')
plt.plot(insertion_sort_data['Tamanho Do Vetor'], insertion_sort_data['Tempo De Execução'],  marker='o', linestyle='-', color='blue', label='Insertion Sort')
plt.plot(selection_sort_data['Tamanho Do Vetor'], selection_sort_data['Tempo De Execução'],  marker='o', linestyle='-', color='black', label='Selection Sort')
plt.ylabel('Tempo de execução em segundos')
plt.xlabel('Tamanho da entrada')
plt.title('Comparação entre os algoritmos (Vetor aleatório)')
plt.legend()
plt.show()

plt.plot(quick_sort_data['Tamanho Do Vetor'], quick_sort_data['Tempo De Execução'],  marker='o', linestyle='-', color='red', label='Quick Sort')
plt.plot(merge_sort_data['Tamanho Do Vetor'], merge_sort_data['Tempo De Execução'],  marker='o', linestyle='-', color='green', label='Merge Sort')
plt.ylabel('Tempo de execução em segundos')
plt.xlabel('Tamanho da entrada')
plt.title('Comparação entre os algoritmos Quick x Merge (Vetor aleatório)')
plt.legend()
plt.show()

plt.plot(insertion_sort_data['Tamanho Do Vetor'], insertion_sort_data['Tempo De Execução'],  marker='o', linestyle='-', color='blue', label='Insertion Sort')
plt.plot(selection_sort_data['Tamanho Do Vetor'], selection_sort_data['Tempo De Execução'],  marker='o', linestyle='-', color='black', label='Selection Sort')
plt.ylabel('Tempo de execução em segundos')
plt.xlabel('Tamanho da entrada')
plt.title('Comparação entre os algoritmos Insertion x Selection (Vetor aleatório)')
plt.legend()
plt.show()

quick_sort_data_ascending = df[(df['Nome Do Algoritmo'] == "Quick Sort") & (df['Ordem Do Vetor'] == 'ASCENDING')]
merge_sort_data_ascending = df[(df['Nome Do Algoritmo'] == "Merge Sort") & (df['Ordem Do Vetor'] == 'ASCENDING')]
insertion_sort_data_ascending = df[(df['Nome Do Algoritmo'] == "Insertion Sort") & (df['Ordem Do Vetor'] == 'ASCENDING')]
selection_sort_data_ascending = df[(df['Nome Do Algoritmo'] == "Selection Sort") & (df['Ordem Do Vetor'] == 'ASCENDING')]

plt.plot(quick_sort_data_ascending['Tamanho Do Vetor'], quick_sort_data_ascending['Tempo De Execução'],  marker='o', linestyle='-', color='red', label='Quick Sort')
plt.plot(merge_sort_data_ascending['Tamanho Do Vetor'], merge_sort_data_ascending['Tempo De Execução'],  marker='o', linestyle='-', color='green', label='Merge Sort')
plt.plot(insertion_sort_data_ascending['Tamanho Do Vetor'], insertion_sort_data_ascending['Tempo De Execução'],  marker='o', linestyle='-', color='blue', label='Insertion Sort')
plt.plot(selection_sort_data_ascending['Tamanho Do Vetor'], selection_sort_data_ascending['Tempo De Execução'],  marker='o', linestyle='-', color='black', label='Selection Sort')
plt.ylabel('Tempo de execução em segundos')
plt.xlabel('Tamanho da entrada')
plt.title('Comparação entre os algoritmos (Vetor Ordenado)')
plt.legend()
plt.show()

plt.plot(quick_sort_data_ascending['Tamanho Do Vetor'], quick_sort_data_ascending['Tempo De Execução'],  marker='o', linestyle='-', color='red', label='Quick Sort')
#plt.plot(merge_sort_data_ascending['Tamanho Do Vetor'], merge_sort_data_ascending['Tempo De Execução'],  marker='o', linestyle='-', color='green', label='Merge Sort')
#plt.plot(insertion_sort_data_ascending['Tamanho Do Vetor'], insertion_sort_data_ascending['Tempo De Execução'],  marker='o', linestyle='-', color='blue', label='Insertion Sort')
plt.plot(selection_sort_data_ascending['Tamanho Do Vetor'], selection_sort_data_ascending['Tempo De Execução'],  marker='o', linestyle='-', color='black', label='Selection Sort')
plt.ylabel('Tempo de execução em segundos')
plt.xlabel('Tamanho da entrada')
plt.title('Comparação entre os algoritmos Quick x Selection (Vetor Ordenado)')
plt.legend()
plt.show()

quick_sort_data_descending = df[(df['Nome Do Algoritmo'] == "Quick Sort") & (df['Ordem Do Vetor'] == 'DESCENDING')]
merge_sort_data_descending = df[(df['Nome Do Algoritmo'] == "Merge Sort") & (df['Ordem Do Vetor'] == 'DESCENDING')]
insertion_sort_data_descending = df[(df['Nome Do Algoritmo'] == "Insertion Sort") & (df['Ordem Do Vetor'] == 'DESCENDING')]
selection_sort_data_descending = df[(df['Nome Do Algoritmo'] == "Selection Sort") & (df['Ordem Do Vetor'] == 'DESCENDING')]



plt.plot(quick_sort_data_descending['Tamanho Do Vetor'], quick_sort_data_descending['Tempo De Execução'],  marker='o', linestyle='-', color='red', label='Quick Sort')
plt.plot(merge_sort_data_descending['Tamanho Do Vetor'], merge_sort_data_descending['Tempo De Execução'],  marker='o', linestyle='-', color='green', label='Merge Sort')
plt.plot(insertion_sort_data_descending['Tamanho Do Vetor'], insertion_sort_data_descending['Tempo De Execução'],  marker='o', linestyle='-', color='blue', label='Insertion Sort')
plt.plot(selection_sort_data_descending['Tamanho Do Vetor'], selection_sort_data_descending['Tempo De Execução'],  marker='o', linestyle='-', color='black', label='Selection Sort')
plt.ylabel('Tempo de execução em segundos')
plt.xlabel('Tamanho da entrada')
plt.title('Comparação entre os algoritmos (Vetor Desordenado)')
plt.legend()
plt.show()

#plt.plot(quick_sort_data_descending['Tamanho Do Vetor'], quick_sort_data_descending['Tempo De Execução'],  marker='o', linestyle='-', color='red', label='Quick Sort')
#plt.plot(merge_sort_data_descending['Tamanho Do Vetor'], merge_sort_data_descending['Tempo De Execução'],  marker='o', linestyle='-', color='green', label='Merge Sort')
#plt.plot(insertion_sort_data_descending['Tamanho Do Vetor'], insertion_sort_data_descending['Tempo De Execução'],  marker='o', linestyle='-', color='blue', label='Insertion Sort')
plt.plot(selection_sort_data_descending['Tamanho Do Vetor'], selection_sort_data_descending['Tempo De Execução'],  marker='o', linestyle='-', color='black', label='Selection Sort')
plt.ylabel('Tempo de execução em segundos')
plt.xlabel('Tamanho da entrada')
plt.title('Comparação entre os algoritmos (Vetor Desordenado)')
plt.legend()
plt.show()

plt.plot(quick_sort_data_descending['Tamanho Do Vetor'], quick_sort_data_descending['Tempo De Execução'],  marker='o', linestyle='-', color='red', label='Quick Sort')
plt.plot(merge_sort_data_descending['Tamanho Do Vetor'], merge_sort_data_descending['Tempo De Execução'],  marker='o', linestyle='-', color='green', label='Merge Sort')
plt.plot(insertion_sort_data_descending['Tamanho Do Vetor'], insertion_sort_data_descending['Tempo De Execução'],  marker='o', linestyle='-', color='blue', label='Insertion Sort')
#plt.plot(selection_sort_data_descending['Tamanho Do Vetor'], selection_sort_data_descending['Tempo De Execução'],  marker='o', linestyle='-', color='black', label='Selection Sort')
plt.ylabel('Tempo de execução em segundos')
plt.xlabel('Tamanho da entrada')
plt.title('Comparação entre os algoritmos Quick x Merge x Insertion(Vetor Desordenado)')
plt.legend()
plt.show()

df['Tempo De Execução'].min()

df['Tempo De Execução'].max()