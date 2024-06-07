## <h1>Interface Gráfica de Empréstimo de Ferramentas</h1>

## 📍 Sobre o Projeto:
<p>
  Este projeto foi estipulado para a realização de uma UC da disciplina de Programação de Soluções Computacionais da Universidade do Sul de Santa Catarina. Trata-se de uma interface gráfica que permite registrar amigos e ferramentas, bem como conceder e gerenciar empréstimos dessas ferramentas para os amigos, com todas as informações armazenadas em um banco de dados MySQL.
</p>

## ⚙️ Programas:
<p>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" width="40" height="40"/>
  <img src="https://img.shields.io/badge/apache%20netbeans-1B6AC6?style=for-the-badge&logo=apache%20netbeans%20IDE&logoColor=white">
  <img src="https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white">
</p>

## 📖 História:
<p>
  No churrasco de família, seu tio-avô, lhe pediu um software para gerenciar o empréstimo de ferramentas. Ele quer o software que rode localmente no computador dele. A ideia é ter um cadastro de ferramentas (nome, marca, custo de aquisição) e o de amigos (nome, telefone). 
Ele gostaria de registrar os empréstimos de uma ou mais ferramentas a um determinado amigo, marcando a data que ocorreu e também a data de devolução.
Ele pediu que o software tenha um relatório de ferramentas e o quanto ele gastou. Também vai querer outro relatório dos empréstimos ativos e de todos os empréstimos realizados, por algum motivo ele gostaria de saber que é que fez mas empréstimos e se tem alguém que nunca devolveu, inclusive, a cada novo empréstimo ele gostaria de o sistema diga se o amigo ainda tem algo que não devolveu.
Dias mais tarde, ele pediu para aproveitar o cadastro de amigos e criar uma agenda integrada com o google para registrar o convite dos amigos a algum evento, a integração tem como princípio compartilhar o lembrete do evento de forma a ele receber um e-mail
</p>

## ✅ Requisitos Funcionais:
<p>Descrevem as funcionalidades específicas que o sistema ou software deve realizar. Definindo os comportamentos do sistema, ditando o que ele deve fazer, em termos de ações, serviços ou operações.<br>
São eles:</p>
<p>
  - Registrar novo "amigo" com informações de nome e telefone.<br>
  - Registrar ferramentas com detalhes como nome, marca e custo.<br>
  - Registrar o empréstimo das ferramentas para o amigo, incluindo as datas de empréstimo e devolução.<br>
  - Ao registrar um novo empréstimo, verificar se o amigo possui alguma ferramenta pendente de devolução, sendo capaz de alterar ou remover informações.<br>
  - Exibir um relatório de todos os empréstimos em andamento.<br>
  - Exibir um relatório de todos os empréstimos realizados.<br>
  - Indicar se algum amigo nunca devolveu uma ferramenta.<br>
  - Identificar qual amigo realizou o maior número de empréstimos.<br>
  - O sistema deve manter uma lista completa de todas as ferramentas e o valor total gasto nelas.<br>
  - Tela de estatísticas, serve para dar um panorama geral das informações mais importantes.
</p>

## ❌ Requisitos Não Funcionais:
<p>responsáveis por definir as características e propriedades de um sistema, que não estão diretamente relacionadas às suas funcionalidades específicas, mas que são igualmente importantes para seu sucesso. Eles descrevem atributos de qualidade, restrições e condições que um sistema deve atender. são responsáveis por impactar na experiência do usuário, envolvendo desempenho, arquitetura.<br>
São eles:</p>
<p>
  - O Software deve funcionar diretamente na máquina do usuário, sendo capaz de rodar sem problemas e ou travamentos.<br>
  - A interface deve ser simples e intuitiva, facilitando a navegação e deixando a experiência mais agradável para um usuário não técnico.<br>
  - A segurança do sistema é necessária para que nenhum usuário não autorizado altere as informações.<br>
  - O sistema deve ser capaz de suportar uma quantidade considerável de dados e sem travamentos, permanecendo responsivo e eficiente.<br>
  - Facilidade para realizar atualizações e correções nos cadastros, sem grandes complicações e mantendo sempre de uma forma de fácil entendimento para o usuário final.
