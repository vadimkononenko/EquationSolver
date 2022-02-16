# EquationSolver

This CLI solves quadratic equation.

# How to run?

You have to make sure JDK(Java Development Kit) 1.8 or latest is installed. If you don't have JDK you can download it from [here](https://www.java.com/ru/download/manual.jsp).

```
$ git clone https://github.com/vadimkononenko/EquationSolver
```

### Then you must compile Main.java

```
$ javac */file_path/Main.java*
```

### Now you can run application

```
$ java Main
```

# How to use?

## Non-interactive mode

To start non-interactive mode you need to write:

```
$ java Main 'file_name'.txt
```

You can use file names: test_valid.txt , test_invalid.txt , test_zero.txt .

## Interactive mode

To start interactive mode you need to write:

```
$ java Main
```

Then you have to enter coefficients one-by-one

### Example:

```
$ java Main
a = 2
b = 4
c = 2
Equation is: (2.0) x^2 + (4.0) x + (2.0) = 0
x1 = -1.0
```

# Revert commit

["Wrong commit to revert" [0622bd5]](https://github.com/vadimkononenko/EquationSolver/commit/0622bd58af3545e92d2d13cef2487505ad689bf6)