import java.util.Scanner; //pacote de leitura

public class MenuControle {
	static String nome, produto, descrição, endereço;
	static double valor, porcentagem;
	static int estoque, contador_cliente = 10, contador_produto = 10, telefone, qtd_clientes, qtd_produto;
	static String[] nomes = new String[100];
	static String[] endereços = new String[100];
	static int[] telefones = new int[100];
	static String[] produtos = new String[100];
	static String[] descrições = new String[100];
	static double[] valores = new double[100];
	static double[] lucros = new double[100];
	static int[] estoques = new int[100];

	public static void main(String[] args) {
		// declarações na main com os pré-cadastros
		int escolha;
		nomes[0] = "Daniel Rocha";
		nomes[1] = "Lionel Messi";
		nomes[2] = "Cristiano Ronaldo";
		nomes[3] = "Lebron James";
		nomes[4] = "Stephen Curry";
		nomes[5] = "Antony Davis";
		nomes[6] = "Roussel Westbrook";
		nomes[7] = "Michael Jordan";
		nomes[8] = "Big Sean";
		nomes[9] = "Travis Scott";
		endereços[0] = "Braília DF";
		endereços[1] = "Condomínio Beira Mar";
		endereços[2] = "SQS 108 Sul Bl I";
		endereços[3] = "SQS 409 Norte Bl A";
		endereços[4] = "Condomínio Lago Sul";
		endereços[5] = "Rua 18 Norte Águas Claras";
		endereços[6] = "Rio de Janeiro Leblon";
		endereços[7] = "São Paulo cidade";
		endereços[8] = "Porto Alegre";
		endereços[9] = "Miami Florida";
		telefones[0] = 912345678;
		telefones[1] = 987654321;
		telefones[2] = 998765432;
		telefones[3] = 997543211;
		telefones[4] = 998712345;
		telefones[5] = 957321576;
		telefones[6] = 998822115;
		telefones[7] = 990703021;
		telefones[8] = 990908080;
		telefones[9] = 990191919;
		produtos[0] = "Limao";
		produtos[1] = "Laranja";
		produtos[2] = "Melancia";
		produtos[3] = "Melao";
		produtos[4] = "Picanha";
		produtos[5] = "Iphone 12 pro MAX";
		produtos[6] = "Acer Nitro 7";
		produtos[7] = "Bola NBA season 9";
		produtos[8] = "NBA 2K21";
		produtos[9] = "Apex Legends Champion Edition";
		descrições[0] = "Azedo, porém delicioso";
		descrições[1] = "Vai um suco?";
		descrições[2] = "Melhor Fruta";
		descrições[3] = "Parece melancia, só que amarelo";
		descrições[4] = "Churrascão domingo";
		descrições[5] = "Celular top dos tops";
		descrições[6] = "Pc Gamer de ultima geração";
		descrições[7] = "Para os amantes de NBA";
		descrições[8] = "Para os Gamers Amantes de NBA";
		descrições[9] = "Para os viciados nesse jogo!!";
		valores[0] = 0.99;
		valores[1] = 20.50;
		valores[2] = 7.40;
		valores[3] = 3.99;
		valores[4] = 69.50;
		valores[5] = 5789.80;
		valores[6] = 10892.70;
		valores[7] = 200;
		valores[8] = 199.99;
		valores[9] = 189.60;
		lucros[0] = 70;
		lucros[1] = 140;
		lucros[2] = 98;
		lucros[3] = 56;
		lucros[4] = 75;
		lucros[5] = 80;
		lucros[6] = 154;
		lucros[7] = 321;
		lucros[8] = 10;
		lucros[9] = 60;
		estoques[0] = 10;
		estoques[1] = 20;
		estoques[2] = 50;
		estoques[3] = 9;
		estoques[4] = 12;
		estoques[5] = 19;
		estoques[6] = 20;
		estoques[7] = 300;
		estoques[8] = 432;
		estoques[9] = 90;
		Scanner leitura = new Scanner(System.in);
		// casos de escolha
		do {
			visualizamenu(); // vizualização de menu
			escolha = leitura.nextInt();// leitura da escolha
			switch (escolha) {
			case 1:
				limpar();
				System.out.println("Voce entrou na aba Cadastro de Cliente\n");
				novocliente();
				limpar();
				break;
			case 2:
				limpar();
				System.out.println("Voce entrou na aba Busca de Cliente\n");
				buscacliente();
				limpar();
				break;
			case 3:
				limpar();
				System.out.println("Voce entrou na aba Cadastro de Produto\n");
				novoproduto();
				limpar();
				break;
			case 4:
				limpar();
				System.out.println("Voce entrou na aba Busca de Produto\n");
				buscaproduto();
				limpar();
				break;
			case 5:
				limpar();
				System.out.print("Voce entrou na aba Cadastro de venda.\n");
				realizavenda();
				limpar();
				break;
			case 6:
				limpar();
				System.out.print("Voce entrou na aba Estoque.\n");
				estoquesprodutos();
				limpar();
				break;
			case 7:
				limpar();
				System.out.print("Obrigado!! Volte sempre!\n");
				break;
			default:
				System.out.println("Valor diferente!");
			}
		} while (escolha != 7);
	}

