-- ==========================
-- Parceiros
-- ==========================
INSERT INTO parceiro (id, nome) VALUES (1, 'Parceiro Tech');
INSERT INTO parceiro (id, nome) VALUES (2, 'Parceiro Educa');
INSERT INTO parceiro (id, nome) VALUES (3, 'Parceiro Saúde');

-- ==========================
-- Doadores
-- ==========================
INSERT INTO doador (id) VALUES (1);
INSERT INTO doador (id) VALUES (2);
INSERT INTO doador (id) VALUES (3);

-- ==========================
-- Doações
-- ==========================
INSERT INTO doacao (id, id_doador, id_parceiro, valor, data_doacao, status, qr_code_pix)
VALUES (1, 1, 1, 150.00, DATE '2024-10-10', 'APROVADO', 'qr_code_001');

INSERT INTO doacao (id, id_doador, id_parceiro, valor, data_doacao, status, qr_code_pix)
VALUES (2, 2, NULL, 75.00, NULL, 'PENDENTE', 'qr_code_002');

INSERT INTO doacao (id, id_doador, id_parceiro, valor, data_doacao, status, qr_code_pix)
VALUES (3, 3, 2, 200.00, DATE '2025-01-15', 'CANCELADO', 'qr_code_003');
