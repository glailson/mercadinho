CREATE TABLE tbproduto (
    pronumsequencial BIGINT PRIMARY KEY not null,
    prodescricao VARCHAR(50)  NULL,
    proquantidade integer NULL,
    propreco numeric(20)
) 


CREATE SEQUENCE seq_pronumsequencial
    INCREMENT 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    START 1
    CACHE 1;

ALTER TABLE tbproduto ALTER COLUMN pronumsequencial SET DEFAULT NEXTVAL("seq_pronumsequencial"::regclass);

INSERT INTO tbproduto VALUES ('Lapis', 1, 2);

select * from tbproduto