#         Data Exploration
#import data
#cleaning data
#pre-processing data
#data exploration
#data visualization
#data manipulation


# --------------------------
#read_file
sample_data = read.csv("C:\\Users\\User\\Desktop\\Programming For Data Analysis\\IRIS.csv",header=FALSE)
sample_data

#assigning headers
names(sample_data)=c("SEPAL_LENGTH","SEPEL_WIDTH","PETAL_LENGTH","PETAL_WIDTH","SPECIES")
sample_data

#different viewing methods
# for first 6 lines
head(sample_data) #default 6 lines
head(sample_data,10)
tail(sample_data,10)


#view all data
sample_data
View(sample_data)

#view only title/heading
names(sample_data)

#how data stored
class(sample_data)
length(sample_data)
ncol(sample_data)
nrow(sample_data)

#view heading
names(sample_data)

#-----------------------
# data exploration
sample_data$SEPAL_LENGTH

max(sample_data$SEPAL_LENGTH)
min(sample_data$SEPAL_LENGTH)

#average
summary(sample_data$SEPAL_LENGTH)

summary(sample_data)

#summary function only give you information about numeric data

#categories of species
factor(sample_data$SPECIES) #list out the categories

nlevels(factor(sample_data$SPECIES)) #how many categories are there

#access rows 
sample_data[2,3] #2nd row and 3rd column data 
sample_data[142,] #complete 142nd row
sample_data[48:64,] #print rows from 48th line until 64 line

#Get all "Iris-versicolor"
sample_data[sample_data$SPECIES=="Iris-versicolor",]  #writing condition with categorical data

#Eg: employee[employee$dept=="Meat",]
#Eg: employee[employee$designation=="Driver",]
#Eg: employee[employee$age<25,]
#Eg: employee[employee$workexp>25,]


sample_data[sample_data$SEPEL_WIDTH]

sample_data[sample_data$SEPEL_WIDTH>=4,]

sample_data[(sample_data$SEPEL_WIDTH>4)&(sample_data$SEPEL_WIDTH>0.3),]  #two condition

#Eg: employee[(employee$age<25,)&(employee$termination type=="voluntary",)]


