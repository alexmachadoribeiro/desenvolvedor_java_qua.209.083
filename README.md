# Repositório da turma QUA.209.083 do curso Desenvolvedor Java Noturno do SENAI

## Instruções para setar suas credenciais no Git

1. Execute o comando `git config --list` para verificar se existem alguém com as credenciais setadas.
2. Caso tenha credenciais setadas, e não sejam as suas, tire as credenciais com os comandos abaixo:
- `git config --global --unset-all user.name`
- `git config --global --unset-all user.email`
3. Sete suas credenciais com os comandos abaixo:
- `git config user.name "seu_nome_de_usuario"`
- `git config user.email "seu_email@seu_email.com"`
4. Verifique se deu certo com `git config --list`

## Instruções para criar um repositório local e enviar para o GitHub

1. Sete suas credenciais.
2. Execute os comandos abaixo:
- `git init`
- `git add .`
- `git commit -m "Mensagem do seu commit."`
- `git remote add origin <url>`
- `git branch -M main`
- `git push -u origin main`
3. Atualize a página do repositório remoto e veja se seu projeto está lá.

## Instruções para atualizar o repositório local e remoto

1. Sete suas credenciais.
2. Execute os comandos abaixo:
- `git add .`
- `git commit -m "Mensagem do seu commit."`
- `git push`
3. Verifique seu repositório no GitHub.

## Instruções para trabalhar com seu repositório em outra máquina

1. Execute o comando:
- `git clone <url>`

## Instrouções para atualizar seu repositório local com o conteúdo do repositório remoto

1. Execute o comando abaixo antes de qualquer alteração:
- `git pull`