
-- Inserindo dados na tabela TB_PESSOA_FISICA
insert into TB_PESSOA_FISICA (id,  cpf,endereco,nome, rg, telefone) values (1, '12345678901','Rua A, 123','Carlos Aparecido dos Santos','1234567','11987654321');

-- Inserindo dados na tabela TB_PESSOA_JURIDICA
-- Supondo que a tabela TB_PESSOA_JURIDICA tenha as mesmas colunas que a tabela TB_PESSOA_FISICA, além do CNPJ
insert into TB_PESSOA_JURIDICA (id, cnpj,endereco ,nome_fantasia,telefone) values (2, '12345678901234','Rua B, 456','RB Turismo','11987654321');

insert into TB_PRODUTO (descricao, valor) values ('Ventilador Eletrolux', 40.00);
insert into TB_PRODUTO (descricao, valor) values ('Lava Louças', 1000.00);
insert into TB_PRODUTO (descricao, valor) values ('Notebook Dell', 2500.00);
insert into TB_PRODUTO (descricao, valor) values ('Mala de viagem', 100.00);


insert into TB_VENDA (cliente_id,data) values (1,'2021-01-01 09:22:50');
insert into TB_VENDA (cliente_id,data) values (2,'2021-01-02 15:17:02');
insert into TB_VENDA (cliente_id,data) values (2,'2021-01-03 12:05:22');

insert into TB_ITEM_VENDA (quantidade, produto_id, venda_id) values (2, 1, 1);
insert into TB_ITEM_VENDA (quantidade, produto_id, venda_id) values (1, 2, 2);
insert into TB_ITEM_VENDA (quantidade, produto_id, venda_id) values (4, 4, 2);
insert into TB_ITEM_VENDA (quantidade, produto_id, venda_id) values (1, 3, 1);
insert into TB_ITEM_VENDA (quantidade, produto_id, venda_id) values (1, 4, 3);

