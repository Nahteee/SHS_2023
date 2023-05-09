#Lab 2 Basic of R

#Basic Math Calculation

3+4
3+5+7

6-4
5-8
8-3-2

8*6
8*2*3

4/3

9%%4

# Operator Precedence
# Preference order: (),%%,*/,+-,=

2+5*2-1

(2+5)*2-1

2+(5*2)-1

2+5*(2-1)

2+5*6-3%%2  #2+5*6-1 -> 2+30-1 -> 32-1 -> 31



# Variables
# Letters, numbers, . , _ (must start with a letter)

x=10
x1=20
x.y=30
x_y=50
x*=30   #invalid
1x=50   #invalid

y<-30
40->y

assign("z",50)
z

j=300
j
rm(j) #remove(j)
j


# Data types (numeric,character,date and logical)
# class function can be use to find out the data type 
# L is a function that helps convert numeric to integer (if there is decimal, 
# then is not possible)
# as. function can help to convert data type
# if want something in character, put ""

x=10
x
class(x)
y=10.5
y
class(y)

x=10L
x
class(x)

y=10.5
class(y)
y=as.integer(y)
class(y)

z="Hello"
class(z)

k="TP234385"
class(k)

2==3

var = 2 <3
var # return either true or false 
class(var)

date1<-"05-03-2023"
date1
class(date1)

date1<-as.Date("01-03-2023") #as.Date(date1)
class(date1)


# is. function to validate/check if the data type is correct 
# will return either true or false 

x=5
is.numeric(x)

i=5L
is.integer(i)

str="hello"
is.character(str)

k=5
is.logical(5)

# Summary

#  - Basic Maths operators(+,-,*,/,%%)
#  - Operator Precedence
#  - variable declarations(=,->,<-,assign)
#  - rm or remove-> remove a variable
#  - class -> to know the datatypes(numeric,integer,character,logical,date)
#  - is.  -> checking/testing the data type
#  - as.  -> convert the data type

# Practice Questions

#Try variable assigning:
#     i.    Define a new variable, "weeks", then assign 4 to it using the operator (<-).
#     ii.    Define a new variable, "hoursPerWeek", then assign 40 to it using the operator (=).
#     iii.Define a new variable, "hourlyRate", then assign 50 to it using assign function.  
#     iv. Remove the variable "hourlyRate" and update with "HOURLYRATE"
#     v.  Convert weeks to datatype integer
#     vi.    "bonuse" as integer and assign 1000 to it.
#     vii.    "tax" as numeric and assign 0.2 to it.
#     viii.    Calculate the gross salary(W X HPW X HR) and net salary(grossSal X (1-tax))

weeks<-4
hoursPerWeek=40
assign("hourlyRate",50)
rm(hourlyRate)
hourlyRate
HOURLYRATE=50
weeks=as.integer(4)
class(weeks)
bonuse=1000
bonuse=as.integer(1000)
class(bonuse)
tax=0.2
tax=as.numeric(0.2)
class(tax)
gross_salary=weeks*hoursPerWeek*HOURLYRATE
gross_salary
net_salary=(gross_salary*(1-tax))
net_salary