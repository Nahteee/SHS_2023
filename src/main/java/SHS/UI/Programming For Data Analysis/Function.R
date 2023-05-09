# FUNCTIONS

#   func_name <- function (arguments) 
#   {
#      // statements
#      //return(value)
#   }

# create function called "display" and print "welcome"
display <- function()
{
  print("Welcome")
}
display()

#1 create a function for sum of two numbers by passing through parameters
plus <- function(x,y)
{
  z=x+y
  return(z)
}
plus(5,4)

#2 assign directly
plus <- function()
{
  x=34
  y=56
  z=x+y
  return(z)
}
plus()

#3 getting values from user
plus <- function()
{
  x = as.integer(readline(prompt = "Enter the number: "))
  y = as.integer(readline(prompt = "Enter the number: "))
  z=x+y
  return(z)
}
plus()

# create a function for a calculator program
calculator <- function(x,y)
{
  add=x+y
  sub=x-y
  mul=x*y
  div=x/y
  return(c(Addition=add,Subtration=sub,Multiplication=mul,Division=div))
}
calculator(56,70)


# create a function call getdetails() and accept name,id,Mark1,Mark2 of one student
# and print all these data along with Total marks and Average

getdetails <- function()
{
  name=as.character(readline(prompt= "Enter your name: "))
  id=as.integer(readline(prompt= "Enter your id: "))
  m1=as.integer(readline(prompt= "Enter your Mark1: "))
  m2=as.integer(readline(prompt= "Enter your Mark2: "))
  Total=m1+m2
  A=(m1+m2)/2
  return(c(Name=name,ID=id,Mark1=m1,Mark2=m2,TotalMark=Total,Average=A))
}
getdetails()








