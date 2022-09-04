package Generics;

import java.util.Random;
import java.util.Arrays;

public class MagicBox<T> {
    protected T[] obj;
    protected Random random = new Random();

    MagicBox(int size) {
        obj = (T[]) new Object[size];
    }

    public boolean add(T item) {
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] == null) {
                obj[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() throws RuntimeException {

        for (int i = 0; i < obj.length; i++) {
            if (obj[i] == null) {
                throw new RuntimeException("The box is not full:" + (obj.length - i) + " need to full");
            }
        }
        int randomInt = random.nextInt(obj.length);
        return obj[randomInt];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
