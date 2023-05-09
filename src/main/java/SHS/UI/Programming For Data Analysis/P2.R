install.library("dplyr")
library(dplyr)

 
#READ FILE
pfda = read.csv("C:\\Users\\User\\Desktop\\Programming For Data Analysis\\assignment\\employee_attrition.csv"
                ,header=TRUE)
View(pfda)

#LIST AND RENAME FILE
names(pfda)
names(pfda)=c("Employee_ID","Record_Date","BirthDate","OrigHireDate","TerminationDate","Age",
              "LengthofService","CityName","DepartmentName", "JobTitle","StoreName","Gender_Short",
              "Gender_Full","Termreason","Termtype","Status_Year","Status","Business_Unit")
names(pfda)
View(pfda)

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

