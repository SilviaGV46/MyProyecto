- whoami
- ls -la
- nano .zshrc
- zsh-autosuggestions
-  git clone https://github.com/zsh-users/zsh-autosuggestions ${ZSH_CUSTOM:-~/.oh-my-zsh/custom}/plugins/zsh-autosuggestions
-  git clone https://github.com/zsh-users/zsh-syntax-highlighting.git ${ZSH_CUSTOM:-~/.oh-my-zsh/custom}/plugins/zsh-syntax-highlighting
-  git clone https://github.com/zsh-users/zsh-completions ${ZSH_CUSTOM:=~/.oh-my-zsh/custom}/plugins/zsh-completions
-  plugins=(git zsh-autosuggestions zsh-syntax-highlighting zsh-completions)
- autoload -U compinit && compinit
- plugins=(git zsh-autosuggestions zsh-syntax-highlighting zsh-completions)
-  autoload -U compinit && compinit
-  echo $SHELL
- nano zshrc    nano .zshrc
-  cat (archivo1.txt)
-  hexdump (archivo1.txt)
- ls - l /dev
- df
- sudo cat /dev/vda1
-  dd if=(/dev/zero) of=(/home/ruby/prueba1) bs=1M count=1
-  sudo apt-get (update)
-  sudo apt-get install (ca-certificates curl)
-  sudo install -m 0755 -d (/etc/apt/keyrings)
-  sudo curl -fsSL https://download.docker.com/linux/debian/gpg -o /etc/apt/keyrings/docker.asc
-  cat /etc/apt/keyrings/docker.asc
-  sudo chmod a+r /etc/apt/keyrings/docker.asc
-  ls -l /etc/apt/keyrings/
- sudo systemctl status sshd > fichero2.txt
- ls -l | tee fichero2.txt
- tee fichero3.txt > /dev/null
- echo $USER
- echo \
  "deb [arch=$(dpkg --print-architecture) signed-by=/etc/apt/keyrings/docker.asc] https://download.docker.com/linux/debian \
  -  $(. /etc/os-release && echo "$VERSION_CODENAME") stable" | \
  sudo tee /etc/apt/sources.list.d/docker.list > /dev/null
  -  cat  /etc/apt/sources.list.d
  - cat /etc/apt/sources.list.d/docker.list
  -  sudo apt-get install docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin
  - sudo docker run hello-world
  -  docker images
  - 
 - docker pull httpd
 - docker run httpd
 -  docker run -d httpd
 - sudo docker stop 027f94a0a63d
 - docker run -it httpd bash
 - curl http://151.101.134.132:80
 - docker run -it httpd bash
 - docker ps -a -q
 - docker stop $(docker ps -q)
 -  docker rm $(docker ps -a -q)
 - docker exec -it 90a76d6fc265 /bin/bash
 - docker run -d  -p 81:80 --name web1 httpd
 - docker inspect web1
 - docker run -d --name web1 httpd
 - docker rmi $(docker images -q)
 - docker start  nostalgic_perlman
 - docker rmi httpd