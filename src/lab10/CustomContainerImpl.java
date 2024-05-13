package lab10;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class CustomContainerImpl implements CustomContainer {
    private final Map<String, Object> instances = new HashMap<>();
    private final Map<String, Function<CustomContainer, ?>> factoryMethods = new HashMap<>();
    @Override
    public <T> boolean addInstance(T instance) {
        if (instance == null) {
            throw new RuntimeException("Null is not allowed as a parameter");
        }
        else if (instances.containsKey(instance.getClass().getName())) {
            throw new RuntimeException("Instances cannot be redeclared");
        }
        else {
            instances.put(instance.getClass().getName(), instance);
            return true;
        }
    }

    @Override
    public <T> boolean addInstance(T instance, String customName) {
        if (instance == null || customName == null) {
            throw new RuntimeException("Null is not allowed as a parameter");
        }
        else if (instances.containsKey(customName)) {
            throw new RuntimeException("Instances cannot be redeclared");
        }
        else {
            instances.put(customName, instance);
            return true;
        }
    }

    @Override
    public <T> T getInstance(Class<T> type) {
        if (type == null) {
            throw new RuntimeException("Null is not allowed as a parameter");
        }
        else if (!instances.containsKey(type.getName())) {
            try {
                T instance = type.getDeclaredConstructor().newInstance();
                addInstance(instance);
                return instance;
            } catch (Exception e) {
                throw new RuntimeException("Cannot provide instance", e);
            }
        }
        else {
            return (T) instances.get(type.getName());
        }
    }

    @Override
    public <T> T getInstance(Class<T> type, String customName) {
        if (type == null || customName == null) {
            throw new RuntimeException("Null is not allowed as a parameter");
        }
        else if (!instances.containsKey(customName)) {
            try {
                T instance = type.getDeclaredConstructor().newInstance();
                addInstance(instance, customName);
                return instance;
            } catch (Exception e) {
                throw new RuntimeException("Cannot provide instance");
            }
        }
        else if (!instances.get(customName).getClass().getName().equals(type.getName())) {
            throw new RuntimeException("Invalid type for object");
        }
        else {
            return (T) instances.get(customName);
        }
    }

    @Override
    public <T> boolean addFactoryMethod(Class<T> type, Function<CustomContainer, T> factoryMethod) {
        if (type == null || factoryMethod == null) {
            throw new RuntimeException("Null is not allowed as a parameter");
        }
        else if (factoryMethods.containsKey(type.getName())) {
            throw new RuntimeException("Instances cannot be redeclared");
        }
        else {
            factoryMethods.put(type.getName(), factoryMethod);
            return true;
        }
    }

    @Override
    public <T> T create(Class<T> type) {
        if (type == null) {
            throw new RuntimeException("Null is not allowed as a parameter");
        }
        else if (!instances.containsKey(type.getName())) {
            throw new RuntimeException("Cannot provide instance");
        }
        else {
            return (T) instances.get(type.getName());
        }
    }

    @Override
    public <T> T create(Class<T> type, Map<String, Object> parameters) {
        if (type == null || parameters == null) {
            throw new RuntimeException("Null is not allowed as a parameter");
        }
        else if (!factoryMethods.containsKey(type.getName())) {
            throw new RuntimeException("Cannot provide instance");
        }
        else {
            Function<CustomContainer, T> factoryMethod = (Function<CustomContainer, T>) factoryMethods.get(type.getName());
            CustomContainer tempContainer = new CustomContainerImpl();
            parameters.forEach((key, value) -> tempContainer.addInstance(value, key));
            return factoryMethod.apply(tempContainer);
        }
    }

    @Override
    public void close() throws Exception {
        for (Object instance : instances.values()) {
            if (instance instanceof AutoCloseable) {
                ((AutoCloseable) instance).close();
            }
        }
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Am ramas la Task 4