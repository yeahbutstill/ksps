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