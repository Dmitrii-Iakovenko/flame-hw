
--
-- Первоначальное создание таблиц
--

DROP TABLE IF EXISTS players;

CREATE TABLE IF NOT EXISTS players
(
    id   BIGSERIAL PRIMARY KEY NOT NULL,
    nickname VARCHAR (255),
    guild VARCHAR (255),
    heroes1 INT,
    heroes2 INT,
    heroes3 INT,
    titans INT,
    dateTime DATE,
    actual boolean
);
