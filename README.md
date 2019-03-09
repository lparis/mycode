# mycode
Repo for my code

## Git Access

Set remote to use SSH

```
git remote set-url origin git@github.com:lparis/mycode.git
```

## cpp
My C++ code

### Compile and Run
On Mac, install GCC and CLANG

To compile: `g++ -std=c++11 -o program program.cpp`

For example: `g++ -std=c++11 -o HelloWorld HelloWorld.cpp`

To run: `./program`

For example: `./HelloWorld`

### Hello World in C++

Use to verify installation:

```
// Hello World in C++

# include <iostream>
using namespace std;

int main()
{
    cout << "\t\t\t Hello World!." << endl;
    cout << "The sum of 2 and 3 = " << 5 << endl;
    cout << "7 + 8 = " << 7 + 8 << endl;
    return 0;
}
```

## Go

My Golang code

### Install Go

How to install Go on Mac and run Go programs

#### 1. Download Go

Go provides binary distributions for Mac OS X, Windows, and Linux. If you are using a different OS, you can download the Go source code and install from source.

Download the latest version of Go for your platform here: [https://golang.org/dl/](https://golang.org/dl/).

#### 2. Install Go

Follow the instructions for your platform to install the Go tools: [https://golang.org/doc/install#install](https://golang.org/doc/install#install). It is recommended to use the default installation settings.

- On Mac OS X and Linux, by default Go is installed to directory `/usr/local/go/`, and the GOROOT environment variable is set to `/usr/local/go/bin`.

- On Windows, by default Go is installed in the directory `C:\Go`, the GOROOT environment variable is set to `C:\Go\`, and the bin directory is added to your Path (`C:\Go\bin`).

#### 3. Set GOPATH

Your Go working directory (GOPATH) is where you store your Go code. It can be any path you choose but must be separate from your Go installation directory (GOROOT).

The following instructions describe one way you can set your GOPATH. Refer to the official Go documentation for more details: [https://golang.org/doc/code.html](https://golang.org/doc/code.html).

**Mac OS X and Linux**

- Set the GOPATH environment variable for your workspace:

	```
	export GOPATH=$HOME/go
	```

- Also set the GOPATH/bin variable, which is used to run compiled Go programs.

	```
	export PATH=$PATH:$GOPATH/bin
	```

**Windows**

- Create a working directory that is not the same as your Go installation, for example, `C:\Users\%USERNAME%\go`, where is your default directory.

- Create the GOPATH environment variable:

	```
	set GOPATH=c:\Users\%USERNAME%\go
	```

- Add the GOPATH\bin environment variable to your PATH:

	```
	set PATH=%PATH%;%GOPATH%\bin
	```

- Create the required Go directory structure for your source code:

	- `C:\GOPATH\bin`
	- `C:\GOPATH\pkg`
	- `C:\GOPATH\src`

#### 4. Test Go installation

Create and run the *hello.go* application described here: [https://golang.org/doc/install#testing](https://golang.org/doc/install#testing).

If you set up your Go environment correctly, you should be able to run "hello" from any directory and see the program execute successfully.

## Java

My Java code

### Install Java


