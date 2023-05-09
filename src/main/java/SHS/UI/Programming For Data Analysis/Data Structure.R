#vector is a single dimensional data structure, holding same data type value
#matrix is two dimensional data structure, holding same data type value
#array is multi dimensional data structure, holding same data type value
#data frame is two dimensional data structure, that can hold multiple data type value
#list is single dimensional data structure, that can hold multiple data type value

#           Matrix

#matrix(data,nrow,ncol,byrows,dimnames)
#create a blank matrix with matrix()

m1 = matrix()
m1

#create a matrix taking a given vector (1 to 8) of numbers as 

v1 = 1:8   #pass in a sequence of number into a variable
m1 = matrix(v1)  
m1

m1 = matrix(1:8) #pass in a sequence of number into a function
m1

m1 = matrix(c(1,2,3,4,5,6,7,8)) #pass in exact value [c to combine]
m1

m1 = matrix(1:8,2,4) #pass in sequence of number,number of row,number of column)
m1

m1 = matrix(1:8,2,4,TRUE) 
m1

# Write a R program to create a matrix taking a given vector of numbers as input.
# v1 = 1:8
# Then, give names for its columns and rows. Finally, display the matrix.
# matrix(data = NA, nrow = 1, ncol = 1, byrow = FALSE, dimnames = NULL)
v1 = 1:8
m1 = matrix(v1, 2, 4)
colnames(m1) = c("c1", "c2", "c3", "c4")  #specify columns name
rownames(m1) = c("r1", "r2")  #specify row name 
m1

m1=matrix(1:8,2,4,FALSE,list(c("r1", "r2"),
                                c("c1", "c2", "c3", "c4")))
m1

m1=matrix(data=v1,nrow=2,ncol=4,byrow=TRUE,dimnames=list(c("r1", "r2"),
                                                          c("c1", "c2", "c3", "c4")))
m1 #used when unsure about the order of the parameter


v1 = 1:24
m1 = matrix(v1,4,6)
colnames(m1) = c("COL1","COL2","COL3","COL4","COL5","COL6")
rownames(m1) = c("ROW1","ROW2","ROW3","ROW4")
m1

m1=matrix(1:24,4,6,FALSE,list(c("ROW1","ROW2","ROW3","ROW4"),
                              c("COL1","COL2","COL3","COL4","COL5","COL6")))
m1


v1 = 1:24
m1=matrix(data=v1,nrow=4,ncol=6,byrow=TRUE,dimnames=list(c("ROW1","ROW2","ROW3","ROW4"),
                                                         c("COL1","COL2","COL3","COL4","COL5","COL6")))
m1 

#create two 2x3 matrices then add, subtract, multiply and divide the matrices
v1 = 1:6
m1 = matrix(v1,2,3)
m1
m2 = matrix(15:20,2,3)
m2

madd = m1+m2
madd

msub = m1-m2
msub

mmul = m1*m2
mmul

mdiv = m1/m2
mdiv


#access the element(s) of a given matrix
m = matrix(1:20,4,5)
m

#2nd row, 3rd column
m[2,3]
m

#access position 20
m[4,5]

#access whole 3rd row
m[3,]

#access whole 4th col
m[,4]


#concatenate two given matrices row-wise by 
#same number of columns but same/different number of rows
#with rbind().

m1 = matrix(1:6,2,3)
m1

m2 = matrix(1:12,4,3)
m2

m3 = rbind(m1,m2)
m3

#concatenate two given matrices column-wise by 
#same number of rows but same/different number of column
#with cbind().

m1 = matrix(1:6,2,3)
m1

m2 = matrix(1:4,2,2)
m2

m3 = cbind(m1,m2)
m3



#             Array

#array(data = NA, dim = length(data), dimnames = NULL)

#create an array of 3x3 matrices with one dimension using arrays

myArr = array(1:9,dim=c(3,3,1)) #(number of row,number of column,number of dimension)
myArr


#create an array with 3x4 matrices with 2 dimensional array()
myArr = array(1:24,dim=c(3,4,2))
myArr

myArr[3,3,1] #print number 9
myArr[2,2,2] #print number 17
myArr[,,2] #print the whole from second dimension


# Rename the rows, columns and matrix 
row_name = c("ROW1", "ROW2", "ROW3")
col_name = c("COL1", "COL2", "COL3", "COL4")
dim_name = c("MATRIX1", "MATIRX2")
myArr = array(1:24, dim = c(3, 4, 2),
              dimnames = list(row_name, col_name, dim_name))
myArr

myArr = array(1:24, dim = c(3, 4, 2), dimnames = list(c("ROW1", "ROW2", "ROW3"),
                                                      c("COL1", "COL2", "COL3", "COL4"),
                                                      c("MATRIX1", "MATIRX2")))
myArr


#Practice Problems
#1. Consider A=matrix(c(2,0,1,3), ncol=2) and B=matrix(c(5,2,4,-1), ncol=2).
# a) Find A + B
# b) Find A - B
#2. Find the solution for aA where a=3
#3. Find the solution for Ab,where b=c(7,4).
#4. Create three vectors v1,v2,v3 with integers and each vector has 3 elements.
# Combine the three vectors to become a 3?3 matrix( V)where each column represents
# a vector and name it. Check if V is a vector or matrix.
#5. Create a 5X2 two dimensional array with multiples of 5 values
#, , 1
# [,1] [,2]
#[1,] 0 25
#[2,] 5 30
#[3,] 10 35
#[4,] 15 40
#[5,] 20 45
#, , 2
# [,1] #[,2]
#[1,] 50 75
#[2,] 55 80
#[3,] 60 85
#[4,] 65 90
#[5,] 70 95

v4 = c(2,0,1,3)
A = matrix(v4,2,2)
A

v5= c(5,2,4,-1)
B = matrix(v5,2,2)
B

cadd = A+B
cadd

cmin = A-B
cmin

a = 3
aA = a*A
aA

b = c(7,4)
Ab = A*b
Ab

v1 = c(1,2,3)
v2 = c(4,5,6)
v3 = c(7,8,9)

mA = matrix(v1,3,1)
mA
mB = matrix(v2,3,1)
mB
mC = matrix(v3,3,1)
mC
mD = cbind(mA,mB,mC)
colnames(mD) = c("V1","V2","V3")
rownames(mD) = c("R1","R2","R3")
mD

data = seq(0,95, by=5)
myArr = array(data, dim = c(5, 2, 2),dimnames=)
myArr



