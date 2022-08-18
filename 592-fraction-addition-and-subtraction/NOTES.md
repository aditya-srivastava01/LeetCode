for(int i=0;i<n;i++){
if(s[i]=='-' || s[i]=='+'){
ope_ope_no_mi.add(s[i]+"");
if(s[i+2]=='/'){
num.add(s[i+1]-'0');
denom.add(s[i+3]-'0');
}else{
num.add(Intger.valueOf(s[i+1]+s[i+2]));
denom.add(s[i+4]-'0');
}
i+=4;
}else{
if(i-1>=0){
ope_ope_no_mi.add(s[i-1]+"");
}else{
ope_ope_no_mi.add("+");
}
​
num.add(s[i]-'0');
denom.add(s[i+2]-'0');
i+=3;
}
}