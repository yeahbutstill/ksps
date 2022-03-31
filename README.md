# ksps

# Setup Database

```shell
sudo docker run --rm \                                                                                                                                                                         [c988a5b]
--name ksps-claim-db \
-e POSTGRES_DB=ksps_claim \
-e POSTGRES_USER=dani \
-e POSTGRES_PASSWORD=dani \
-e PGDATA=/var/lib/postgresql/data/pgdata \
-v "$PWD/ksps_claim-data:/var/lib/postgresql/data" \
-p 5432:5432 \
postgres:12
```

- insert data Status

```postgresql
INSERT INTO public.status (status)
VALUES ('SUBMIT');
INSERT INTO public.status (status)
VALUES ('CHECKED');
INSERT INTO public.status (status)
VALUES ('PAID');
```

- insert data Member

```postgresql
INSERT INTO public."member" (card_number, member_name)
VALUES (654001, 'RIZKI');
INSERT INTO public."member" (card_number, member_name)
VALUES (654002, 'AKBAR');
INSERT INTO public."member" (card_number, member_name)
VALUES (654003, 'TANJUNG');
INSERT INTO public."member" (card_number, member_name)
VALUES (654004, 'ARIS');
INSERT INTO public."member" (card_number, member_name)
VALUES (654005, 'DINO');
```

- insert data Claim

```postgresql
INSERT INTO public.claim (admission_date, claim_number, created_time, hospital_name, member_id, status_id)
VALUES ('2021-01-01', 'C0001', '2022-01-01 14:20:52', 'HERMINA DEPOK', 2, 1);
INSERT INTO public.claim (admission_date, claim_number, created_time, hospital_name, member_id, status_id)
VALUES ('2021-01-02', 'C0002', '2022-01-01 14:25:54', 'HERMINA ARCAMANIK', 5, 2);
```

- insert data Claim Item

```postgresql
INSERT INTO public.claim_item (item_name, value, claim_id)
VALUES ('Dokter Umum', 75000, 1);
INSERT INTO public.claim_item (item_name, value, claim_id)
VALUES ('Obat-obatan', 20000, 1);
INSERT INTO public.claim_item (item_name, value, claim_id)
VALUES ('Laboratorium', 150000, 2);
```