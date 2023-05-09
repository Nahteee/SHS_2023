#NAME : HANSON YIP KIN MING
#TP NUMBER : TP061518

#READ FILE
pfda = read.csv("C:\\Users\\User\\Desktop\\Programming For Data Analysis\\assignment\\employee_attrition.csv"
                ,header=TRUE)
pfda
View(pfda)

# import
install.packages("dplyr")
library(dplyr)
install.packages("ggplot2")
library(ggplot2)
install.packages("plotrix")
library(plotrix)

# Data Exploration
#LIST AND RENAME COLUMN
names(pfda)
names(pfda)=c("Employee_ID","Record_Date","BirthDate","OrigHireDate","TerminationDate","Age",
              "LengthofService","CityName","DepartmentName", "JobTitle","StoreName","Gender_Short",
              "Gender_Full","Termreason","Termtype","Status_Year","Status","Business_Unit")
names(pfda)
View(pfda)
# How many columns 
nrow(pfda)
# How many rows
ncol(pfda)
# Data Summary
summary(pfda)

#QUESTION 1 - What drives people to choose not to keep their jobs at the company?

#How many employees voluntarily retired
voluntary = nrow(pfda[pfda$Termtype=="Voluntary",])
voluntary

#How many employees involuntarily retired
involuntary = nrow(pfda[pfda$Termtype=="Involuntary",])
involuntary

# pie chart
x <- c(1270,215)
label = c("Voluntarity","Involuntarily")
lbl <- paste0(round(100*x/sum(x),2),"%")
colors <- c("orange","yellow")
pie(x,labels = lbl, main = "Retirement ",col= colors)
legend("top", label, fill = colors)

#Summary of termination type
terminationtype = factor(pfda$Termtype)
summary(terminationtype)

#Summary of termination reason
terminationreason = factor(pfda$Termreason)
summary(terminationreason)

#Most common reason employee being terminated
reason = names(sort(summary(factor(pfda$Termreason)),decreasing = TRUE)[2:4])
reason 

#What is the average age employees retired voluntarily
age=factor(pfda[pfda$Termreason=="Retirement" & pfda$Termtype=="Voluntary",]$Age)
age

average_age = round(mean(as.numeric(as.character(age))),digits=2)
average_age

#What is the average length of service of those retired employee
lengthofservice = factor(pfda[pfda$Termreason=="Retirement",]$LengthofService)
lengthofservice

average_length = round(mean(as.numeric(as.character(lengthofservice))),digits=2)
average_length

#The maximum length of service and minimum length of service of retired employee

maxlength = max(as.numeric(as.character(lengthofservice)))
maxlength
minlength = min(as.numeric(as.character(lengthofservice)))
minlength

#Number of current active employee 
activeemp = nrow(pfda[pfda$Status=="ACTIVE",])
activeemp

#The average age of current active employee
active_age = factor(pfda[pfda$Status=="ACTIVE",]$Age)
active_age
average_active = round(mean(as.numeric(as.character(active_age))),digits=2)
average_active

# Gap between average age of current active employee and  retired employee
average_age_to_retired = average_age-average_active
average_age_to_retired

#The rate of retirement 
employee = as.numeric(nlevels(factor(pfda$Employee_ID)))
employee
volunteer = nrow(pfda[pfda$Termreason=="Retirement" & pfda$Termtype=="Voluntary",])
volunteer
rate = round(as.numeric(volunteer)/as.numeric(employee),digits=2)
rate

#The rate of retirement in headoffice
headoffice = nrow(pfda[pfda$Business_Unit=="HEADOFFICE",])
headoffice
activehead  = nrow(pfda[pfda$Business_Unit=="HEADOFFICE"&pfda$Status=="ACTIVE",])
activehead
retirehead = nrow(pfda[pfda$Business_Unit=="HEADOFFICE"&pfda$Status=="TERMINATED",])
retirehead
head_rate = round((as.numeric(retirehead))/(as.numeric(headoffice)),digits=2)
head_rate

#The rate of retirement in stores
office = nrow(pfda[pfda$Business_Unit=="STORES",])
office
activeoffice = nrow(pfda[pfda$Business_Unit=="STORES"&pfda$Status=="ACTIVE",])
activeoffice
retireoffice = nrow(pfda[pfda$Business_Unit=="STORES"&pfda$Status=="TERMINATED",])
retireoffice
office_rate = round((as.numeric(retireoffice))/(as.numeric(office)),digits=2)
office_rate

#What are the estimated amount of retirement in the upcoming 5 years
latest = factor(pfda[pfda$Status_Year=="2015"&pfda$Status=="ACTIVE",]$Age)
working = as.vector(latest)
age=factor(pfda[pfda$Termreason=="Retirement" & pfda$Termtype=="Voluntary",]$Age)
average_age = round(mean(as.numeric(as.character(age))),digits=2)