	static void novocliente() {//Função de cadastrar clientes

		Scanner leitura = new Scanner(System.in);

		System.out.print("Digite a quantidade de clientes que deseja cadastrar: ");
		qtd_clientes = leitura.nextInt();

		do {
			leitura.nextLine();
			System.out.println("________________________________________________________________");
			System.out.print("Digite o nome: ");
			nome = leitura.nextLine();
			System.out.print("Digite o endereço: ");
			endereço = leitura.nextLine();
			System.out.print("Digite o número de telefone (com o 9 e sem o hífem): ");
			telefone = leitura.nextInt();
			System.out.println("________________________________________________________________");
			nomes[contador_cliente] = nome;
			endereços[contador_cliente] = endereço;
			telefones[contador_cliente] = telefone;
			contador_cliente++;
		} while (contador_cliente < (qtd_clientes + 10));

	}

	static void buscacliente() {//Função de buscar clientes

		int volta;
		int i;
		boolean verifica = false;
		String editar = "";
		String procura_nome;
		Scanner leitura = new Scanner(System.in);

		System.out.print("Digite o nome cadastrado: ");
		procura_nome = leitura.nextLine();

		for (i = 0; i < (10 + qtd_clientes); i++) {
			if (procura_nome.equals(nomes[i])) {
				verifica = true;
				System.out.println("________________________________________________________________");
				System.out.println("Nome do cliente: " + nomes[i]);
				System.out.println("Endereço: " + endereços[i]);
				System.out.println("Número de telefone: " + telefones[i]);
				System.out.println("________________________________________________________________");
				System.out.println("Deseja editar as informações?Digite sim ou não.");
				System.out.println("Caso seja sim, terá que inserir as informações novamente.");
				editar = leitura.nextLine();
				if (editar.equals("sim")) {
					System.out.println("________________________________________________________________");
					System.out.print("Digite o nome: ");
					nome = leitura.nextLine();
					System.out.print("Digite o endereço: ");
					endereço = leitura.nextLine();
					System.out.print("Digite o número de telefone (com o 9 e sem o hífem): ");
					telefone = leitura.nextInt();
					leitura.nextLine();
					System.out.println("________________________________________________________________");
					nomes[i] = nome;
					endereços[i] = endereço;
					telefones[i] = telefone;
				}
			}

		}

		if (verifica == false) {
			System.out.println("Cliente não encontrado!");
		}
		System.out.println("Para procurar novamente, volte ao menu, digite 1");
		volta = leitura.nextInt();
		if (volta == 1) {
			System.out.println("Voltando...");
		}

	}

	static void novoproduto() {//Função de cadastrar produtos

		Scanner leitura = new Scanner(System.in);

		System.out.print("Digite a quantidade de produtos que deseja cadastrar: ");
		qtd_produto = leitura.nextInt();

		do {
			leitura.nextLine();
			System.out.println("________________________________________________________________");
			System.out.print("Digite o nome do produto: ");
			produto = leitura.nextLine();
			System.out.print("Digite a descrição do produto: ");
			descrição = leitura.nextLine();
			System.out.print("Digite o valor(ex: 1,99): ");
			valor = leitura.nextDouble();
			System.out.print("Digite a porcentagem de lucro(apenas números): ");
			porcentagem = leitura.nextDouble();
			System.out.print("Digite a quantidade em estoque: ");
			estoque = leitura.nextInt();
			System.out.println("________________________________________________________________");
			produtos[contador_produto] = produto;
			descrições[contador_produto] = descrição;
			valores[contador_produto] = valor;
			lucros[contador_produto] = porcentagem;
			estoques[contador_produto] = estoque;
			contador_produto++;
		} while (contador_produto < (qtd_produto + 10));

	}

