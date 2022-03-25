CREATE TABLE public.coordenadas (
	lat varchar(18) NOT NULL,
	lng varchar(18) NOT NULL,
	campo1 varchar(10) NULL,
	campo2 varchar(10) NULL,
	CONSTRAINT coordenadas_pk PRIMARY KEY (lat, lng)
);
CREATE TABLE public.users (
	usuario varchar NOT NULL,
	"password" varchar NOT NULL,
	iduser serial NOT NULL,
	CONSTRAINT users_pk PRIMARY KEY (iduser)
);
INSERT INTO public.coordenadas
(lat, lng, campo1, campo2)
VALUES('-12.123', '-21.321', 'info1row1', 'info2row1');
INSERT INTO public.coordenadas
(lat, lng, campo1, campo2)
VALUES('-123.123', '-321.321', 'info1row2', 'info2row2');
INSERT INTO public.users (usuario,"password",iduser) VALUES
	 ('ivan','03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4',1),
	 ('bravo','5994471abb01112afcc18159f6cc74b4f511b99806da59b3caf5a9c173cacfc5',2);