Year1=0
Year2=0
Year3=0
Year4=0
Year5=0

for (i in working)
{
  if((as.numeric(i)+1)>=average_age)
  {
    Year1 = Year1+1
  }else if ((as.numeric(i)+2)>=average_age)
  {
    Year2 = Year2+1
  }else if ((as.numeric(i)+3)>=average_age)
  {
    Year3 = Year3+1
  }else if ((as.numeric(i)+4)>=average_age)
  {
    Year4 = Year4+1
  }else if ((as.numeric(i)+5)>=average_age)
  {
    Year5 = Year5+1
  }
}

Year = c(Year1,Year2,Year3,Year4,Year5)
next5= c("2016","2017","2018","2019","2020")
plot(next5,Year,type="o",col="chocolate3",xlab = "Year",ylab ="Retirement Count",
     main="Estimated amount of retirement in the upcoming 5 years")


# Question 2 
# What is the cause of the employee's resignation and what position did they hold?	

# The total number of resignation 
resign = summary(factor(pfda[pfda$Termreason=="Resignaton",]$Termreason))
resign


# The percentage of resignation 
resignrate = round((as.numeric(resign))/(as.numeric(employee)),digits=2)
resignrate

# The average age of resignation 
pfda %>% select (Termreason,Age) %>%
  subset(Termreason=="Resignaton") %>%
  summarise(avgresign = mean(Age))

# The highest and lowest age of resignation 
pfda %>% select (Termreason,Age) %>%
  subset(Termreason=="Resignaton") %>%
  summarise(highresign = max(Age),lowresign = min(Age))

# The average number of resignation of each age
no = as.vector(summary(resignage))
no
eachage = round(mean(as.numeric((as.character(no)))),digits = 2)
eachage

# Which age has the highest amount of resignation
age_total = sort(summary(resignage),decreasing = TRUE)[1]
age_total

# The average rate of resignation 
resignperyear = summary(factor(pfda[pfda$Termreason=="Resignaton",]$Status_Year))
resignno = as.vector(resignperyear)
ave_resign = round(mean(as.numeric(as.character(resignperyear))),digits=2)
ave_resign
  
# What are the amount of resignation per year
library(ggplot2)
yr = names(resignperyear)
yr
amount = resignno
no = data.frame(yr,amount)
no
ggplot(no,aes(x=yr,y=amount))+
  geom_bar(stat="identity",fill="green")+
  theme(text=element_text(size=10))+
  ylab("Amount of resignation")+xlab("Year")+ggtitle("Amount of resignation per year")

# In 2012, which age group has the highest termination count
yr2012 = summary(factor(pfda[pfda$Status=="TERMINATED"&pfda$Status_Year=="2012",]$Age))
nooo=as.vector(yr2012)
aggg=names(yr2012)
plot(aggg,nooo,type="o",xlab = "Age",ylab = "Number of termination",
     main="Number of termination per age group in 2012")

# Which position has the highest resignation count for employee age 30
job = summary(factor(pfda[pfda$Age=="30"&pfda$Termreason=="Resignaton",]$JobTitle))
tt = names(job)
rc = as.vector(job)
jtr = data.frame(tt,rc)
jtr
ggplot(jtr,aes(x=tt,y=rc))+
  geom_bar(stat="identity",fill="chartreuse1")+
  theme(text=element_text(size=10))+
  ylab("Number of Resignation")+xlab("Job Position")+ggtitle("Rosition with the highest resignation count for employee age 30")

# Question 3
# The underlying reason leading to high termination count in 2014

# How many employees' job are being terminated every year
tesm = as.vector(summary(factor(pfda[pfda$Status=="TERMINATED",]$Status_Year)))
yr = names(summary(factor(pfda$Status_Year)))

library(ggplot2)
# Create data for chart
ldf <-data.frame(tesm,yr)
ldf
# Basic Line
lg<- ggplot(data=ldf, aes(x=yr, y=tesm, group=1)) +
  geom_line(color="blue",size=1)+
  geom_point()

lg+ggtitle("Number of employee being terminated every year")+
  labs(x="Year",y="Number of Employees")

# Which year has the greatest number of termination
highest = sort(summary(factor(pfda[pfda$Status=="TERMINATED",]$Status_Year)),decreasing=TRUE)[1]
highest

# The reason resulting in the amount of termination in 2014
reason = factor(pfda[pfda$Status_Year=="2014",]$Termreason)
rr = summary(reason)
rr
main = names(sort((rr),decreasing=TRUE)[2])
main

# The correlation between termination and layoff
layoff = sort(summary(reason),decreasing = TRUE)[2]
totaltermination = sum(sort(summary(reason),decreasing=TRUE)[2:4])
correlation = round(as.numeric(layoff)/as.numeric(totaltermination),digits=2)
correlation

