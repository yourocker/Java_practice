package tasks.Core4Files;

import java.io.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Animal[] massive = {new Animal("cat"), new Animal("dog")};
        byte[] animals = serializeAnimals(massive);
        Animal[] newmas = deserializeAnimalArray(animals);
        for (Animal i : newmas) {
            System.out.println(i.getName());
        }
    }

    public static byte[] serializeAnimals(Animal[] animals) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (ObjectOutputStream objectOutputStream =
                     new ObjectOutputStream(byteArrayOutputStream)) {
            objectOutputStream.writeInt(animals.length);
            for (int i = 0; i < animals.length; i++) {
                objectOutputStream.writeObject(animals[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return byteArrayOutputStream.toByteArray();
    }

public static Animal[] deserializeAnimalArray(byte[] data) {
    try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
        Animal[] result = new Animal[ois.readInt()];
        for (int i = 0; i < result.length; i++) {
            result[i] = (Animal) ois.readObject();
        }
        return result;
    } catch (ArrayIndexOutOfBoundsException | NegativeArraySizeException | ClassNotFoundException |  ClassCastException | IOException exception) {
        throw new IllegalArgumentException();
    }
    }

//    public static Animal[] deserializeAnimalArray(byte[] data) {
//        Animal[] result;
//        try {
//            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
//            int size = ois.readInt();
//            result = new Animal[size];
//            for (int i = 0; i < size; i++) {
//                result[i] = (Animal) ois.readObject();
//                if (result[i] == null) {
//                    throw new IllegalArgumentException();
//                }
//            }
//        } catch (Exception e) {
//            throw new IllegalArgumentException();
//        }
//        return result;
//    }
}

class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }

    public String getName() {
        return name;
    }
}
