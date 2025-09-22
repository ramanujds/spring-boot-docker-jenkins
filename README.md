## Setup Jenkins

## Stop and Disable Apache Server
```bash
sudo systemctl disable apache2
 
sudo systemctl stop apache2
```
 

### Add Jenkins Repository and Key

```bash
sudo wget -O /etc/apt/keyrings/jenkins-keyring.asc \
  https://pkg.jenkins.io/debian-stable/jenkins.io-2023.key

echo "deb [signed-by=/etc/apt/keyrings/jenkins-keyring.asc] \
  https://pkg.jenkins.io/debian-stable binary/" | sudo tee \
  /etc/apt/sources.list.d/jenkins.list > /dev/null
```

### Install Jenkins

```bash
sudo apt-get update
sudo apt-get install jenkins -y
```

### Start Jenkins

```bash
sudo systemctl start jenkins
```

### Enable Jenkins to Start on Boot

```bash
sudo systemctl enable jenkins
```

### Retrieve Admin Password

```bash
sudo cat /var/lib/jenkins/secrets/initialAdminPassword
```

> Example output: `a06a10b4c80a4ca08c70baf638407096`

### Install Recommanded Plugins

### Go to Manage Jenkins -> Tools -> Add Maven, Git, Java

## Docker Setup for Jenkins

### Add Permissions

```bash
sudo usermod -aG docker $USER && newgrp docker
```

### Allow Jenkins to Access Docker

```bash
sudo usermod -a -G docker jenkins
```

## Restart Jenkins

http://localhost:8080/restart



