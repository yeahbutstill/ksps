INSERT INTO public.status (status)
VALUES ('SUBMIT');
INSERT INTO public.status (status)
VALUES ('CHECKED');
INSERT INTO public.status (status)
VALUES ('PAID');

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

INSERT INTO public.claim (admission_date, claim_number, created_time, hospital_name, member_id, status_id)
VALUES ('2021-01-01', 'C0001', '2022-01-01 14:20:52', 'HERMINA DEPOK', 2, 1);
INSERT INTO public.claim (admission_date, claim_number, created_time, hospital_name, member_id, status_id)
VALUES ('2021-01-02', 'C0002', '2022-01-01 14:25:54', 'HERMINA ARCAMANIK', 5, 2);

INSERT INTO public.claim_item (item_name, value, claim_id)
VALUES ('Dokter Umum', 75000, 1);
INSERT INTO public.claim_item (item_name, value, claim_id)
VALUES ('Obat-obatan', 20000, 1);
INSERT INTO public.claim_item (item_name, value, claim_id)
VALUES ('Laboratorium', 150000, 2);