let arr = [23, 56, 4, 78, 5, 63, 45, 210, 56];
let ele = 56;
function deleteOccur(arr, ele) {
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] == ele) {
      arr.splice(i, 1); //Delete element from array
      i--;
    }
  }
  return arr;
}
