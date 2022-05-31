FROM openjdk:17.0.1-oraclelinux8
COPY 'target/game-of-three-referee-*.jar' app/app.jar
COPY bootstrap.sh /
ENTRYPOINT ["/bootstrap.sh"]
