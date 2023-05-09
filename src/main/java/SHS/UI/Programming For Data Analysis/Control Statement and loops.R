#                      Tutorial 4: Control Statements and Loops
#                   ==============================================
#                   Topics Covered:
#       1. if and else
#       2. ifelse
#       3. switch
#       4. for
#       5. while
#       6. repeat

#=========================================================================
#                  Operators for checking 
# equal to (==)
# less than (<)
# less than or equal to (<=)
# greater than (>)
# greater than or equal to (>=)
# not equal (!=)

#Check given number is positive
x= 10
if (x>0)                  #if(condition)
{                         #{
  print("x is +ve")       #   statement
}                         #}

#Check given number is positive or negative
x= -10
if (x>0)                  
{                         
  print("x is +ve")       
}else{                    #must go immediately after
  print("x is -ve")
}                        

#alternative method
x=100
ifelse(x>0,"x is +ve","-ve")
#condition true -> 2nd parameter, false -> 3rd parameter

#If the number is the positive, maintain the number; if the number is a negative
#number make it into zero. By using single if else
x=-1
ifelse(x>0,x,"0")

#assign value from user and check given number is +ve or -ve 
x=as.integer(readline(prompt="Enter the number: "))
#readline is in string; to convert use as.integer
if(x>0)
{
  print("x is +ve")
}else if(x<0)
{
  print("x is -ve")
}else
{
  print("x is zero")
}

#SWITCH STATEMENT
#Switch(option,val1,val2)
x=switch(3,"This","is","R","Tutorial","For","Beginner")
print(x)

options=as.integer(readline(prompt="Enter your colour option: ")) #choose option
x=switch(options,"Red","Black","Pink","Blue") #Get options
print(x) #Print option


#LOOPS(for,while,repeat)
# 1. initialization   2. final/condition  3.statement  4. iteration 
#       i=1                 i=30/i<=30      print(i)      i=i+1
#FOR
#for(var in initial:final)
for(i in 1:30)
{
  print(i)
}

#WHILE
#while(condition)
#{
#statement
#increment/iteration
#}
i=1
while(i<=30)
{
  print(i)
  i=i+1
}

#REPEAT
i=1              #initialization                                      #initialization
repeat           #repeat                                              do
{                #{                                                   {
  print(i)          #  statements                                        statements
  i=i+1             #  increment                                        increment
  if(i>30)       #  if(condition)<-   if condition false,it breaks    } while(condition);  }while(i<=30);
  {              #   {                                  
    break        #     break
  }              #  }
}                #}


# in do, while if condition is error it will run at least once
# in while loop, if condition is error it won't run at all

for(i in 1:20)
{
  print(i*i)
}

x=8/2+1*2-2*2 
x


TransactionNo = 1001:1005
Amount = c(15,27,39,51,63)
df = data.frame(TransactionNo, Amount)
df

y=5L
class(y)



bankrecord<-function()
{
  name = readline(prompt = "Enter your name:")
  accno = readline(prompt = "Enter your Account No: ")
  amount = as.double(readline(prompt = "Enter your amount: "))
  interest = as.double(readline(prompt = "Enter your interest: "))
  Total_current_Deposit = amount+interest
  print(name)
  print(accno)
  print(amount)
  print(interest)
  return(Total_current_Deposit)
}

bankrecord()




function_x <- function(v1){
  v<-c()
  for(item in v1){
    if(!(item %in% v)){
      v=c(v,item)
    }
  }
  return(v)
}

x=c(10,10,30,20,15)
y=c(40,30,10,50,30)
z=c(x,y)
xx=function_x(z)
xx








