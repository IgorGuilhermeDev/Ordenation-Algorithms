# Ordenation-Algorithms

Este projeto foi criado com o propósito de benchmarking dos principais algoritmos de ordenação.

A benchmark foi conduzida usando arrays de **100**, **1000**, **100000** e **500000** elementos inteiros em três diferentes ordens: **RANDOM**, **ASCENDING** e **DESCENDING**, enquanto testava Quick Sort, **Merge Sort**, **Selection Sort** e **Insertion Sort**.

Os resultados do benchmark são salvos em um arquivo .csv chamado **results**.

Após salvar os resultados, você pode executar um script em Python para traçar gráficos para análise dos resultados.

## Stacks
- Java - 17.0.6
- Python - 3.10

## Como executar o projeto
1. Abra a pasta raiz do projeto.

![Pasta raiz](readme_imgs/root_folder.png)

2. Abra um terminal e execute os seguintes comandos (este passo pode levar um bom tempo):

    ```java
    javac Main.java
    java -Xss80m Main.java
    ```
    
3. Crie um ambiente virtual e instale as dependências, comandos abaixo:
    
    ```python
    python3.10 -m venv venv
    source venv/bin/activate
    pip install -r requirements.txt
    ```
    
4. Execute o script Python:
    ```python
    python3.10 main.py
    ```
    
Após isso, seu arquivo `results.csv` será preenchido e sua saída será semelhante a esta: 

![Saída do script](readme_imgs/output.png)

Após fechar um gráfico, outro aparecerá.

## WARNING
Se você estiver em um sistema baseado em Linux e receber este erro: "UserWarning: FigureCanvasAgg is non-interactive, and thus cannot be shown
  plt.show()", execute este comando para corrigir:

  ```bash
  sudo apt-get install python3-tk
  sudo apt-get purge python3-tk # Isso é usado para remover se você não quiser mais
  ```
## Obs
Neste projeto, eu usei o Python 3.10, mas pode funcionar com versões anteriores. Os comandos podem precisar ser adaptados no seu caso, e você pode ser capaz de chamar o Python sem especificar a versão, usando apenas o comando "python".