# The average age being layoff in 2014
lay = factor(pfda[pfda$Status_Year=="2014"&pfda$Termreason=="Layoff",]$Age)
avglayage = round(mean(as.numeric(as.character(lay))),digits=2)
avglayage

# The highest age as well as lowest age being layoff
highage = max(as.numeric(as.vector(lay)))
lowage = min(as.numeric(as.vector(lay)))
highage
lowage

# The average period served by those employee that are laid off
period = factor(pfda[pfda$Status_Year=="2014"&pfda$Termreason=="Layoff",]$LengthofService)
avgperiod = round(mean(as.numeric(as.character(period))),digits=2)
avgperiod

# The highest  as well as lowest period served by those employee that are laid off
highperiod = max(as.numeric(as.vector(period)))
lowperiod = min(as.numeric(as.vector(period)))
highperiod
lowperiod

# Total number of employees in each department in 2014
edep = factor(pfda[pfda$Status_Year=="2014",]$DepartmentName)
name = names(summary(edep))
noofemp = as.vector(summary(edep))
empdata = data.frame(Department=name,Amount=noofemp)
empdata

# The number of termination of each department in 2014
term2014 = summary(factor(pfda[pfda$Status_Year=="2014"&pfda$Status=="TERMINATED",]$DepartmentName))
term2014

# Department with highest and lowest amount of termination in 2014
high2014 = sort(summary(factor(pfda[pfda$Status_Year=="2014"&pfda$Status=="TERMINATED",]$DepartmentName))
                ,decreasing=TRUE)[1]
high2014
low2014 = sort(summary(factor(pfda[pfda$Status_Year=="2014"&pfda$Status=="TERMINATED",]$DepartmentName))
               ,decreasing=FALSE)[1:4]
low2014

# The amount of employee that served for lesser than 5 years and which department do they belong to
l5y  = summary(factor(pfda[pfda$Status_Year=="2014"&pfda$Termreason=="Layoff"
                           &pfda$LengthofService<=5,]$Age))
l5y
dep = summary(factor(pfda[pfda$Status_Year=="2014"&pfda$Termreason=="Layoff"
                          &pfda$LengthofService<=5,]$DepartmentName))
dep

# Relationship between gender and the status of employee
#1 - Number of male and female employee
gender <- table(pfda$Gender_Short)
gender

#2 - Gender ratio 
library(plotrix)
x <- c(23755,25898)
label = c("Male","Female")
lbl <- paste0(round(100*x/sum(x),2),"%")
colors <- c("blue","red")
pie3D(x,labels = lbl,explode = 0.1, radius=0.9, main = "Employees ",col= colors)
legend("left", label, fill = colors)

#3  - The number of active male and female employees
male = nrow(pfda[pfda$Gender_Short=="M"&pfda$Status=="ACTIVE",])
male
female = nrow(pfda[pfda$Gender_Short=="F"&pfda$Status=="ACTIVE",])
female
activemf = c(23185,24983)
barplot(activemf,
        main = "Gender Distribution Among Active Employee",
        xlab = "Number of Active Employees",
        ylab = "Gender",
        names.arg = c("Male","Female"),
        col = "blue",
        horiz = TRUE)

#4 - The number of terminated male and female employees
mm = nrow(pfda[pfda$Gender_Short=="M"&pfda$Status=="TERMINATED",])
mm
fm = nrow(pfda[pfda$Gender_Short=="F"&pfda$Status=="TERMINATED",])
fm
termmf = c(570,915)
barplot(termmf,
        main = "Gender Distribution Among Terminated Employee",
        xlab = "Number of Terminated Employees",
        ylab = "Gender",
        names.arg = c("Male","Female"),
        col = "red",
        horiz = TRUE)

#5 Male and female voluntarily retirement rate
mvol = nrow(pfda[pfda$Termtype=="Voluntary"&pfda$Gender_Full=="Male",])
mvol
ratevol = round(as.numeric(mvol)/as.numeric(voluntary),digits = 2)
ratevol
fvol = nrow(pfda[pfda$Termtype=="Voluntary"&pfda$Gender_Full=="Female",])
fvol
ratefvol = round(as.numeric(fvol)/as.numeric(voluntary),digits = 2)
ratefvol

#6 Male and female involuntarily retirement rate 
minvol = nrow(pfda[pfda$Termtype=="Involuntary"&pfda$Gender_Full=="Male",])
minvol
rateinvol = round(as.numeric(minvol)/as.numeric(involuntary),digits = 2)
rateinvol
finvol = nrow(pfda[pfda$Termtype=="Involuntary"&pfda$Gender_Full=="Female",])
finvol
ratefinvol = round(as.numeric(finvol)/as.numeric(involuntary),digits = 2)
ratefinvol

