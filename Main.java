import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //************Q1***************************
     /* String[] arr = {"cat", "dog", "red", "is", "am"};
            String pointer = arr[0];
            int maxLength = 0;
            
            for (String loop : arr) {
                if (loop.length() > maxLength) {
                    maxLength = loop.length();
                }
            }
            List<String> longestWords = new ArrayList<>();
            for (String loop : arr) {
                if (loop.length() == maxLength) {
                    longestWords.add(loop);
                }
            }
            
            for (String word : longestWords) {
                System.out.print(word + " ");
            }*/

//*****************Q2************************
        /*Scanner input=new Scanner(System.in);
        System.out.println(" inter number you want see the occurrences ");
        int num=input.nextInt();
       int []arry={1,1,1,3,3,5};
       int count=0;
      for(int i:arry) {
          if (num == i) {
              count++;
          }
      }System.out.println(num+" occurs "+ count  +" times");
      */
//*****************Q3************************

       /* Scanner input=new Scanner(System.in)  ;
        System.out.println("inter the largest number you want print :");
        int k=input.nextInt();

       int []arr={1, 4, 17, 7, 25, 3, 100};
       if (k > arr.length) {
            System.out.println("The requested number exceeds the array length ");
            return;
        }
       Arrays.sort(arr);
        System.out.println(k + " largest elements of the given array are:");
        for (int i = arr.length - 1; i >= arr.length - k; i--) {
            System.out.print(arr[i] + " ");
        }*/

//*****************Q4************************
        /*int[] arr = {1, 4, 17, 7, 25, 3, 100};
        System.out.println("Original array: " + Arrays.toString(arr));

        reverseArray(arr);

        System.out.println("Reversed array: " + Arrays.toString(arr));*/

//****************Q5************************
        /*Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Accept elements of an array");
            System.out.println("2. Display elements of an array");
            System.out.println("3. Search the element within array");
            System.out.println("4. Sort the array");
            System.out.println("5. To Stop");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    acceptElements(arr, input);
                    break;
                case 2:
                    displayElements(arr);
                    break;
                case 3:
                    searchElement(arr, input);
                    break;
                case 4:
                    sortArray(arr);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }*/
//*****************Q6************************
        /*Scanner input = new Scanner(System.in);
        System.out.print("Enter the minimum value of the range: ");
        int min = input.nextInt();

        System.out.print("Enter the maximum value of the range: ");
        int max = input.nextInt();

        System.out.print("Enter the number of random numbers to generate: ");
        int count = input.nextInt();

        System.out.println("Random numbers within the specified range:");
        randomNumbers(min, max, count);*/


//*****************Q7************************
       /* Scanner input = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = input.nextLine();

        int totalScore = calculateTotal(password);

        System.out.println("Password strength score: " + totalScore);
        classifyPassword(totalScore);*/

//*****************Q8************************
       /* Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci terms to generate: ");
        int terms = input.nextInt();

        System.out.println("Fibonacci sequence with " + terms + " terms:");
       fibonacci(terms);*/

    }


// Method Q4:

   /* private static void reverseArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            // Swap elements
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }*/

// Method Q5:
/*public static void acceptElements(int[] arr, Scanner input) {
    System.out.println("Enter elements of the array:");
    for (int i = 0; i < arr.length; i++) {
        System.out.print("Element " + (i + 1) + ": ");
        arr[i] = input.nextInt();
    }
}
    public static void displayElements(int[] arr) {
        System.out.println("Elements of the array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void searchElement(int[] arr, Scanner input) {
        System.out.print("Enter the element to search: ");
        int key = input.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element " + key + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element " + key + " not found in the array.");
        }
    }

    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Array has been sorted.");
    }*/

    //Method Q6:
    /*public static void randomNumbers(int min, int max, int count) {
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt((max - min) + 1) + min;
            System.out.print(randomNumber);
            if (i < count - 1) {
                System.out.print(" - ");
            }
        }
    }*/
     //Metiod Q7:
    /*public static int calculateTotal(String password) {
        return checkLength(password) + checkSpecialCharacters(password) + checkUpperCaseLowerCase(password);
    }

    public static int checkLength(String password) {
        int length = password.length();
        return length >= 8 ? 3 : length >= 6 ? 2 : 0;
    }

    public static int checkSpecialCharacters(String password) {
        return password.matches(".*[!@#$%^&*()-+=<>?].*") ? 2 : 0;
    }

    public static int checkUpperCaseLowerCase(String password) {
        boolean hasUpperCase = password.matches(".*[A-Z].*");
        boolean hasLowerCase = password.matches(".*[a-z].*");
        return (hasUpperCase && hasLowerCase) ? 3 : 0;
    }

    public static void classifyPassword(int score) {
        if (score >= 8) {
            System.out.println("Password is strong");
        } else if (score >= 5) {
            System.out.println("Password is moderately strong");
        } else {
            System.out.println("Password is weak");
        }
    }*/

    //Method Q8 :
    /*public static void fibonacci(int terms) {
        if (terms <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int first = 0, second = 1;

        for (int i = 0; i < terms; i++) {
            if (i == 0) {
                System.out.print(first + " ");
            } else if (i == 1) {
                System.out.print(second + " ");
            } else {
                int next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
        }
    }*/

}
