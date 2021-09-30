*Jonathan Song (with Gabriel Thompson and Hamim Seam; The Linux Lizards)*

*APCS*

*HW06 -- Paradigms*

*2021-09-28*

## Hello World Code
### DrRacket (run in Beginner Student mode)
```
(define say_hi "Hello, World!")
say_hi
```
### NetLogo
```
to say_hi
	print "Hello, World!"
end
```
### Python
```
print("Hello, World")
```

## Comparisons
### Similarities
- All of the three programming languages use double quotations to denote strings.
- Both NetLogo and Python of the programming languages use the function `print` to refer to visually displaying text.
- Both DrRacket and Python use parenthesis to represent some aspect of a function.
- Both DrRacket and NetLogo require you to declare functions to run the code (unless ran directly from the shell).
- Although not completely shown, both NetLogo and Python rely on indentation to determine how code is executed.
- Although not totally shown either, both NetLogo and Python2 both do not need parenthesis to run `print` functions, so NetLogo's `print` is identical to that of Python2. This does not hold true for Python3, which requires parenthesis.

### Differences
- Unlike NetLogo and DrRacket, Python allows you to run code without writing it in a function.
- Unlike Python and DrRacket, NetLogo requires you to use the separate statement `end` to end the function.
- While DrRacket and Python both use parenthesis, DrRacket uses parenthesis around entire statements, whereas Python only uses parenthesis to store the arguments of functions.
- Unlike Python and NetLogo, DrRacket (in this example) does not use a formal function statement to display `"Hello, World"`. Rather, when the function is ran, it automatically displays the return value.
- While Python and NetLogo emit the quotations when displaying `Hello, World`, NetLogo includes the quotations, instead printing:
	>"Hello World"