</p>

# 💾 Banco de Dados MYSQL:
<p>O MySQL é um sistema de gerenciamento de banco de dados, que utiliza a linguagem SQL como interface. É atualmente um dos sistemas de gerenciamento de bancos de dados mais populares da Oracle Corporation.<br>

Usuário: root<br>
Senha: root</p>

## 💳 Telas Gráficas:
<p>
  <!--<img src="" height width><br>
  
</p>




<!--
Requisitos Funcionais: 
Cadastro de Ferramentas (Nome, marca, custo de aquisição);
Cadastro de Amigos (Nome, Telefone);
Edição de Ferramentas;
Edição de Amigos;
Registro de Empréstimos;
Relatório de Ferramentas;
Relatório de Empréstimos;

Requisitos não funcionais:
Execução local;
Interface intuitiva;
Segurança;
Desempenho:
Manutenção;
Histórico;
Análise de Empréstimos;

Realização de Commits:
  Ao realizar Commits se atentar ao padrão:
<tipo>: Indica a natureza do commit (feat para novas funcionalidades, fix para correções de bugs, docs para alterações na documentação, etc.).
[escopo opcional]: Opcionalmente, pode ser usado para fornecer um contexto adicional sobre a alteração.
<descrição>: Uma descrição concisa e clara do que foi feito no commit.
[corpo opcional]: Uma descrição mais detalhada das mudanças realizadas (opcional).
[rodapé opcional]: Informações adicionais, como referências a problemas ou tarefas relacionadas (opcional).

Documentação padrão:
  Sempre documentar uma classe/métodos com /** [Comentário] */ para orientar o que está sendo feito;

 (adicionar quando configurado)
Banco de Dados:
  Usuário: root
  Senha: root

COMANDOS PARA A **tb_amigo**:
  // INSERIR dados na tabela.
  INSERT INTO `ferramenta`.`tb_amigo` (`id_amigo`, `nome`, `telefone`)
  VALUES (1, 'João', '000000000'); 

  // Buscar todos os dados da tabela.
  SELECT * FROM tb_amigo;

  // ALTERAR dados de um determinado amigo 
  UPDATE `ferramenta`.`tb_amigo`
  SET `nome` = 'Tiburcio', `telefone` = '04'
  WHERE `id_amigo` = 1;

  // APAGAR um determinado amigo na tabela 
  DELETE FROM tb_amigo 
  WHERE id_amigo = 1;

COMANDOS PARA A **tb_ferramenta**:
  //INSERIR
  INSERT INTO `ferramenta`.`tb_ferramenta` (`id_ferramenta`, `nome`, `custo`, `marca`)
  VALUES (1, 'Martelo', '50.00', 'Vonder'); 

  //BUSCAR
  SELECT * FROM tb_ferramenta;

  //ALTERAR
  UPDATE `ferramenta`.`tb_ferramenta`
  SET `nome` = 'Machado', `custo` = '55.90', `marca` = 'Makita'
  WHERE `id_ferramenta` = 1;

  //DELETAR
  DELETE FROM tb_ferramenta 
  WHERE id_ferramenta = 1;    

COMANDOS PARA A **tb_emprestimo**:

  //INSERIR ( BOOLEAN: 1 = TRUE, 0 = FALSE ), no "Status" estamos utilizando valores booleanos.
  INSERT INTO `ferramenta`.`tb_emprestimo` (`id_emprestimo`, `id_ferramenta`, `id_amigo`, `data_emprestimo`, `data_devolução_prevista`, `data_devolução_real`, `Status`)
  VALUES (1, 1, 1, '2024-05-23', '2024-06-06', NULL, 1);

  //BUSCAR
  SELECT * FROM ferramenta.tb_emprestimo;
-->
