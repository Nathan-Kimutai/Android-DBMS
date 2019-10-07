# ADBMS

ADBMS or Android database management information system is an application that allows users to scan barcodes and qrcodes and save them in the clouds for analysis


## Author
[Nathan Kimutai](https://github.com/Nathan-Kimutai)

## Getting started
You can use the android studios' default editor [Idea IntelliJ](https://developer.android.com/studio)

If you don't have java already installed
Install JDK(Java Development Kit) through the following command:
```bash
sudo add-apt-repository ppa:webupd8team/java
sudo apt-get update
sudo apt-get install oracle-java8-installer
```
We use gradle as our dependency manager as it is scripted unlike maven so to install gradle, do the following:
```bash
sudo apt install gradle
```
To get started with the ADBMS you need to do the following :
```bash
mkdir myprojects
cd myprojects
git clone https://github.com/Nathan-Kimutai/Qx8re.git
```

## Usage
Afer cloning the repository and changing to that directory run the following commands to launch the app

```bash
gradle build
gradle run
```
In the terminal locate the url showing your spark server
You can navigate to [http://localhost:4567/](http://localhost:4567/) as it works with most spark appications
You can the add the animal which thereafter you can add to endangered animals

## Trying to login with the wrong input
### Posting department
![Posting](app/src/main/resources/public/images/postdepartments.png)
### Getting departments
![Get department](/app/src/main/res/drawable/inputvalidation.jpg)
## Technologies used
In the following app we used the following technologies
* Java
* Spark
* REST API

## Contributions
You can contribute to this project by making a pull request

## About me
`Nathan Kimutai` Java and Python programmer

## Licence
The license MIT &copy;

