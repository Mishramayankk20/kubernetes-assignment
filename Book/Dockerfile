FROM openjdk
#COPY src Book
WORKDIR /Book
COPY Bookstoreapp.jar /Book
RUN java -jar Bookstoreapp.jar
#RUN mkdir -p bin
#RUN javac -d bin ./com/mayank/mymodule/Main.java
#WORKDIR bin
#CMD ["echo","ls"]
#ENTRYPOINT ["java","/com/mayank/mymodule/Main"]
#ENTRYPOINT ["tail", "-f", "/dev/null"]
