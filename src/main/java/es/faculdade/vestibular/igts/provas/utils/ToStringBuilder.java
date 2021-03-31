package es.faculdade.vestibular.igts.provas.utils;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ToStringBuilder {
	
	public static String build(Object object) throws Exception {
		StringBuilder builder = new StringBuilder();
		
		if(object != null ) {
			Class<? extends Object> clazz = object.getClass();
			Field[] fields = clazz.getDeclaredFields();
			if(fields!=null) {
				AccessibleObject.setAccessible(fields, true);
				appendFields(builder,fields,object);
			}
		}
		
		return builder.toString();
	}

	private static void appendFields(StringBuilder builder, Field[] fields, Object object) throws IllegalArgumentException, IllegalAccessException {
		Class<? extends Object> clazz = object.getClass();
		for(int i=0; i<fields.length; i++) {
			Field f = fields[i];
			if(Modifier.isStatic(f.getModifiers())) {
			continue;
		}
		
		Object value = f.get(object);
		if(!f.getName().equalsIgnoreCase("class")) {
			
			builder.append(clazz.getSimpleName());
			builder.append(".");
			builder.append(f.getName());
			builder.append(": ");
			builder.append(String.valueOf(value));
			builder.append("\n");
		}
	}
	}
}
