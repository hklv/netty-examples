package com.ustcinfo.rpc.protocol;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

public class JavaDecoder implements Decoder{

	public Object decode(String className,byte[] bytes) throws Exception {
		ObjectInputStream objectIn = new ObjectInputStream(new ByteArrayInputStream(bytes));
		Object resultObject = objectIn.readObject();
		objectIn.close();
		return resultObject;
	}

}