	static void buscaproduto() {//Função de buscar produtos
		String editar = "";
		int i;
		boolean verifica = false;
		String procura_produto;
		Scanner leitura = new Scanner(System.in);

		System.out.print("Digite o produto cadastrado: ");
		procura_produto = leitura.nextLine();

		for (i = 0; i < (10 + qtd_produto); i++) {
			if (procura_produto.equals(produtos[i])) {
				verifica = true;
				System.out.println("________________________________________________________________");
				System.out.println("Nome do produto: " + produtos[i]);
				System.out.println("Sobre o produto: " + descrições[i]);
				System.out.println("Preço : R$" + valores[i]);
				System.out.println("Taxa de lucro: %" + lucros[i]);
				System.out.println("Quantidade incial diponível: " + estoques[i]);
				System.out.println("________________________________________________________________");
				System.out.println("Deseja editar as informações?Digite sim ou não.");
				System.out.println("Caso seja sim, terá que inserir as informações novamente.");

				editar = leitura.nextLine();
				if (editar.equals("sim")) {
					System.out.println("________________________________________________________________");
					System.out.print("Digite o nome do produto: ");
					produto = leitura.nextLine();
					System.out.print("Digite a descrição do produto: ");
					descrição = leitura.nextLine();
					System.out.print("Digite o valor(ex: 1,99): ");
					valor = leitura.nextDouble();
					System.out.print("Digite a porcentagem de lucro(apenas números): ");
					porcentagem = leitura.nextDouble();
					System.out.print("Digite a quantidade em estoque: ");
					estoque = leitura.nextInt();
					leitura.nextLine();
					System.out.println("________________________________________________________________");
					produtos[i] = produto;
					descrições[i] = descrição;
					valores[i] = valor;
					lucros[i] = porcentagem;
					estoques[i] = estoque;
				}
				if (editar.equals("não")) {
					System.out.println("Voltando ao Menu...");
				}
			}

		}
		if (verifica == false) {
			System.out.println("Produto não encontrado!");
		}

	}

	static void realizavenda() {//Função para realizar vendas
		int i, j, escolha, venda;
		String digita_nome;
		String digita_produto;
		Scanner leitura = new Scanner(System.in);

		for (i = 0; i < (10 + qtd_clientes); i++) {
			System.out.println("________________________________________________________________");
			System.out.println("Cliente: " + nomes[i]);
			System.out.println("________________________________________________________________");
		}
		System.out.println("Selecione o cliente digitando seu nome corretamente:");
		System.out.println("Depois de selecionar e apertar enter, aperte enter denovo para prosseguir");
		digita_nome = leitura.nextLine();
		for (i = 0; i < (10 + qtd_clientes); i++) {
			if (digita_nome.equals(nomes[i])) {
				do {
					leitura.nextLine();
					for (j = 0; j < (10 + qtd_produto); j++) {
						System.out.println("________________________________________________________________");
						System.out.println("Produto: " + produtos[j]);
						System.out.println("________________________________________________________________");
					}
					System.out.println("Selecione o produto digitando seu nome corretamente:");
					digita_produto = leitura.nextLine();
					for (j = 0; j < (10 + qtd_produto); j++) {
						if (digita_produto.equals(produtos[j])) {
							System.out.println("Quanto itens foram vendidos desse produto? ");
							venda = leitura.nextInt();
							estoques[j] = estoques[j] - venda;
							if (estoques[j] > 0) {
								System.out.println("Venda realizada com sucesso!!");
							}
							if (estoques[j] == 0) {
								System.out.println("Produto esgotado!");
								System.out.println(
										"Carregue mais itens no produto cadastrado, vá na aba busca produto e edite as informações!");

							}
							if (estoques[j] < 0) {
								estoques[j] = estoques[j] + venda;
								System.out.println("Impossível relizar venda, caregue mais itens desse produto!");
							}

						}
					}
					System.out.println("Deseja realizar outra venda?(se sim, digite 1, se não digite outro número) ");
					escolha = leitura.nextInt();

				} while (escolha == 1);

			}
		}

	}

	static void estoquesprodutos() {//Função para mostrar os estoques
		int volta;
		Scanner leitura = new Scanner(System.in);

		System.out.println("Aqui se encontram os produtos com seus estoques finais:");
		for (int i = 0; i < (10 + qtd_produto); i++) {
			System.out.println("________________________________________________________________");
			System.out.println("Produto: " + produtos[i]);
			System.out.println("Quantidade disponível: " + estoques[i]);
			System.out.println("________________________________________________________________");

		}

		System.out.println("Para terminar a visualização, digite 1");
		volta = leitura.nextInt();
		if (volta == 1) {
			System.out.println("Voltando...");
		}
	}

	static void visualizamenu() {//Função para vizualizar Menu
		System.out.println("Bem vindo ao MENU principal =D");
		System.out.println("Escolha uma das opções:\n");
		System.out.print("(1) Cadastro de novo cliente.\n");
		System.out.print("(2) Busca por cliente.\n");
		System.out.print("(3) Cadastro de novo produto.\n");
		System.out.print("(4) Busca por produto.\n");
		System.out.print("(5) Cadastro de venda.\n");
		System.out.print("(6) Mostrar produtos em estoque.\n");
		System.out.print("(7) Sair.\n");
	}

	static void limpar() {//Função de "limpar a tela"
		for (int i = 0; i < 60; i++) {
			System.out.print("\r\n");
		}

	}

}
