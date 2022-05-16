CREATE TABLE "book" (
  "id" bigserial NOT NULL,
  "author" varchar(255),
  "launch_date" timestamp NOT NULL,
  "price" decimal(65,2) NOT NULL,
  "title" text,
  primary key  (id)
);
