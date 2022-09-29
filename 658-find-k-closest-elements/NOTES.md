Line 19: error: no suitable method found for sort(int[],(a,b)->a - b)
Arrays.sort(arr,(a,b)->a-b);
^
method Arrays.<T#1>sort(T#1[],Comparator<? super T#1>) is not applicable
(inference variable T#1 has incompatible bounds
equality constraints: int
lower bounds: Object)
method Arrays.<T#2>sort(T#2[],int,int,Comparator<? super T#2>) is not applicable
(cannot infer type-variable(s) T#2
(actual and formal argument lists differ in length))
where T#1,T#2 are type-variables:
T#1 extends Object declared in method <T#1>sort(T#1[],Comparator<? super T#1>)
T#2 extends Object declared in method <T#2>sort(T#2[],int,int,Comparator<? super T#2>)
Line 21: error: incompatible types: missing return value
return ;
^
2 errors