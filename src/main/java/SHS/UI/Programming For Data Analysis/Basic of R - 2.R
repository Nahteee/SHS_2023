#Vectors

a=10
a=20
a=30
a=1:10
a
b=-5:60 #starting number colon end number
b
b[10] #to find the index
b[7]+b[3]

m=c(45,55,555,555) #exact value with function c - combine
m

#runif function randomly generate number for user 
#(how many number do you need,starting value,ending value)

z<-runif(3,1,40)
z 

names(z)=c("U.S","China","Malaysia") #names function to assign names to the variable
z

y=sample(-10:30,5,FALSE) #random function create random number with only integer
#(range,how many value,if want unique number use false,if don't want use true)')
y
length(y)

#For sequence(:) -> firstno:lastno
#For exact values(c()) -> c(v1,v2...)
#random values with decimal (runif()) -> runif(size,startno,lastno)
#random values with integers(sample) ->
              #sample(startno:lastno,size,T/F) (True->repeat)(False-> not repeat)


#Factor 

g=c("m","y","m","y","m","m","y")
class(g) #types of data
nlevels(g) 

g=factor(c("m","y","m","y","m","y","m","y","d"))
nlevels(g) #to find out how many categories are there
g # show the available categories

j<-c(4,7,1,34,89,45,23,90,10)
min(j)
max(j)
sum(j)
mean(j)
median(j)
sort(j)
sort(j,decreasing=TRUE) #descending order

y=22/7
y
round(y) # remove decimal
round(y,digit=2) #choose the amount of decimal required

sqrt(25) #square root of value

rep(10,5) #repeat(value,the number of times)
rep("*",10)
rep("'",10)

x="aergardagrdbsrdbtsd"
nchar(x) #find out the number of element

j<-c(1,4,6,88)
length(j) #find out number of character

x=10
y=20
z=x+y
message("Welcome to R programming lab")
message("The sum value is ",x+y)
print("Welcome to R programming")
message<-"235"
paste(message,"Hello")

install.packages("crayon")
library(crayon)

message("welcome to R programming Lab")
message(yellow("Welcome to R programming Lab"))

message(green$bgYellow("Welcome to"),blue$bold$underline("R programming"))

Y=5L
class(Y)


#Practical Question:# Create 5 students Progress Report with title "PFDA LAB Progress Report APD2F/APU2F2302"
# ***************************************
# PFDA LAB(Green colour)
#Progress Report(magenta colour,italics,underline)
# APDF/APU2F2302(yellow background,bold,red colour)
# print * using repeat command
# -1. Test-I marks have to generate using runif command(25)
# -2. Test-II marks have to generate using runif command(25)
# -3. Final Exam marks have to generate using sample command(50)
# -4. Round off both the test marks
# -5. Generate Total Marks
# -6. Give names to each Total_Marks to represent students
# Ali Mohd Sarah Tan Muthu
# 42 38 26 48 26
# -7. Find out the total number of students we have in the report
# -8. Find out what is the highest score 48
# -9. Find out what is the least mark 26
# -10. Find out the average of this class


message(green("PDFA LAB"))
message(magenta$underline$italic("Progress Report"))
message(bgYellow$bold$red("APDF/APU2F2302"))
rep("*",10)
a<-runif(1,0,25)
a 
message("Test 1= ",a)
b<-runif(1,0,25)
b 
message("Test 2= ",b)
c<-sample(0:50,1,FALSE)
c
message("Final Test= ",c)
round(a)
round(b)

t=a+b+c
message("Total Mark= ",t)

n=c(42,38,26,48,26)
n
names(n)=c("Ali","Mohd","Sarah","Tan","Muthu")
n
length(n)

max(n)

min(n)

mean(n)



