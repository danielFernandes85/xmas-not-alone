DROP DATABASE IF EXISTS family_table;
CREATE DATABASE family_table;
USE family_table;
DROP TABLE IF EXISTS family;
CREATE TABLE family
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    familyName VARCHAR(255)  NOT NULL,
    phone       VARCHAR(255)  NOT NULL,
    email       VARCHAR(255)  NOT NULL,
    zipCode    VARCHAR(255)  NOT NULL,
    pets        VARCHAR(255)  NOT NULL,
    meal        VARCHAR(255)  NOT NULL,
    description VARCHAR(1000) NOT NULL,
    available   BOOLEAN       NOT NULL
);
INSERT INTO family(familyName, phone, email, zipCode, pets, meal, description, available)
VALUES ('Silva', '917478899', 'manuela_silva@mail.pt', '1743-110', 'Dog', 'Bacalhau Assado, Lombo de porco',
        'Somos uma família acolhedora e unida, que celebra a magia do Natal com amor e alegria. Na noite de Natal, seremos 6 pessoas à volta da mesa, partilhando momentos especiais. Teremos todo o prazer em receber alguém para se juntar a nós nesta noite tão especial!',
        TRUE),
       ('Azevedo', '914447755', 'belmiroAzevedo@worten.pt', '2645-543', 'Cat', 'Bacalhau Cozido, Peru',
        'Somos uma família pequena, mas cheia de carinho e boas energias. Na noite de Natal, seremos 3 pessoas reunidas num ambiente simples e acolhedor. Adoraríamos abrir as portas e receber alguém para partilhar esta noite especial connosco!',
        TRUE),
       ('Ramos', '913334455', 'tuguinha_ramos@yahoo.com', '2750-100', 'Dog & Cat', 'Bacalhau com Broa, Borrego',
        'Somos uma família grande e cheia de vida, onde as risadas e a alegria não faltam. Na noite de Natal, seremos 10 pessoas reunidas para celebrar esta data tão especial. Teríamos o maior prazer em receber alguém para se juntar a nós e fazer parte da nossa festa! PS: Não deixem que o Kaizer(o nosso cãozinho) fique perto da mimi(a nossa gata).',
        FALSE),
       ('Torres', '963224456', 'vivaTorresVedras@hotmail.com', '4000-010', 'Cat', 'Arroz de Pato',
        'Somos uma família pequena, mas o nosso amor e cumplicidade tornam cada momento especial. Será uma celebração íntima e acolhedora, repleta de sorrisos, bons momentos e, claro, muito carinho. Adoraríamos partilhar essa noite mágica com mais alguém, oferecendo um espaço cheio de calor e boa companhia.',
        TRUE),
       ('Almeida', '932224456', 'ruteMarlene@gmail.pt', '8005-446', 'Dog', 'Bacalhau Cozido',
        'Somos uma família de cinco, onde a harmonia e o afeto marcam cada instante. Na noite de Natal gostamos de ver jogar jogos de tabuleiro enquanto ouvimos música natalícia. A celebração será acolhedora e cheia de momentos especiais, e seria um prazer compartilhar essa noite com mais alguém. PS: Por favor, venham que o meu Zé tem a tendência de adormecer!',
        FALSE);