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
  Usuário: 
  Senha: 

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

