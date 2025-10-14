import java.util.*;

public class FiniteField {
    private int p;
    private int[] field;
    public FiniteField(int p){
        this.p=p;
        this.field = new int[p];
        for(int i=0;i<p;i++){
            this.field[i]=i;
        }
    }

    public int[] getField(){
        return this.field;
    }

    public long getRandomElem(){
        int rnd = new Random().nextInt(this.field.length);
        return this.field[rnd];
    }

    public int[] removeDuplicates(int[] array){
        Arrays.sort(array);

        int current = array[0];
        boolean found = false;
        String str="";
        for(int i = 0; i < array.length; i++) {
            if (current == array[i] && !found) {
                found = true;
            } else if (current != array[i]) {
                str+=current+" ";
                current = array[i];
                found = false;
            }
        }
        str+=current+" ";

        String[] tempStrArray = str.split(" ");
        int[] intArray = new int[tempStrArray.length];
        for(int i=0;i < tempStrArray.length;i++){
            intArray[i]=Integer.parseInt(tempStrArray[i]);
        }

        return intArray;
    }

    public boolean quadraticResidueCheck(int num){
        boolean isInArray=false;

        int[] tempArray = new int[this.p];
        for(int i=0;i<this.field.length;i++){
            tempArray[i] = (int) Main.modulo((int)Math.pow(this.field[i],2),this.p);
        }

        int[] squares = removeDuplicates(tempArray);

        for(int i=0;i < squares.length;i++){
            if(num==squares[i]){
                isInArray=true;
                break;
            }
        }

        return isInArray;
    }
}