#7 - Termination count of female employee per year 
agg = summary(factor(pfda[pfda$Status=="TERMINATED"&pfda$Gender_Full=="Female",]$Age))
yrrf = names(agg)
contf = as.vector(agg)

plot(yrrf,contf,type="o",col="purple",xlab = "Age of female employee",ylab = "Number of employees",
     main = "Termination count of female employee")


#8 - Number of active females
library(ggplot2)
agt = summary(factor(pfda[pfda$Status=="ACTIVE"&pfda$Gender_Full=="Female",]$Age))
yrf = names(agt)
conf = as.vector(agt)
act = data.frame(yrf,conf)
act
ggplot(act,aes(x=yrf,y=conf))+
  geom_bar(stat="identity",fill="orange")+
  theme(text=element_text(size=10))+
  ylab("Number of employees")+xlab("Age of female employee")+ggtitle("Number of Active Female Employees")


#9 - What factor contributes to female termination count
rrrr = summary(factor(pfda[pfda$Status=="TERMINATED"&pfda$Gender_Full=="Female",]$Termreason))
rrrr

frr <- c(113,211,591)

barplot(frr, 
        main= "Reason for female termination",
        xlab= "Number of employees",
        ylab="Termination Reason",
        names.arg=c("Layoff","Resignation","Retirement"),
        col="brown",
        horiz=TRUE)


#10 - What is the reason for termination for age 30 female 
re30 = summary(factor(pfda[pfda$Gender_Full=="Female"&pfda$Age=="30",]$Termreason))
re30
library(plotrix)
x <- c(3,73)
label = c("Layoff","Resignation")
lbl <- paste0(round(100*x/sum(x),2),"%")
colors <- c("pink","yellow")
pie3D(x,labels = lbl,explode = 0.1, radius=0.9, main = "Reason for termination for age 30 Female "
      ,col= colors)
legend("topright", label, fill = colors)

#11 - What is the reason for termination for age 65 female 
re65 = summary(factor(pfda[pfda$Gender_Full=="Female"&pfda$Age=="65",]$Termreason))
re65
retfemale<-c(591)
barplot(retfemale,
        main = "Reason for termination for age 65 Female",
        xlab = "Count",
        ylab = "Reason",
        names.arg = c("Retirement"),
        col = "purple",
        horiz = TRUE)

#10 - Termination count of male employee per year
agm = summary(factor(pfda[pfda$Status=="TERMINATED"&pfda$Gender_Full=="Male",]$Age))
agm
yrrm = names(agm)
contm = as.vector(agm)
plot(yrrm,contm,type="o",col="brown",xlab = "Age of Male employee",ylab = "Number of employees",
     main = "Termination count of Male employee")


#11 - Number of active male in existing age group
library(ggplot2)
agmt = summary(factor(pfda[pfda$Status=="ACTIVE"&pfda$Gender_Full=="Male",]$Age))
yrm = names(agmt)
conm = as.vector(agmt)
actm = data.frame(yrm,conm)
actm
ggplot(actm,aes(x=yrm,y=conm))+
  geom_bar(stat="identity",fill="lightblue")+
  theme(text=element_text(size=10))+
  ylab("Number of employees")+xlab("Age of Male employee")+ggtitle("Number of Active Male Employees")

#12 - What factor contributes to male termination count 

rrr = summary(factor(pfda[pfda$Status=="TERMINATED"&pfda$Gender_Full=="Male",]$Termreason))
rrr

mrr <- c(102,174,294)
barplot(mrr, 
        main= "Reason for Male termination",
        xlab= "Number of employees",
        ylab="Termination Reason",
        names.arg=c("Layoff","Resignation","Retirement"),
        col="grey",
        horiz=TRUE)

#13 - What are the reason for termination for age 21 Male 
re21 = summary(factor(pfda[pfda$Gender_Full=="Male"&pfda$Age=="21",]$Termreason))
re21

library(plotrix)
x <- c(2,36)
label = c("Layoff","Resignation")
lbl <- paste0(round(100*x/sum(x),2),"%")
colors <- c("blue","red")
pie3D(x,labels = lbl,explode = 0.1, radius=0.9, main = "Reason for termination for age 21 Male "
      ,col= colors)
legend("topright", label, fill = colors)

#14 - What are the reason for termination for age 60 Male 
re60 = summary(factor(pfda[pfda$Gender_Full=="Male"&pfda$Age=="60",]$Termreason))
re60
retmale<-c(294)
barplot(retmale,
        main = "Reason for termination for age 60 Male",
        xlab = "Count",
        ylab = "Reason",
        names.arg = c("Retirement"),
        col = "orange",
        horiz = TRUE)




































































































































































































































































































































































































































































































































































