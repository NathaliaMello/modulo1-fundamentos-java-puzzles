package br.com.unipds.javapuzzles.reflection;

import br.com.unipds.javapuzzles.anotacao.Visible;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassExplorer {

    public static void exploreMetadata(Object o) throws Exception {
        System.out.println("------> Extraindo atributos");
        for (Field f : o.getClass().getDeclaredFields()) {
            System.out.println(f.getName() + ": " + f.getType().getName());
        }
        System.out.println("------> Extraindo Métodos");
        for (Method m : o.getClass().getDeclaredMethods()) {
            System.out.println(m.getName() + ": " + m.getReturnType().getName());
        }
        System.out.println("------> Extraindo Dados");
        for (Field f : o.getClass().getDeclaredFields()) {
            f.setAccessible(true);
            System.out.println(f.get(o));
            f.setAccessible(false);
        }
        System.out.println("------> Extraindo por execução de Mátodo");
        for (Method m : o.getClass().getDeclaredMethods()) {
            if (m.getName().startsWith("get")) {
                System.out.println(m.getName() + "- valor: " + m.invoke(o));
            }
        }
        System.out.println("------> Extraindo Dados Com anotação");
        for (Field f : o.getClass().getDeclaredFields()) {
            if (f.isAnnotationPresent(Visible.class)) {
                f.setAccessible(true);
                System.out.println("Filed visível: " + f.getName() + ": " + f.get(o));
                f.setAccessible(false);
            } else {
                System.out.println("Field invisível: " + f.getName());
            }
        }

    }
}
