package professional.p03;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class SimpleWeakHashMap {
    public static void main(String[] args) {
        // strong reference
//        Integer test = 1; //сильная ссылка. любой объект имеющий сильную ссылку, указывающую на него не имеет права на ГК

        // soft reference
//        SoftReference<Integer> softReference = new SoftReference<>(test); //мягкая ссылка

        // weak reference
//        WeakReference<Integer> weakReference = new WeakReference<>(test);

        // если помечаем основной объект null, ГК не будет ждать когда понадобится память
//        test = null;

        // phantom reference
//        PhantomReference<Integer> phantomReference = new PhantomReference<>(test, new ReferenceQueue<>());
        // когда объект, доступный с помощью ссылки удаляется, сам объект ссылки становится доступным в очереди ReferenceQueue
        // Этот механизм позволяет удалять пустые ссылки

        Map<String, String> weakHashMap = new WeakHashMap<>();
        Map<String, String> hashMap = new HashMap<>();

        String  keyWeakHashMap = new String("keyWeakHashMap");
        String  keyHashMap =  new String("keyHashMap");

        weakHashMap.put(keyWeakHashMap, "weakHash");
        hashMap.put(keyHashMap, "Hash");

        System.out.println("Before gc, weak = " + weakHashMap.get("keyWeakHashMap") + ", hash = " + hashMap.get("keyHashMap"));

        keyWeakHashMap = null;
        keyHashMap = null;
        System.gc();

        System.out.println("After gc, weak = " + weakHashMap.get("keyWeakHashMap") + ", hash = " + hashMap.get("keyHashMap"));
    }
}
