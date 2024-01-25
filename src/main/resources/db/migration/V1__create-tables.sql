CREATE TABLE "user" (
  "id" BIGINT NOT NULL,
  "name" VARCHAR(255),
  "email" VARCHAR(255),
  "password" VARCHAR(255),
  PRIMARY KEY ("id")
);

CREATE TABLE "blog" (
  "id" BIGINT NOT NULL,
  "title" VARCHAR(255),
  "content" TEXT,
  "user_id" BIGINT,
  PRIMARY KEY ("id"),
  FOREIGN KEY ("user_id") REFERENCES "user"("id")
);