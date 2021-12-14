public class cleanCode {

        static class checkNumber {  //static class

            int SmallestNumber;
            int LargestNumber;
        }

        //Method to find the largest and smallest number from a given array
        static checkNumber findLargestSmallest(int[] arrayGiven, int sizeOfArray){
            checkNumber objectOfCheck = new checkNumber();

            int i;

            if (sizeOfArray == 1) {
                objectOfCheck.LargestNumber = arrayGiven[0];
                objectOfCheck.SmallestNumber = arrayGiven[0];
                return objectOfCheck;
            }

            if (arrayGiven[0] > arrayGiven[1]) {
                objectOfCheck.LargestNumber = arrayGiven[0];
                objectOfCheck.SmallestNumber = arrayGiven[1];
            }

            else {
                objectOfCheck.LargestNumber = arrayGiven[1];
                objectOfCheck.SmallestNumber = arrayGiven[0];
            }

            for (i = 2; i < sizeOfArray; i++) {
                if (arrayGiven[i] > objectOfCheck.LargestNumber)
                {
                    objectOfCheck.LargestNumber = arrayGiven[i];
                }
                else if (arrayGiven[i] < objectOfCheck.SmallestNumber)
                {
                    objectOfCheck.SmallestNumber = arrayGiven[i];
                }
            }

            return objectOfCheck;
        }

        //Main method
        public static void main(String[] args) {
            int [] arrayGiven = {1000, 11, 445, 1, 330, 3000}; //Given array of elements
            int sizeOfArray = 6;
            checkNumber objectOfCheck = findLargestSmallest(arrayGiven, sizeOfArray);//Calling of the method

            //Printing arrayGiven
            System.out.printf("\n Given array : ");
            for(int i=0;i<sizeOfArray;i++){
                System.out.printf(arrayGiven[i]+" ");
            }

            //Printing the smallest and largest number
            System.out.printf("\n Smallest Number in array : %d", objectOfCheck.SmallestNumber);
            System.out.printf("\n Largest Number in array : %d", objectOfCheck.LargestNumber);
        }
    }

