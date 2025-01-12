


FROM postgres:16

RUN apt-get update && \
    apt-get install -y postgresql-16-cron && \
    apt-get install -y iputils-ping
