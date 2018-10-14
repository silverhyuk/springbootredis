---
 # SPRING BOOT REDIS

- C:\Users\silve>docker search redis
- C:\Users\silve>docker run -p 6379:6379 --name redis_boot -d redis
- C:\Users\silve>docker ps -a
  - CONTAINER ID        IMAGE               COMMAND                  CREATED             STATUS              PORTS                    NAMES
  - 539bc66c781f        redis               "docker-entrypoint.s…"   19 seconds ago      Up 18 seconds       0.0.0.0:6379->6379/tcp   redis_boot
 
 - C:\Users\silve>docker exec -i -t redis_boot redis-cli
 - 127.0.0.1:6379>