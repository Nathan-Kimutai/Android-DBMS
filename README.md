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
Afer cloning the repository and changing to that directory open android studio on that directory and let the gradle finish building
Note that this may take a longer time depending on your internet connection and the bandwith
So you should be patient

##Starting the app
* To start running the app make sure that you have installed all the usb drivers required that is if you are a windows user
* But if you are using linux or mac there is no need of installing the drivers
* Make sure you have an android phone running atleast android 4
* Make sure you have a usb cable to connect to your computer while debugging
* You can also use an emulator but i prefer you use a real phone

If the phone is not detected try restarting adb server on the top right corner of you screen



## Trying to login with the wrong input
![Input Validation](/app/src/main/res/drawable/inputvalidation.jpg)

As you can see on the above image that if you enter the wrong input the app will check for the validity of the input
Make sure you use admin as the email in the email field to continue to the next section


## Technologies used
In the following app we used the following technologies
* Java
* XML
* Android Studio framework

## Contributions
You can contribute to this project by making a pull request

## About me
`Nathan Kimutai` Java and Python programmer

## Licence
The license MIT &copy;

