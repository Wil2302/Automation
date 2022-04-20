## Índice 

* [Título e Imagem de capa](#Título-e-Imagem-de-capa)
* [Badges](#badges)
* [Índice](#índice)
* [Descrição do Projeto](#descrição-do-projeto)
* [Status do Projeto](#status-do-Projeto)
* [Funcionalidades e Demonstração da Aplicação](#funcionalidades-e-demonstração-da-aplicação)
* [Acesso ao Projeto](#acesso-ao-projeto)
* [Tecnologias utilizadas](#tecnologias-utilizadas)
* [Pessoas Contribuidoras](#pessoas-contribuidoras)
* [Pessoas Desenvolvedoras do Projeto](#pessoas-desenvolvedoras)
* [Licença](#licença)
* [Conclusão](#conclusão)

## :hammer: Funcionalidades do projeto

- `Funcionalidade 1`: descrição da funcionalidade 1
- `Funcionalidade 2`: descrição da funcionalidade 2
- `Funcionalidade 2a`: descrição da funcionalidade 2a relacionada à funcionalidade 2
- `Funcionalidade 3`: descrição da funcionalidade 3


## 📁 Acesso ao projeto

**Indique como é possível baixar ou acessar o código fonte do projeto, seja projeto inicial ou final**

## 🛠️ Configurando ZSH

**Passo a passo para configurar o zsh no mac**

*Acesse o link abaixo e siga o passo a passo:*

https://sourabhbajaj.com/mac-setup/iTerm/zsh.html

## Conteudo do arquivo zshrc

##************************************************************************************

## -> TERMINAL SECTION

##************************************************************************************

autoload -Uz vcs_info

precmd_vcs_info() { vcs_info }

precmd_functions+=( precmd_vcs_info )

setopt prompt_subst


zstyle ':vcs_info:git:*' formats '%F{226}(%b)%f'

zstyle ':vcs_info:*' enable git


PROMPT='%(?.%F{green}?.%F{red}?%?)%f %B%F{33}%~%f%b $vcs_info_msg_0_ %F{153}%#  '  

 

#Ignore Case in Terminal

#bind 'set completion-ignore-case on'

# set completion-ignore-case on


# zstyle ':completion:*' matcher-list 'm:{a-zA-Z}={A-Za-z}'

zstyle ':completion:*' matcher-list 'm:{[:lower:]}={[:upper:]}'

autoload -Uz compinit && compinit -i


alias ls='ls -GFha'

alias code='open -a /Applications/Visual\ Studio\ Code.app/'


 

##************************************************************************************

## -> ANDROID SECTION

##************************************************************************************

export ANDROID_HOME="/Users/${USER}/Library/Android"

export ANDROID_SDK_HOME="/Users/${USER}/Library/Android/sdk"

export ANDROID_AVD_HOME="/Users/${USER}/.android/avd/"

export ANDROID_SDK=$HOME/Library/Android/sdk

export PATH=":$ANDROID_HOME/sdk/platform-tools:$ANDROID_SDK/emulator:$ANDROID_SDK/tools:${PATH}"


#List Packages Android Emulator

function listpackage(){

    adb shell pm list packages

}


 

export PATH=":/usr/local/opt/openssl/bin:$HOME/.rbenv/bin:${HOME}/Applications/brew/bin/:${PATH}"


##************************************************************************************

## -> FLUTTER SECTION

##************************************************************************************

export PATH=":/Users/${USER}/development/flutter/bin/${PATH}"


 

##************************************************************************************

## -> JAVA SECTION

##************************************************************************************

export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-9.0.4.jdk/Contents/Home
 
export JAVA_OPTS="$JAVA_OPTS -DsocksProxyPort"
export M2_HOME=/Users/${USER}/apache-maven-3.8.5
export PATH=$PATH:$M2_HOME/bin

export JMETER="/opt/homebrew/Cellar/jmeter/5.4.3/bin"

#Ativa o modo verbose do GIT

export GIT_CURL_VERBOSE=1

## Autores

| [<img src="https://avatars.githubusercontent.com/u/44170294?v=4" width=115><br><sub>Wilson Amorim</sub>](https://github.com/Wil2302) |
| :---: |
