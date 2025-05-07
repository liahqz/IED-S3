import datetime  # para validar datas

tarefas = []            # Lista principal de tarefas
historico = []          # Pilha para desfazer tarefas
fila_execucao = []      # Fila para executar tarefas


def salvar_tarefas_em_arquivo():                                                                                     # salva todas as tarefas no arquivo "tarefas.txt"
    with open("tarefas.txt", "w", encoding="utf-8") as arquivo:                                                      # abre ou cria o arquivo no modo escrita
        for tarefa in tarefas:                                                                                       # "enre as tarefas salvas"
            arquivo.write(f"{tarefa['descricao']} | Prioridade: {tarefa['prioridade']} | Data: {tarefa['data']}\n")  # salva as tarefas no arquivo


def adicionar_tarefa(descricao, prioridade, data): # adiciona uma tarefa
    tarefa = {                                     # especificações
        'descricao': descricao,
        'prioridade': prioridade,
        'data': data
    }
    tarefas.append(tarefa)                        # adiciona à lista principal
    historico.append(tarefa)                      # adiciona ao histórico de tarefas
    fila_execucao.append(tarefa)                  # adiciona à fila 
    salvar_tarefas_em_arquivo()                   # salva todas as tarefas no arquivo
    print(f"Tarefa '{descricao}' adicionada!\n")  # confirma que a a tarefa foi adicionada

def desfazer_ultima_tarefa():                                 # desfaz a última tarefa adicionada
    if historico:                                             # verifica se tem tarefas para desfazer
        ultima = historico.pop()                              # remove a última tarefa do histórico
        tarefas.remove(ultima)                                # remove a mesma da lista principal
        fila_execucao.remove(ultima)                          # remove também da fila de execução
        salvar_tarefas_em_arquivo()                           # atualiza o arquivo
        print(f"Tarefa '{ultima['descricao']}' desfeita!\n")  # confirma que a a tarefa foi desfeita
    else:
        print("Nenhuma tarefa para desfazer.\n")              # se não tiver tarefas no histórico...


def atender_tarefa():                                        # atende a primeira tarefa da fila
    if fila_execucao:                                        # verifica se tem tarefas na fila
        feita = fila_execucao.pop(0)                         # remove a primeira da fila (FIFO)
        tarefas.remove(feita)                                # remove também da lista principal
        salvar_tarefas_em_arquivo()                          # atualiza o arquivo
        print(f"Tarefa '{feita['descricao']}' atendida!\n")  # confirma que a a tarefa foi atendida
    else:
        print("Nenhuma tarefa para atender.\n")              # se não tiver tarefas a serem atendidas...


def mostrar_tarefas():                                                                           # mostra todas as tarefas
    print("\n📋 Lista de Tarefas:")
    for i, t in enumerate(tarefas):                                                              # verifica todas as tarefas com índice
        print(f"{i + 1}. {t['descricao']} | Prioridade: {t['prioridade']} | Data: {t['data']}")  # exibe cada uma
    print()                                                                                      # pra separar


while True:  # loop (menu interativo)
    # menu de opções
    print("1. Adicionar Tarefa")
    print("2. Desfazer Última Tarefa")
    print("3. Atender Tarefa (modo fila)")
    print("4. Mostrar Tarefas")
    print("5. Sair")

    opcao = input("Escolha uma opção: ")  # lê a escolha do usuário

    if opcao == '1':                                                      # opção de adicionar tarefa
        descricao = input("Digite a descrição da tarefa: ")               # lê a descrição
        prioridade = input("Digite a prioridade (alta, média, baixa): ")  # lê a prioridade
        data = input("Digite a data (YYYY-MM-DD): ")                      # lê a data
        try:
            datetime.datetime.strptime(data, "%Y-%m-%d")                  # verifica se a data está no formato correto
            adicionar_tarefa(descricao, prioridade, data)                 # chama a função para adicionar
        except ValueError:
            print("Data inválida! Use o formato YYYY-MM-DD.\n")           # erro

    elif opcao == '2':  # desfazer tarefa
        desfazer_ultima_tarefa()

    elif opcao == '3':  # atender tarefa
        atender_tarefa()

    elif opcao == '4':  # mostrar tarefas
        mostrar_tarefas()

    elif opcao == '5':  # sair do programa
        print("Saindo do programa...")
        break  # termina o loop

    else:
        print("Opção inválida!\n")  # pra entradas inválidas

