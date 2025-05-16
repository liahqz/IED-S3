# parte 1: arrays(variáveis que contém outras variáveis dentro) 
nomes = []
cidades = []
tem_transportes = []
tipos_transportes = []

# parte 2: objetos(dicionários)
pessoas = []

while True: # "enquanto for verdadeiro"
    print("\n ˖⟡˚౨ৎ⋆ ⭐Cadastro de Pessoa⭐ ⋆౨ৎ˚⟡˖ ࣪") 
    
    nome = input("✮ Digite o nome: ✦.── ") # o input servirá como um print e um scanf, a resposta será interpretada na variável "nome", já que está sendo igualada á resposta do usuário 
    cidade = input("✮ Digite a cidade: ✦.── ")
    tem_transporte = input("✮ Você tem transporte? (sim/não): ✦.── ").strip().lower() # .strip: remove espaços em branco do início e do fim da string. .lower: converte toda a string para letras minúsculas. Ambas garantem que independente de como o usuário digitar o "sim" ou o "não" a resposta será interpretada
    
    if tem_transporte == "sim":
        tipo_transporte = input("✮ Qual tipo de transporte? ✦.── ")
    else:
        tipo_transporte = "Nenhum"
    
    # adiciona no dicionário(ou objeto(java)). Uma lista contém vários dicionários
    pessoa = { # o dicionário, onde hávera campos que serão preenchidos dxe acordo com a resposta do usuário
        "nome": nome, # o que está entre aspas vai ser a chave(tipo palavra-chave), e o valor será o que o usuário respondeu
        "cidade": cidade,
        "tem_transporte": tem_transporte,
        "tipo_transporte": tipo_transporte
    }
    pessoas.append(pessoa) # adiciona a nova pessoa(dicionário) na lista

    # ex. de outra estrutura:
    # cada lista guarda um tipo de informação, e a posição(índice) de cada item relaciona os dados entre si
    # o append vai servir para criar listas, fazendo com que as respostas do usuário fiquem salvas no dicionário
    # nomes.append(nome) 
    # cidades.append(cidade)
    # tem_transportes.append(tem_transporte)
    # tipos_transportes.append(tipo_transporte)

    continuar = input("✮ Deseja cadastrar outra pessoa?(s/n) ✦.── ").strip().lower()
    if continuar != 's':
        break # pare

print("\n⋆✴︎˚｡⋆ Dados Obtidos (Lista de Dicionários) ⋆｡˚✴︎⋆")
print(pessoa)