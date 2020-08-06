package top.xinzhang0618.springboot.demo.effective;

import java.util.HashMap;
import java.util.Map;

/**
 * Favorites
 *
 * @author gavin
 * @version 2020/7/18
 */
public class Favorites {

    private Map<Class<?>, Object> favorites = new HashMap<>();

    public <T> void putFavorites(Class<T> type, T instance) {
        if (type == null) {
            throw new NullPointerException("type is null!");
        }
        // 如果放入的实例不是type类型的, 会报ClassCastException
        favorites.put(type, type.cast(instance));
    }

    public <T> T getFavorites(Class<T> type) {
        return type.cast(favorites.get(type));
    }
}
