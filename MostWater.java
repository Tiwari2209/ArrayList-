import java.util.ArrayList;
public class MostWater {
    public static int storeWater(ArrayList<Integer>height){
        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;
        while(lp < rp){
            int ht = Math.min(height.get(lp),height.get(rp));
            int width = rp-lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater,currWater);
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static boolean pairSum(ArrayList<Integer>list,int target){

        
        int lp = 0;
        int rp = list.size()-1;
        while(lp != rp){
            if(list.get(lp)+list.get(rp) == target){
                return true;
            }
            if(list.get(lp)+list.get(rp) < target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        
        System.out.println(pairSum(list, 8));
    }
}
