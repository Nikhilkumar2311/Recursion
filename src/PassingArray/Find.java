package PassingArray;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,10,6};
        int target = 4;
        System.out.println(find(arr, target, 0));
        System.out.println(findindex(arr, target, 0));
        System.out.println(findindexlast(arr,target, arr.length-1));

//        findAllindex(arr, target, 0);
//        System.out.println(list);

        //System.out.println(findAllindex(arr, 4, 0, new ArrayList<>()));

//        ArrayList<Integer> ans = findAllindex(arr,4,0,new ArrayList<>());
//        System.out.println(ans);

//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> ans = findAllindex(arr,4,0,list);
//        System.out.println(ans);
//        System.out.println(list);

        System.out.println(findAllindex2(arr,4,0));

    }

    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || find(arr, target, index+1);
    }

    static int findindex(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else {
            return findindex(arr, target, index+1);
        }
    }

    static int findindexlast(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else {
            return findindexlast(arr, target, index-1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllindex(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllindex(arr, target, index + 1);
    }

    static ArrayList<Integer> findAllindex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllindex(arr, target, index + 1, list);
    }

    // Arraylist is created inside the method
    static ArrayList<Integer> findAllindex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }

        // This will contain the answer for this function call only
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls =  findAllindex2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);
        return list;
    }
}
