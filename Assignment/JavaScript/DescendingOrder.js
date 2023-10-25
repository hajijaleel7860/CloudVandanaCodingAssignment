<!DOCTYPE html>
<html>
<head>
  
  <title>DescendingOrder</title>
</head>
<body>
  
  <script>
    var arr=[2,7,9,4,6,8,3];

for(var i=0;i<arr.length;i++)
{
for(var j=0;j<arr.length;j++)
{
if(arr[i]>arr[j])
{
 var temp=arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
}
}
//displaying elements
for(var i=0;i<arr.length;i++)
{
console.log(arr[i]+" ");
}
  </script>
</body>
</html>