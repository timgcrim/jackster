import java.util.*;

public class Algs{
    public static int[] method1(){
        int[] firstArray = new int[15];
        for (int i = 0; i<15; i++){
            firstArray[i] = (int)Math.pow(i,2);
        }
        return firstArray;
    }

    public static int method2(int[] set){
        int count = 0;
        for(int each:set){
            count += each;
        }
        return count/set.length;
    }

    public static int method3Above(int[] set){
        int count = 0;
        for(int each:set){
            if (each > 45){
            count += 1;
            }
        }
        return count;
    }

    public static int method3At(int[] set){
        int count = 0;
        for(int each:set){
            if (each == 45){
            count += 1;
            }
        }
        return count;
    }

    public static int[] method4(int[] set){
        int tempMax = 0;
        int tempMin = 0;
        for (int i = 0;i<set.length;i++){
            if(set[i]>set[tempMax]){
                tempMax = i;
            }
            if(set[i]<set[tempMin]){
                tempMin = i;
            }
        }
        return new int[] {set[tempMax],set[tempMin]};
    }

    public static BankAccount method5(){
        ArrayList<BankAccount> acctList = new ArrayList<BankAccount>();
        acctList.add(new BankAccount("Emilia Adelman", 1, 1000));		
        acctList.add(new BankAccount("Lance Borger", 2, 1000));
        acctList.add(new BankAccount("Darryl Petrillose", 3, 1000));
        acctList.add(new BankAccount("Guy Yao", 4, 1000));
        acctList.add(new BankAccount("Darryl Petrillose", 5, 1000));
        acctList.add(new BankAccount("Clayton Laguardia", 6, 1000));
        acctList.add(new BankAccount("Neva Ballentine", 7, 1000));
        acctList.add(new BankAccount("Eve Ryburn", 8, 1000));
        acctList.add(new BankAccount("Matthew Housand", 9, 1000));
        acctList.add(new BankAccount("Clinton Castaldo", 10, 1000));

        for (BankAccount each: acctList){
            if (each.getName().contains("guard")){
                return each;
            }
        }
        return new BankAccount("Null",0,0);
    }

    public static int method6(){
        ArrayList<BankAccount> acctList = new ArrayList<BankAccount>();
        acctList.add(new BankAccount("Emilia Adelman", 1, 1000));		
        acctList.add(new BankAccount("Lance Borger", 2, 1000));
        acctList.add(new BankAccount("Darryl Petrillose", 3, 1000));
        acctList.add(new BankAccount("Guy Yao", 4, 1000));
        acctList.add(new BankAccount("Darryl Petrillose", 5, 1000));
        acctList.add(new BankAccount("Clayton Laguardia", 6, 1000));
        acctList.add(new BankAccount("Neva Ballentine", 7, 1000));
        acctList.add(new BankAccount("Eve Ryburn", 8, 1000));
        acctList.add(new BankAccount("Matthew Housand", 9, 1000));
        acctList.add(new BankAccount("Clinton Castaldo", 10, 1000));

        for (int i = 0; i<=acctList.size();i++){
            if (acctList.get(i).getName().contains("guard")){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void method7(int[] intList, ArrayList<Integer> firstArray){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(Integer each:firstArray){
            newArray.add(each);
        }
        int[] newList = new int[intList.length];
        for(int i = 0; i<intList.length;i++){
            newList[i] = intList[i];
        }
    }

    //printList is basically method 8

    public static int[] method9(int add, int index, int[] targetList){
        int[] newList = new int[targetList.length+1];
        for(int i = 0; i<targetList.length;i++){
            if (i == index){
                newList[i] = add;
            }
            else if (i > index){
                newList[i+1] = targetList[i];
            }
            else{
                newList[i] = targetList[i];
            }
        }
        return newList;
    }

    public static void printList(int[] list){
        System.out.print('[');
        for (int each: list){
            System.out.print(each+", ");
        }
        System.out.print(']');
    }

    public static void main(String[] args){
        int[] set = {43,45,43,40,41,45,43,45,42,43,40,47,45,38,32,34,58,66,56,54,58,54,53,55,50,50,53,54,50,54,53};
        printList(method1());
        System.out.println(' ');
        System.out.println(' ');
        System.out.println(method2(set));
        System.out.println(' ');
        System.out.println(method3Above(set));
        System.out.println(method3At(set));
        System.out.println(' ');
        printList(method4(set));
        System.out.println(' ');
        System.out.println(' ');
        System.out.println(method5());
        System.out.println(' ');
        System.out.println(method6());
    }
    
}