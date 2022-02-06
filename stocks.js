function siva(arrays){
let one=2**31-1;
let two=0;
let three=0;
for(let i=0;i<arrays.length;i++){
if(arrays[i]<one){
one=arrays[i]
}
two=arrays[i]-one;
if(three<two){
three=two;
}
}
return three;
}
let bunch=[7,6,4,3,1]
let five=siva(bunch)
console.log(five)