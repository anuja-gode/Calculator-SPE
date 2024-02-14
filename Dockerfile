FROM openjdk:18
WORKDIR ./
COPY ./target/CalculatorProject-1.0-SNAPSHOT.jar ./
CMD ["java","-cp","CalculatorProject-1.0-SNAPSHOT.jar","Calculator"]
