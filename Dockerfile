FROM ubuntu:20.04

ENV DEBIAN_FRONTEND=noninteractive

RUN apt-get update && \
    apt-get install -y git \
                       curl \
                       wget \
                       dpkg \
                       sudo \
                       vim

# install coursier
RUN curl -fLo cs https://git.io/coursier-cli-"$(uname | tr LD ld)" && \
    chmod +x cs && \
    ./cs --help

# cs setup
RUN ./cs setup -y

# cs install for scala3
RUN ./cs install scala3-compiler && \
    ./cs install scala3-repl

RUN apt-get clean && rm -rf /var/lib/apt/lists/*

COPY . /app
WORKDIR /app

