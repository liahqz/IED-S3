# arrays (variáveis)
nomes = []
idades = []
tem_transportes = []
tipos_transportes = []
tem_casa_propria = []
tipo_casa = []
vive_sozinho = []
com_quantas_pessoas = []


# objetos (dicionários)
pessoas = []

# cadastro
while True:
    print("\n ˖⟡˚౨ৎ⋆ ⭐Cadastro de Pessoa⭐ ⋆౨ৎ˚⟡˖ ࣪") 
    
    nome = input("✮ Digite o nome: ✦.── ") 
    idade = input("✮ Digite a sua idade: ✦.── ")
    tem_transporte = input("✮ Tem transporte? (sim/não): ✦.── ").strip().lower()
    tem_casa_propria = input("✮ Tem casa própria? (sim/não): ✦.── ").strip().lower()
    vive_sozinho = input("✮ Vive sozinho(a)? (sim/não): ✦.── ").strip().lower()

    if tem_transporte == "sim":
        tipo_transporte = input("✮ Qual tipo de transporte? ✦.── ")
    else:
        tipo_transporte = "Nenhum"

    if tem_casa_propria == "sim":
        tipo_casa_usuario = input("✮ Em que tipo de casa você mora?(apartamento, casa, condomínio, etc.) ✦.── ")
    else:
        tipo_casa_usuario = "Nenhum"

    if vive_sozinho == "nao":
        com_quantas_pessoas = input("✮ Quantas pessoas convivem na mesma casa? ✦.── ")
    else:
        tipo_transporte = "Nenhum"
    
    # dicionário por pessoa
    pessoa = {
        "nome": nome,
        "idade": idade,
        "tem transporte?": tem_transporte,
        "tipo de transporte": tipo_transporte,
        "tem casa própria?": tem_casa_propria,
        "tipo de casa": tipo_casa,
        "vive sozinho(a)?": vive_sozinho,
        "com quantas pessoas?": com_quantas_pessoas
    }

    pessoas.append(pessoa)  # adiciona a nova pessoa à lista de pessoas

    continuar = input("✮ Deseja cadastrar outra pessoa?(s/n) ✦.── ").strip().lower()
    if continuar != 's':
        break


print("\n⋆✴︎˚｡⋆ Dados Obtidos (Lista de Dicionários) ⋆｡˚✴︎⋆")
for i, p in enumerate(pessoas, 1): # i: índice; p: item da lista
    print(f"\nPessoa {i}:")
    for chave, valor in p.items(): # para chave e valor no item p da lista...
        print(f"  {chave}: {valor}") #chave: nomes entre aspas na linha 32; valor: o que está sendo igualado(resposta do usuário)