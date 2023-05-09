
#                     Data Frame & List        
# Data Frames

# Write an R program to create an empty data frame with  data.frame()

df = data.frame()
df

#Ex
n = c(2,3,4)
s = c("aa","bb","cc")
b = c(TRUE,FALSE,FALSE)
df = data.frame(n,s,b)
df

#Ex2 
s=1:5
n=c("Ali","Abu","Bob","John","Lee")
m = runif(5,1,100)
m = round(m,digit=2)
cc = data.frame(s,n,m)
cc

nrow(cc) #shows the number of rows
ncol(cc) #shows the number of columns
dim(cc) #shows number of rows and columns
names(cc) #show column naming

new_cc = data.frame(SL=s,Name=n,Marks=m) #change column names
new_cc

names(new_cc)

new_cc["Name"] #Show specific the column name
new_cc$Name    #Show specific column according to keyword   #best
new_cc[,2]     #Show specific column number

new_cc[3,]    #show only 3rd row
new_cc[2:4,]  #show rows from 2nd to 4th row
new_cc[3,2]   #3rd row, 2nd column element

#add new row
add_cc = c(SL=6,Name="Fing",Mark=24.52)
add_cc
new_cc = rbind(add_cc,new_cc)
new_cc

#add new column
grade = c("B","A","C","B","A","A")
new_cc = cbind(new_cc,grade)
new_cc

new_cc$grade=NULL
new_cc

#                     List

n = c(2,3,5)
b = c(TRUE,FALSE,FALSE,TRUE)
s = c("aa","bb","cc","dd")
x = list(n,b,s,3)
x

# [[]] shows the position of element of x 
# [] shows the value of the element in the position of element of x


#Practice Questions:

#I.  Write a program to create a data frame from given vectors.
#             1. Assign slno in vector with 1 to 5
#             2. Assign gender in vector with 'M' and 'F'
#             3. Assign name in vector with characters
#             4. Assign account no according to your choice 
#             5. Assign amount with random numbers within 1000 and 5000 using runif command(2 decimal point only)
#             6. Assign 'bank_record' in data frame with no, name,account no, gender, amount
#             7. Rename the column names appropriate for the data.

#II. Extract specific column "name" and "account no" from the data frame. 
#III.Extract the first two rows from the given data frame.
#IV. Add a new column called "Nominee"
#VI. Delete column "nominee" from the given data frame.

slno = 1:5
gender = c("M","F","M","M","F")
name = c("Ali","Abu","John","Lee","Bob")
accountno = c("1","3","5","8","4")
amount = runif(5,1000,5000)
amount = round(amount,digit=2)
amount
bank_record = data.frame(slno,name,accountno,gender,amount)
bank_record
bank_record = data.frame(no=slno,name=name,accountno=accountno,gender=gender,amount=amount)
bank_record

bank_record$name
bank_record$accountno
bank_record[1:2,]
Nominee = c("Tan","Ken","Fing","Ang","Chua")
new_bank_record = cbind(bank_record,Nominee)
new_bank_record
new_bank_record$Nominee=NULL
new_bank_record








