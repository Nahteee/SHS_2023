# DATA VISUALISATION

install.packages("ggplot2")

library(ggplot2)

#pie
a=c(10,20,30)
b=c("Apple","Banana","Orange")
pie(a,b)

#with radius
pie(a,b,radius=1)

#with title
pie(a,b,radius=1,main="Fruits_list")

#with color
pie(a,b,radius=1,main="Fruits_list",col=c("green","blue","red"))

#with direction
pie(a,b,radius=1,main="Fruits_list",col=c("green","blue","red"),clockwise = TRUE)

#syntax
#pie(values,labels,radius,title,color,direction)

#pie3d
library(plotrix)
pie3D(a)
pie3D(a,labels=b)






